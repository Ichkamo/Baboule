package baboule;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import baboule.Bonus;
import baboule.Principale;
import baboule.Table;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.mockito.expectation.PowerMockitoStubber;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.JLabel;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class PrincipaleTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @PrepareForTest({Thread.class, Principale.class})
  @Test
  public void constructorInputNotNullOutputVoid() throws Exception {

    // Arrange
    final Table tableVerte = new Table();
    Reflector.setField(tableVerte, "nulbonul", 0);
    tableVerte.bonuss = null;
    tableVerte.joueurY = 0;
    tableVerte.perdu = false;
    tableVerte.kelbonus = null;
    tableVerte.highscore = 0;
    tableVerte.joueurX = 0;
    tableVerte.score = 0;
    tableVerte.mechants = null;
    tableVerte.level = 0;
    tableVerte.sc0re = 0;
    Reflector.setField(tableVerte, "label", null);
    tableVerte.nivo = 0;
    final Thread thread = PowerMockito.mock(Thread.class);
    PowerMockito.whenNew(Thread.class)
        .withParameterTypes(Runnable.class)
        .withArguments(or(isA(Runnable.class), isNull(Runnable.class)))
        .thenReturn(thread);

    // Act, creating object to test constructor
    final Principale actual = new Principale(tableVerte);
  }

  // Test written by Diffblue Cover.
  @Test
  public void mouseDraggedInputNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    Reflector.setField(principale, "table", null);

    // Act
    principale.mouseDragged(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void mouseDraggedInputNotNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    Reflector.setField(principale, "table", null);
    final MouseEvent ÈvÈnement = PowerMockito.mock(MouseEvent.class);

    // Act
    principale.mouseDragged(ÈvÈnement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, MouseEvent.class})
  @Test
  public void mouseMovedInputNotNullOutputVoid13() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final MouseEvent evenement = PowerMockito.mock(MouseEvent.class);
    final Method getYMethod = DTUMemberMatcher.method(MouseEvent.class, "getY");
    PowerMockito.doReturn(134_217_728).when(evenement, getYMethod).withNoArguments();
    final Method getXMethod = DTUMemberMatcher.method(MouseEvent.class, "getX");
    PowerMockito.doReturn(481).when(evenement, getXMethod).withNoArguments();

    // Act
    principale.mouseMoved(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, MouseEvent.class})
  @Test
  public void mouseMovedInputNotNullOutputVoid12() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final MouseEvent evenement = PowerMockito.mock(MouseEvent.class);
    final Method getYMethod = DTUMemberMatcher.method(MouseEvent.class, "getY");
    PowerMockito.doReturn(496).when(evenement, getYMethod).withNoArguments();
    final Method getXMethod = DTUMemberMatcher.method(MouseEvent.class, "getX");
    PowerMockito.doReturn(480).when(evenement, getXMethod).withNoArguments();

    // Act
    principale.mouseMoved(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, MouseEvent.class})
  @Test
  public void mouseMovedInputNotNullOutputVoid11() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final MouseEvent evenement = PowerMockito.mock(MouseEvent.class);
    final Method getYMethod = DTUMemberMatcher.method(MouseEvent.class, "getY");
    PowerMockito.doReturn(496).when(evenement, getYMethod).withNoArguments();
    final Method getXMethod = DTUMemberMatcher.method(MouseEvent.class, "getX");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(evenement, getXMethod)
        .withNoArguments();

    // Act
    principale.mouseMoved(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, MouseEvent.class})
  @Test
  public void mouseMovedInputNotNullOutputVoid10() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final MouseEvent evenement = PowerMockito.mock(MouseEvent.class);
    final Method getYMethod = DTUMemberMatcher.method(MouseEvent.class, "getY");
    PowerMockito.doReturn(480).when(evenement, getYMethod).withNoArguments();
    final Method getXMethod = DTUMemberMatcher.method(MouseEvent.class, "getX");
    PowerMockito.doReturn(481).when(evenement, getXMethod).withNoArguments();

    // Act
    principale.mouseMoved(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, MouseEvent.class})
  @Test
  public void mouseMovedInputNotNullOutputVoid9() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final MouseEvent evenement = PowerMockito.mock(MouseEvent.class);
    final Method getYMethod = DTUMemberMatcher.method(MouseEvent.class, "getY");
    PowerMockito.doReturn(131_072).when(evenement, getYMethod).withNoArguments();
    final Method getXMethod = DTUMemberMatcher.method(MouseEvent.class, "getX");
    PowerMockito.doReturn(481).when(evenement, getXMethod).withNoArguments();

    // Act
    principale.mouseMoved(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, MouseEvent.class})
  @Test
  public void mouseMovedInputNotNullOutputVoid5() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final MouseEvent evenement = PowerMockito.mock(MouseEvent.class);
    final Method getYMethod = DTUMemberMatcher.method(MouseEvent.class, "getY");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(evenement, getYMethod)
        .withNoArguments();
    final Method getXMethod = DTUMemberMatcher.method(MouseEvent.class, "getX");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(evenement, getXMethod)
        .withNoArguments();

    // Act
    principale.mouseMoved(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, MouseEvent.class})
  @Test
  public void mouseMovedInputNotNullOutputVoid7() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final MouseEvent evenement = PowerMockito.mock(MouseEvent.class);
    final Method getYMethod = DTUMemberMatcher.method(MouseEvent.class, "getY");
    ((PowerMockitoStubber)PowerMockito.doReturn(-2_147_483_167).doReturn(480))
        .when(evenement, getYMethod)
        .withNoArguments();
    final Method getXMethod = DTUMemberMatcher.method(MouseEvent.class, "getX");
    ((PowerMockitoStubber)PowerMockito.doReturn(448).doReturn(481))
        .when(evenement, getXMethod)
        .withNoArguments();

    // Act
    principale.mouseMoved(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, MouseEvent.class})
  @Test
  public void mouseMovedInputNotNullOutputVoid6() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final MouseEvent evenement = PowerMockito.mock(MouseEvent.class);
    final Method getYMethod = DTUMemberMatcher.method(MouseEvent.class, "getY");
    ((PowerMockitoStubber)PowerMockito.doReturn(-2_147_483_167).doReturn(480))
        .when(evenement, getYMethod)
        .withNoArguments();
    final Method getXMethod = DTUMemberMatcher.method(MouseEvent.class, "getX");
    PowerMockito.doReturn(481).when(evenement, getXMethod).withNoArguments();

    // Act
    principale.mouseMoved(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, MouseEvent.class})
  @Test
  public void mouseMovedInputNotNullOutputVoid8() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final MouseEvent evenement = PowerMockito.mock(MouseEvent.class);
    final Method getYMethod = DTUMemberMatcher.method(MouseEvent.class, "getY");
    PowerMockito.doReturn(481).when(evenement, getYMethod).withNoArguments();
    final Method getXMethod = DTUMemberMatcher.method(MouseEvent.class, "getX");
    PowerMockito.doReturn(481).when(evenement, getXMethod).withNoArguments();

    // Act
    principale.mouseMoved(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, MouseEvent.class})
  @Test
  public void mouseMovedInputNotNullOutputVoid4() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final MouseEvent evenement = PowerMockito.mock(MouseEvent.class);
    final Method getYMethod = DTUMemberMatcher.method(MouseEvent.class, "getY");
    PowerMockito.doReturn(481).when(evenement, getYMethod).withNoArguments();
    final Method getXMethod = DTUMemberMatcher.method(MouseEvent.class, "getX");
    PowerMockito.doReturn(481).when(evenement, getXMethod).withNoArguments();

    // Act
    principale.mouseMoved(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, MouseEvent.class})
  @Test
  public void mouseMovedInputNotNullOutputVoid10() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final MouseEvent evenement = PowerMockito.mock(MouseEvent.class);
    final Method getYMethod = DTUMemberMatcher.method(MouseEvent.class, "getY");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(evenement, getYMethod)
        .withNoArguments();
    final Method getXMethod = DTUMemberMatcher.method(MouseEvent.class, "getX");
    PowerMockito.doReturn(481).when(evenement, getXMethod).withNoArguments();

    // Act
    principale.mouseMoved(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void mouseMovedInputNotNullOutputVoid2() throws InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = true;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final MouseEvent evenement = PowerMockito.mock(MouseEvent.class);

    // Act
    principale.mouseMoved(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, MouseEvent.class})
  @Test
  public void mouseMovedInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final MouseEvent evenement = PowerMockito.mock(MouseEvent.class);
    final Method getYMethod = DTUMemberMatcher.method(MouseEvent.class, "getY");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(evenement, getYMethod)
        .withNoArguments();
    final Method getXMethod = DTUMemberMatcher.method(MouseEvent.class, "getX");
    ((PowerMockitoStubber)PowerMockito.doReturn(0).doReturn(0))
        .when(evenement, getXMethod)
        .withNoArguments();

    // Act
    principale.mouseMoved(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void mouseMovedInputNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = true;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);

    // Act
    principale.mouseMoved(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, MouseEvent.class})
  @Test
  public void mouseMovedInputNotNullOutputVoid14() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final MouseEvent evenement = PowerMockito.mock(MouseEvent.class);
    final Method getYMethod = DTUMemberMatcher.method(MouseEvent.class, "getY");
    PowerMockito.doReturn(482).when(evenement, getYMethod).withNoArguments();
    final Method getXMethod = DTUMemberMatcher.method(MouseEvent.class, "getX");
    ((PowerMockitoStubber)PowerMockito.doReturn(-2_139_095_040).doReturn(0))
        .when(evenement, getXMethod)
        .withNoArguments();

    // Act
    principale.mouseMoved(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void keyPressedInputNotNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    Reflector.setField(principale, "table", null);
    final KeyEvent evenement = PowerMockito.mock(KeyEvent.class);

    // Act
    principale.keyPressed(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void keyPressedInputNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    Reflector.setField(principale, "table", null);

    // Act
    principale.keyPressed(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void keyReleasedInputNullOutputVoid3() throws InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);

    // Act
    principale.keyReleased(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void keyReleasedInputNullOutputVoid1() throws InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 1;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);

    // Act
    principale.keyReleased(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void keyReleasedInputNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 1;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);

    // Act
    principale.keyReleased(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, KeyEvent.class})
  @Test
  public void keyReleasedInputNotNullOutputVoid11() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = true;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final KeyEvent evenement = PowerMockito.mock(KeyEvent.class);
    final Method getKeyCodeMethod = DTUMemberMatcher.method(KeyEvent.class, "getKeyCode");
    PowerMockito.doReturn(0).when(evenement, getKeyCodeMethod).withNoArguments();

    // Act
    principale.keyReleased(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, Table.class, KeyEvent.class, JLabel.class})
  @Test
  public void keyReleasedInputNotNullOutputVoid1() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = true;
    table.kelbonus = null;
    table.highscore = 1;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 1;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final KeyEvent evenement = PowerMockito.mock(KeyEvent.class);
    final Method getKeyCodeMethod = DTUMemberMatcher.method(KeyEvent.class, "getKeyCode");
    PowerMockito.doReturn(10).when(evenement, getKeyCodeMethod).withNoArguments();

    // Act
    principale.keyReleased(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, Table.class, KeyEvent.class, JLabel.class})
  @Test
  public void keyReleasedInputNotNullOutputVoid9() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    arrayList.add(null);
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = true;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 1;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final KeyEvent evenement = PowerMockito.mock(KeyEvent.class);
    final Method getKeyCodeMethod = DTUMemberMatcher.method(KeyEvent.class, "getKeyCode");
    PowerMockito.doReturn(10).when(evenement, getKeyCodeMethod).withNoArguments();

    // Act
    principale.keyReleased(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, KeyEvent.class})
  @Test
  public void keyReleasedInputNotNullOutputVoid3() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = true;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 1;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final KeyEvent evenement = PowerMockito.mock(KeyEvent.class);
    final Method getKeyCodeMethod = DTUMemberMatcher.method(KeyEvent.class, "getKeyCode");
    PowerMockito.doReturn(0).when(evenement, getKeyCodeMethod).withNoArguments();

    // Act
    principale.keyReleased(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, Table.class, KeyEvent.class, JLabel.class})
  @Test
  public void keyReleasedInputNotNullOutputVoid7() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 0;
    bonus.X = 0;
    bonus.Y = 0;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    final Bonus bonus1 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus1.direction = 0;
    bonus1.X = 0;
    bonus1.Y = 0;
    bonus1.vitesse = 0;
    arrayList.add(bonus1);
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = true;
    table.kelbonus = "??????";
    table.highscore = 1;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 1;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final KeyEvent evenement = PowerMockito.mock(KeyEvent.class);
    final Method getKeyCodeMethod = DTUMemberMatcher.method(KeyEvent.class, "getKeyCode");
    PowerMockito.doReturn(10).when(evenement, getKeyCodeMethod).withNoArguments();

    // Act
    principale.keyReleased(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, KeyEvent.class})
  @Test
  public void keyReleasedInputNotNullOutputVoid6() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = true;
    table.kelbonus = "??????";
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 1;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final KeyEvent evenement = PowerMockito.mock(KeyEvent.class);
    final Method getKeyCodeMethod = DTUMemberMatcher.method(KeyEvent.class, "getKeyCode");
    PowerMockito.doReturn(11).when(evenement, getKeyCodeMethod).withNoArguments();

    // Act
    principale.keyReleased(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, KeyEvent.class})
  @Test
  public void keyReleasedInputNotNullOutputVoid5() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = true;
    table.kelbonus = null;
    table.highscore = 1;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    final JLabel jLabel = (JLabel)Reflector.getInstance("javax.swing.JLabel");
    Reflector.setField(table, "label", jLabel);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final KeyEvent evenement = PowerMockito.mock(KeyEvent.class);
    final Method getKeyCodeMethod = DTUMemberMatcher.method(KeyEvent.class, "getKeyCode");
    PowerMockito.doReturn(-2_147_483_638).when(evenement, getKeyCodeMethod).withNoArguments();

    // Act
    principale.keyReleased(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, Table.class, KeyEvent.class, JLabel.class})
  @Test
  public void keyReleasedInputNotNullOutputVoid4() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 0;
    bonus.X = 0;
    bonus.Y = 0;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = true;
    table.kelbonus = null;
    table.highscore = 1;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final KeyEvent evenement = PowerMockito.mock(KeyEvent.class);
    final Method getKeyCodeMethod = DTUMemberMatcher.method(KeyEvent.class, "getKeyCode");
    PowerMockito.doReturn(10).when(evenement, getKeyCodeMethod).withNoArguments();

    // Act
    principale.keyReleased(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void keyReleasedInputNotNullOutputVoid3() throws InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 2;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 1;
    final JLabel jLabel = (JLabel)Reflector.getInstance("javax.swing.JLabel");
    Reflector.setField(table, "label", jLabel);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final KeyEvent evenement = PowerMockito.mock(KeyEvent.class);

    // Act
    principale.keyReleased(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, Table.class, KeyEvent.class, JLabel.class})
  @Test
  public void keyReleasedInputNotNullOutputVoid2() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 0;
    bonus.X = 0;
    bonus.Y = 0;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = true;
    table.kelbonus = null;
    table.highscore = 2;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 1;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final KeyEvent evenement = PowerMockito.mock(KeyEvent.class);
    final Method getKeyCodeMethod = DTUMemberMatcher.method(KeyEvent.class, "getKeyCode");
    PowerMockito.doReturn(10).when(evenement, getKeyCodeMethod).withNoArguments();

    // Act
    principale.keyReleased(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Principale.class, KeyEvent.class})
  @Test
  public void keyReleasedInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = true;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 1;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    Reflector.setField(principale, "table", table);
    final KeyEvent evenement = PowerMockito.mock(KeyEvent.class);
    final Method getKeyCodeMethod = DTUMemberMatcher.method(KeyEvent.class, "getKeyCode");
    PowerMockito.doReturn(0).when(evenement, getKeyCodeMethod).withNoArguments();

    // Act
    principale.keyReleased(evenement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void keyTypedInputNotNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    Reflector.setField(principale, "table", null);
    final KeyEvent ÈvÈnement = PowerMockito.mock(KeyEvent.class);

    // Act
    principale.keyTyped(ÈvÈnement);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void keyTypedInputNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final Principale principale = (Principale)Reflector.getInstance("baboule.Principale");
    Reflector.setField(principale, "table", null);

    // Act
    principale.keyTyped(null);

    // The method returns void, testing that no exception is thrown
  }
}
