
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.sanclemente.BaseDatos;
import com.sanclemente.BaseDatosMemoria;
import com.sanclemente.Logger;
import com.sanclemente.LoggerDecorator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;



public class TestBaseDatosConLogger {
	private Logger logger = new Logger();
	private BaseDatos sinLogger = new BaseDatosMemoria();
	private BaseDatos bbdd;
	
	@Before
	public void init() {
		bbdd = new LoggerDecorator(logger, sinLogger);
	}
	
	// de este test no hay que modificar nada
	@Test
	public void test_logger_decorator() {
		assertNotNull("falta inicializar bbdd en el metodo init()",this.bbdd);
		assertFalse("logger no esta vacio",this.logger.obtener().contains("inserta entrada"));
		this.bbdd.inserta("entrada");
		
		assertTrue("bbdd no ha recibido entrada", this.sinLogger.registros().contains("entrada"));
		assertTrue("no se ha registrado la entrada", this.logger.obtener().contains("inserta entrada"));

		// lectura con el adapter con logger
		List<String> registros = this.bbdd.registros();
		
		assertTrue("el adapter no tiene la nueva entrada", registros.contains("entrada"));
		assertTrue("no se ha registrado la lectura", this.logger.obtener().contains("lectura"));
	}
}