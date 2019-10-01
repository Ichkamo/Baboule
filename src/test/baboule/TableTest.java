package baboule;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import baboule.Bonus;
import baboule.Mechant;
import baboule.Table;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.junit.Assert;
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

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class TableTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @PrepareForTest({JFrame.class, Table.class})
  @Test
  public void mainInput0OutputVoid() throws Exception {

    // Arrange
    final String[] args = {};
    final Table table = PowerMockito.mock(Table.class);
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList arrayList = new ArrayList();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = " nope ...";
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    final ArrayList arrayList1 = new ArrayList();
    table.mechants = arrayList1;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    PowerMockito.whenNew(Table.class).withNoArguments().thenReturn(table);
    final JFrame jFrame = PowerMockito.mock(JFrame.class);
    final Container container = PowerMockito.mock(Container.class);
    final Method getContentPaneMethod = DTUMemberMatcher.method(JFrame.class, "getContentPane");
    PowerMockito.doReturn(container).when(jFrame, getContentPaneMethod).withNoArguments();
    PowerMockito.whenNew(JFrame.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(jFrame);

    // Act
    Table.main(args);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({JFrame.class, Table.class})
  @Test
  public void mainInputNullOutputVoid() throws Exception {

    // Arrange
    final String[] args = null;
    final Table table = PowerMockito.mock(Table.class);
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList arrayList = new ArrayList();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = " nope ...";
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    final ArrayList arrayList1 = new ArrayList();
    table.mechants = arrayList1;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    PowerMockito.whenNew(Table.class).withNoArguments().thenReturn(table);
    final JFrame jFrame = PowerMockito.mock(JFrame.class);
    final Container container = PowerMockito.mock(Container.class);
    final Method getContentPaneMethod = DTUMemberMatcher.method(JFrame.class, "getContentPane");
    PowerMockito.doReturn(container).when(jFrame, getContentPaneMethod).withNoArguments();
    PowerMockito.whenNew(JFrame.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(jFrame);

    // Act
    Table.main(args);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Table.class, JLabel.class})
  @Test
  public void restartOutputVoid() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = "?";
    table.highscore = 1;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 1;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 0;

    // Act
    table.restart();

    // Assert side effects
    final ArrayList<Bonus> arrayList1 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList1, table.bonuss);
    Assert.assertEquals(" nope ...", table.kelbonus);
    Assert.assertEquals(0, table.sc0re);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Table.class, JLabel.class})
  @Test
  public void restartOutputVoid1() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = "?";
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 1;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 0;

    // Act
    table.restart();

    // Assert side effects
    final ArrayList<Bonus> arrayList1 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList1, table.bonuss);
    Assert.assertEquals(" nope ...", table.kelbonus);
    Assert.assertEquals(1, table.highscore);
    Assert.assertEquals(0, table.sc0re);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Table.class, JLabel.class})
  @Test
  public void restartOutputVoid6() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
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

    // Act
    table.restart();

    // Assert side effects
    final ArrayList<Bonus> arrayList1 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList1, table.bonuss);
    Assert.assertEquals(" nope ...", table.kelbonus);
    Assert.assertEquals(0, table.sc0re);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Table.class, JLabel.class})
  @Test
  public void restartOutputVoid5() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
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

    // Act
    table.restart();

    // Assert side effects
    final ArrayList<Bonus> arrayList1 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList1, table.bonuss);
    Assert.assertEquals(" nope ...", table.kelbonus);
    Assert.assertEquals(1, table.highscore);
    Assert.assertEquals(0, table.sc0re);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Table.class, JLabel.class})
  @Test
  public void restartOutputVoid4() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
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

    // Act
    table.restart();

    // Assert side effects
    final ArrayList<Bonus> arrayList1 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList1, table.bonuss);
    Assert.assertEquals(" nope ...", table.kelbonus);
    Assert.assertEquals(1, table.highscore);
    Assert.assertEquals(0, table.sc0re);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Table.class, JLabel.class})
  @Test
  public void restartOutputVoid3() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
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

    // Act
    table.restart();

    // Assert side effects
    final ArrayList<Bonus> arrayList1 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList1, table.bonuss);
    Assert.assertEquals(" nope ...", table.kelbonus);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Table.class, JLabel.class})
  @Test
  public void restartOutputVoid6() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    arrayList.add(null);
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
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

    // Act
    table.restart();

    // Assert side effects
    final ArrayList<Bonus> arrayList1 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList1, table.bonuss);
    Assert.assertEquals(" nope ...", table.kelbonus);
    Assert.assertEquals(0, table.sc0re);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Table.class, JLabel.class})
  @Test
  public void restartOutputVoid7() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    arrayList.add(null);
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
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

    // Act
    table.restart();

    // Assert side effects
    final ArrayList<Bonus> arrayList1 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList1, table.bonuss);
    Assert.assertEquals(" nope ...", table.kelbonus);
    Assert.assertEquals(1, table.highscore);
    Assert.assertEquals(0, table.sc0re);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid64() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
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
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = -524_288;
    table.joueurX = 0;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 0;
    mechant.X = 0;
    mechant.Y = 0;
    mechant.vitesse = 0;
    arrayList1.add(mechant);
    final Mechant mechant1 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant1.direction = 0;
    mechant1.X = 0;
    mechant1.Y = 0;
    mechant1.vitesse = 0;
    arrayList1.add(mechant1);
    table.mechants = arrayList1;
    table.level = 1;
    table.sc0re = -10;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = -2_147_483_642;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertTrue(table.perdu);
    Assert.assertEquals(" + 100  !!", table.kelbonus);
    final ArrayList<Mechant> arrayList3 = new ArrayList<Mechant>();
    Assert.assertEquals(arrayList3, table.mechants);
    Assert.assertEquals(90, table.sc0re);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid63() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = -524_288;
    table.joueurX = 0;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 0;
    mechant.X = 0;
    mechant.Y = 0;
    mechant.vitesse = 0;
    arrayList1.add(mechant);
    final Mechant mechant1 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant1.direction = 0;
    mechant1.X = 0;
    mechant1.Y = 0;
    mechant1.vitesse = 0;
    arrayList1.add(mechant1);
    table.mechants = arrayList1;
    table.level = 1;
    table.sc0re = -10;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = -2_147_483_642;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertTrue(table.perdu);
    final ArrayList<Mechant> arrayList3 = new ArrayList<Mechant>();
    Assert.assertEquals(arrayList3, table.mechants);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid62() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = 0;
    bonus.Y = 0;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    final Bonus bonus1 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus1.direction = 180;
    bonus1.X = 0;
    bonus1.Y = 0;
    bonus1.vitesse = 0;
    arrayList.add(bonus1);
    final Bonus bonus2 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus2.direction = 180;
    bonus2.X = 4_194_341;
    bonus2.Y = 0;
    bonus2.vitesse = 0;
    arrayList.add(bonus2);
    final Bonus bonus3 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus3.direction = 180;
    bonus3.X = -1_610_579_956;
    bonus3.Y = 2_063_597_536;
    bonus3.vitesse = -2_063_564_768;
    arrayList.add(bonus3);
    table.bonuss = arrayList;
    table.joueurY = 2_063_597_549;
    table.perdu = true;
    table.kelbonus = null;
    table.highscore = -100_000_000;
    table.joueurX = -1_610_579_952;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 270;
    mechant.X = 1_610_612_736;
    mechant.Y = 0;
    mechant.vitesse = 536_870_912;
    arrayList1.add(mechant);
    final Mechant mechant1 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant1.direction = 630;
    mechant1.X = -1_610_579_964;
    mechant1.Y = 2_063_597_568;
    mechant1.vitesse = 1_073_741_824;
    arrayList1.add(mechant1);
    table.mechants = arrayList1;
    table.level = 1;
    table.sc0re = 1_000_000_000;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 7;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" Cleared!! ", table.kelbonus);
    final ArrayList<Mechant> arrayList3 = new ArrayList<Mechant>();
    Assert.assertEquals(arrayList3, table.mechants);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid61() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = 0;
    bonus.Y = 0;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    final Bonus bonus1 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus1.direction = 180;
    bonus1.X = 0;
    bonus1.Y = 0;
    bonus1.vitesse = 0;
    arrayList.add(bonus1);
    final Bonus bonus2 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus2.direction = 180;
    bonus2.X = 37;
    bonus2.Y = 0;
    bonus2.vitesse = 0;
    arrayList.add(bonus2);
    final Bonus bonus3 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus3.direction = 180;
    bonus3.X = -1_610_612_724;
    bonus3.Y = 2_063_597_536;
    bonus3.vitesse = -2_063_597_536;
    arrayList.add(bonus3);
    table.bonuss = arrayList;
    table.joueurY = 2_063_597_549;
    table.perdu = true;
    table.kelbonus = null;
    table.highscore = -100_000_000;
    table.joueurX = -1_610_612_720;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 270;
    mechant.X = 1_610_612_736;
    mechant.Y = 0;
    mechant.vitesse = 536_870_912;
    arrayList1.add(mechant);
    final Mechant mechant1 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant1.direction = 630;
    mechant1.X = 0;
    mechant1.Y = 0;
    mechant1.vitesse = 0;
    arrayList1.add(mechant1);
    table.mechants = arrayList1;
    table.level = 1;
    table.sc0re = 1_000_000_000;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 7;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" Cleared!! ", table.kelbonus);
    final ArrayList<Mechant> arrayList3 = new ArrayList<Mechant>();
    Assert.assertEquals(arrayList3, table.mechants);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid29() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = -1_568_669_696;
    bonus.Y = 16;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = false;
    table.kelbonus = "foo";
    table.highscore = 0;
    table.joueurX = -1_568_669_715;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_568_669_729;
    mechant.Y = 1_073_741_824;
    mechant.vitesse = 0;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 5;
    table.sc0re = -431;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 2;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" +1 each ! !", table.kelbonus);
    Assert.assertEquals(3, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid65() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 0;
    bonus.X = 0;
    bonus.Y = 83;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 96;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = -524_288;
    table.joueurX = -19;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 1;
    mechant.X = 0;
    mechant.Y = 0;
    mechant.vitesse = 0;
    arrayList1.add(mechant);
    final Mechant mechant1 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant1.direction = 0;
    mechant1.X = 2;
    mechant1.Y = 0;
    mechant1.vitesse = 0;
    arrayList1.add(mechant1);
    table.mechants = arrayList1;
    table.level = 1;
    table.sc0re = -10;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = -2_147_483_642;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" + 100  !!", table.kelbonus);
    Assert.assertEquals(90, table.sc0re);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid() throws Exception {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 1;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertEquals(2, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid2() throws Exception {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = true;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = 2;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 1;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid3() throws Exception {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = 2;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertEquals(1, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid4() throws Exception {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = 2;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 2;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertEquals(3, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid5() throws Exception {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = 2;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 3;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertEquals(4, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid6() throws Exception {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = 2;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 4;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertEquals(5, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid7() throws Exception {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = 2;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 5;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertEquals(6, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid8() throws Exception {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = 6;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = -2_147_483_635;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid9() throws Exception {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = 6;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 13;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertEquals(7, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid10() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -1_073_741_843;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 8;
    mechant.X = 0;
    mechant.Y = 0;
    mechant.vitesse = 0;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 1;
    table.sc0re = 2_147_483_448;
    Reflector.setField(table, "label", null);
    table.nivo = -2_147_483_642;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid11() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = true;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -1_073_741_843;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 8;
    mechant.X = 0;
    mechant.Y = 0;
    mechant.vitesse = 0;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 1;
    table.sc0re = 2_147_483_448;
    Reflector.setField(table, "label", null);
    table.nivo = -2_147_483_642;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid12() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = true;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -1_073_741_966;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_073_742_045;
    mechant.Y = 0;
    mechant.vitesse = 0;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 1;
    table.sc0re = 2_147_483_448;
    Reflector.setField(table, "label", null);
    table.nivo = -2_147_483_642;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid13() throws Exception {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -1_073_741_966;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = 1;
    table.sc0re = 2_147_483_448;
    Reflector.setField(table, "label", null);
    table.nivo = 1;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertEquals(2, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid14() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -1_568_669_715;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_568_669_729;
    mechant.Y = 0;
    mechant.vitesse = -494_927_684;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 1;
    table.sc0re = 2_147_483_448;
    Reflector.setField(table, "label", null);
    table.nivo = 1;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertNotNull(table.mechants);
    Assert.assertEquals(1, table.mechants.size());
    Assert.assertNotNull(table.mechants.get(0));
    Assert.assertEquals(630, table.mechants.get(0).direction);
    Assert.assertEquals(-1_073_742_045, table.mechants.get(0).X);
    Assert.assertEquals(494_927_684, table.mechants.get(0).Y);
    Assert.assertEquals(-494_927_684, table.mechants.get(0).vitesse);
    Assert.assertEquals(2, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid15() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 90;
    bonus.X = -2_147_483_648;
    bonus.Y = 0;
    bonus.vitesse = -2_147_483_648;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -1_568_669_715;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_568_669_729;
    mechant.Y = 0;
    mechant.vitesse = -494_927_684;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 1;
    table.sc0re = 2_147_483_448;
    Reflector.setField(table, "label", null);
    table.nivo = 1;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertNotNull(table.bonuss);
    Assert.assertEquals(1, table.bonuss.size());
    Assert.assertNotNull(table.bonuss.get(0));
    Assert.assertEquals(90, table.bonuss.get(0).direction);
    Assert.assertEquals(0, table.bonuss.get(0).X);
    Assert.assertEquals(0, table.bonuss.get(0).Y);
    Assert.assertEquals(-2_147_483_648, table.bonuss.get(0).vitesse);
    Assert.assertNotNull(table.mechants);
    Assert.assertEquals(1, table.mechants.size());
    Assert.assertNotNull(table.mechants.get(0));
    Assert.assertEquals(630, table.mechants.get(0).direction);
    Assert.assertEquals(-1_073_742_045, table.mechants.get(0).X);
    Assert.assertEquals(494_927_684, table.mechants.get(0).Y);
    Assert.assertEquals(-494_927_684, table.mechants.get(0).vitesse);
    Assert.assertEquals(2, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid16() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 90;
    bonus.X = -2_147_483_648;
    bonus.Y = 0;
    bonus.vitesse = -2_147_483_648;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -1_568_669_715;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_568_669_729;
    mechant.Y = 0;
    mechant.vitesse = -494_927_684;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 1;
    table.sc0re = 2_147_483_448;
    Reflector.setField(table, "label", null);
    table.nivo = 5;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertNotNull(table.bonuss);
    Assert.assertEquals(1, table.bonuss.size());
    Assert.assertNotNull(table.bonuss.get(0));
    Assert.assertEquals(90, table.bonuss.get(0).direction);
    Assert.assertEquals(0, table.bonuss.get(0).X);
    Assert.assertEquals(0, table.bonuss.get(0).Y);
    Assert.assertEquals(-2_147_483_648, table.bonuss.get(0).vitesse);
    Assert.assertNotNull(table.mechants);
    Assert.assertEquals(1, table.mechants.size());
    Assert.assertNotNull(table.mechants.get(0));
    Assert.assertEquals(630, table.mechants.get(0).direction);
    Assert.assertEquals(-1_073_742_045, table.mechants.get(0).X);
    Assert.assertEquals(494_927_684, table.mechants.get(0).Y);
    Assert.assertEquals(-494_927_684, table.mechants.get(0).vitesse);
    Assert.assertEquals(6, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid17() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -494_927_891;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_568_669_729;
    mechant.Y = 1_073_741_824;
    mechant.vitesse = 0;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 6;
    table.sc0re = 2_147_483_448;
    Reflector.setField(table, "label", null);
    table.nivo = 4;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertEquals(5, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid18() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -1_568_669_715;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_568_669_729;
    mechant.Y = 1_073_741_824;
    mechant.vitesse = 0;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 6;
    table.sc0re = 2_147_483_448;
    Reflector.setField(table, "label", null);
    table.nivo = 4;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertEquals(5, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid19() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 90;
    bonus.X = 0;
    bonus.Y = 0;
    bonus.vitesse = -2_147_483_648;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -1_568_669_715;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_568_669_729;
    mechant.Y = 1_073_741_824;
    mechant.vitesse = 0;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 6;
    table.sc0re = 2_147_483_448;
    Reflector.setField(table, "label", null);
    table.nivo = 4;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertNotNull(table.bonuss);
    Assert.assertEquals(1, table.bonuss.size());
    Assert.assertNotNull(table.bonuss.get(0));
    Assert.assertEquals(90, table.bonuss.get(0).direction);
    Assert.assertEquals(-2_147_483_648, table.bonuss.get(0).X);
    Assert.assertEquals(0, table.bonuss.get(0).Y);
    Assert.assertEquals(-2_147_483_648, table.bonuss.get(0).vitesse);
    Assert.assertEquals(5, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid20() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = -1_568_669_696;
    bonus.Y = 0;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -1_568_669_715;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_568_669_729;
    mechant.Y = 1_073_741_824;
    mechant.vitesse = 0;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 6;
    table.sc0re = 2_147_483_448;
    Reflector.setField(table, "label", null);
    table.nivo = 4;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertEquals(5, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid21() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = -1_568_669_696;
    bonus.Y = 512;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -1_568_669_715;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_568_669_729;
    mechant.Y = 1_073_741_824;
    mechant.vitesse = 0;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 6;
    table.sc0re = 2_147_483_448;
    Reflector.setField(table, "label", null);
    table.nivo = 4;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertEquals(5, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid22() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = -1_568_669_696;
    bonus.Y = 16;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -1_568_669_715;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_568_669_729;
    mechant.Y = 1_073_741_824;
    mechant.vitesse = 0;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 6;
    table.sc0re = -200;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 4;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" Cleared!! ", table.kelbonus);
    final ArrayList<Mechant> arrayList3 = new ArrayList<Mechant>();
    Assert.assertEquals(arrayList3, table.mechants);
    Assert.assertEquals(5, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid23() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = -1_568_669_696;
    bonus.Y = 16;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -1_568_669_715;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_568_669_729;
    mechant.Y = 1_073_741_824;
    mechant.vitesse = 0;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 6;
    table.sc0re = -200;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 4;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" Cleared!! ", table.kelbonus);
    final ArrayList<Mechant> arrayList3 = new ArrayList<Mechant>();
    Assert.assertEquals(arrayList3, table.mechants);
    Assert.assertEquals(5, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid24() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = -1_568_669_696;
    bonus.Y = 16;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -1_568_669_715;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_568_669_729;
    mechant.Y = 1_073_741_824;
    mechant.vitesse = 0;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 6;
    table.sc0re = -200;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 4;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" Cleared!! ", table.kelbonus);
    final ArrayList<Mechant> arrayList3 = new ArrayList<Mechant>();
    Assert.assertEquals(arrayList3, table.mechants);
    Assert.assertEquals(5, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid25() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = -1_568_669_696;
    bonus.Y = 16;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -1_568_669_715;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_568_669_729;
    mechant.Y = 1_073_741_824;
    mechant.vitesse = 0;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 6;
    table.sc0re = -168;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 4;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" + 100  !!", table.kelbonus);
    Assert.assertEquals(5, table.level);
    Assert.assertEquals(-68, table.sc0re);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid26() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = -1_568_669_696;
    bonus.Y = 16;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -1_568_669_715;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_568_669_729;
    mechant.Y = 1_073_741_824;
    mechant.vitesse = 0;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 6;
    table.sc0re = -168;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 4;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" + 100  !!", table.kelbonus);
    Assert.assertEquals(5, table.level);
    Assert.assertEquals(-68, table.sc0re);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid27() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = -1_568_669_696;
    bonus.Y = 16;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = false;
    table.kelbonus = "foo";
    table.highscore = 0;
    table.joueurX = -1_568_669_715;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_568_669_729;
    mechant.Y = 1_073_741_824;
    mechant.vitesse = 0;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 6;
    table.sc0re = -167;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 4;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" +1 each ! !", table.kelbonus);
    Assert.assertEquals(5, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid28() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = -1_568_669_696;
    bonus.Y = 16;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = false;
    table.kelbonus = "foo";
    table.highscore = 0;
    table.joueurX = -1_568_669_715;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_568_669_729;
    mechant.Y = 1_073_741_824;
    mechant.vitesse = 0;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 6;
    table.sc0re = -431;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 4;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" + 200  !!", table.kelbonus);
    Assert.assertEquals(5, table.level);
    Assert.assertEquals(-231, table.sc0re);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid60() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = 0;
    bonus.Y = 0;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    final Bonus bonus1 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus1.direction = 270;
    bonus1.X = 0;
    bonus1.Y = 0;
    bonus1.vitesse = 0;
    arrayList.add(bonus1);
    final Bonus bonus2 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus2.direction = 0;
    bonus2.X = 37;
    bonus2.Y = 0;
    bonus2.vitesse = 0;
    arrayList.add(bonus2);
    final Bonus bonus3 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus3.direction = 0;
    bonus3.X = 536_870_916;
    bonus3.Y = 0;
    bonus3.vitesse = 0;
    arrayList.add(bonus3);
    table.bonuss = arrayList;
    table.joueurY = 2_063_597_549;
    table.perdu = true;
    table.kelbonus = null;
    table.highscore = -100_000_000;
    table.joueurX = -1_610_612_720;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 270;
    mechant.X = 1_610_612_736;
    mechant.Y = 0;
    mechant.vitesse = 536_870_912;
    arrayList1.add(mechant);
    final Mechant mechant1 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant1.direction = 630;
    mechant1.X = 0;
    mechant1.Y = 0;
    mechant1.vitesse = 0;
    arrayList1.add(mechant1);
    table.mechants = arrayList1;
    table.level = 1;
    table.sc0re = 1_000_000_000;
    Reflector.setField(table, "label", null);
    table.nivo = 7;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertNotNull(table.mechants);
    Assert.assertEquals(2, table.mechants.size());
    Assert.assertNotNull(table.mechants.get(0));
    Assert.assertEquals(270, table.mechants.get(0).direction);
    Assert.assertEquals(1_073_741_824, table.mechants.get(0).X);
    Assert.assertEquals(0, table.mechants.get(0).Y);
    Assert.assertEquals(536_870_912, table.mechants.get(0).vitesse);
    Assert.assertNotNull(table.mechants.get(1));
    Assert.assertEquals(630, table.mechants.get(1).direction);
    Assert.assertEquals(0, table.mechants.get(1).X);
    Assert.assertEquals(0, table.mechants.get(1).Y);
    Assert.assertEquals(0, table.mechants.get(1).vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid30() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = -1_568_669_696;
    bonus.Y = 16;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 15;
    table.perdu = false;
    table.kelbonus = "foo";
    table.highscore = 0;
    table.joueurX = -1_568_669_715;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_568_669_729;
    mechant.Y = 2;
    mechant.vitesse = -696_254_462;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 5;
    table.sc0re = -431;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 2;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertTrue(table.perdu);
    Assert.assertEquals(" +1 each ! !", table.kelbonus);
    final ArrayList<Mechant> arrayList3 = new ArrayList<Mechant>();
    Assert.assertEquals(arrayList3, table.mechants);
    Assert.assertEquals(3, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid31() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 1);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = -1_568_669_696;
    bonus.Y = -2_147_483_504;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = -2_147_483_503;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -1_568_669_715;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_568_669_729;
    mechant.Y = -2_147_482_622;
    mechant.vitesse = -1_482_712_638;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 5;
    table.sc0re = -431;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 10;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" + 100  !!", table.kelbonus);
    Assert.assertNotNull(table.mechants);
    Assert.assertEquals(1, table.mechants.size());
    Assert.assertNotNull(table.mechants.get(0));
    Assert.assertEquals(630, table.mechants.get(0).direction);
    Assert.assertEquals(-85_957_091, table.mechants.get(0).X);
    Assert.assertEquals(-664_769_984, table.mechants.get(0).Y);
    Assert.assertEquals(-1_482_712_638, table.mechants.get(0).vitesse);
    Assert.assertEquals(7, table.level);
    Assert.assertEquals(-331, table.sc0re);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid32() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 1);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = -1_568_669_696;
    bonus.Y = -2_147_483_483;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = -2_147_483_503;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -1_568_669_715;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = -1_568_669_729;
    mechant.Y = -2_147_482_622;
    mechant.vitesse = -1_482_712_638;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 5;
    table.sc0re = -431;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 0;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertNotNull(table.mechants);
    Assert.assertEquals(1, table.mechants.size());
    Assert.assertNotNull(table.mechants.get(0));
    Assert.assertEquals(630, table.mechants.get(0).direction);
    Assert.assertEquals(-85_957_091, table.mechants.get(0).X);
    Assert.assertEquals(-664_769_984, table.mechants.get(0).Y);
    Assert.assertEquals(-1_482_712_638, table.mechants.get(0).vitesse);
    Assert.assertEquals(1, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid33() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 1);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = -1_568_669_696;
    bonus.Y = -2_147_483_515;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = -2_147_483_503;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -1_568_669_715;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = 5;
    table.sc0re = -431;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 3;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" + 100  !!", table.kelbonus);
    Assert.assertEquals(4, table.level);
    Assert.assertEquals(-331, table.sc0re);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid34() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
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
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 268_435_456;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 1;
    mechant.X = 8192;
    mechant.Y = 0;
    mechant.vitesse = 528_482_302;
    arrayList1.add(mechant);
    final Mechant mechant1 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant1.direction = 1;
    mechant1.X = 8192;
    mechant1.Y = 0;
    mechant1.vitesse = -1_073_741_824;
    arrayList1.add(mechant1);
    table.mechants = arrayList1;
    table.level = 1;
    table.sc0re = -100_000_000;
    Reflector.setField(table, "label", null);
    table.nivo = 4;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertEquals(5, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid35() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
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
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 805_306_368;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 1;
    mechant.X = 8192;
    mechant.Y = 0;
    mechant.vitesse = 528_482_302;
    arrayList1.add(mechant);
    final Mechant mechant1 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant1.direction = 1;
    mechant1.X = 1_610_620_928;
    mechant1.Y = 0;
    mechant1.vitesse = -1_073_741_824;
    arrayList1.add(mechant1);
    table.mechants = arrayList1;
    table.level = 1;
    table.sc0re = -100_000_000;
    Reflector.setField(table, "label", null);
    table.nivo = 4;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertEquals(5, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid36() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 90;
    bonus.X = 939_524_096;
    bonus.Y = -2_147_483_648;
    bonus.vitesse = -1_744_830_464;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 805_306_368;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 1;
    mechant.X = 8192;
    mechant.Y = 0;
    mechant.vitesse = 528_482_302;
    arrayList1.add(mechant);
    final Mechant mechant1 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant1.direction = 1;
    mechant1.X = 1_610_620_928;
    mechant1.Y = 0;
    mechant1.vitesse = -1_073_741_824;
    arrayList1.add(mechant1);
    table.mechants = arrayList1;
    table.level = 1;
    table.sc0re = -100_000_000;
    Reflector.setField(table, "label", null);
    table.nivo = 4;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertNotNull(table.bonuss);
    Assert.assertEquals(1, table.bonuss.size());
    Assert.assertNotNull(table.bonuss.get(0));
    Assert.assertEquals(90, table.bonuss.get(0).direction);
    Assert.assertEquals(-805_306_368, table.bonuss.get(0).X);
    Assert.assertEquals(-2_147_483_648, table.bonuss.get(0).Y);
    Assert.assertEquals(-1_744_830_464, table.bonuss.get(0).vitesse);
    Assert.assertEquals(5, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid37() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 90;
    bonus.X = 939_524_096;
    bonus.Y = -2_147_483_648;
    bonus.vitesse = -1_744_830_464;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 805_306_368;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 1;
    mechant.X = 8192;
    mechant.Y = 0;
    mechant.vitesse = 528_482_302;
    arrayList1.add(mechant);
    final Mechant mechant1 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant1.direction = 1;
    mechant1.X = 1_610_620_928;
    mechant1.Y = 0;
    mechant1.vitesse = -1_073_741_824;
    arrayList1.add(mechant1);
    table.mechants = arrayList1;
    table.level = 3;
    table.sc0re = -100_000_000;
    Reflector.setField(table, "label", null);
    table.nivo = -2_147_483_644;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertNotNull(table.bonuss);
    Assert.assertEquals(1, table.bonuss.size());
    Assert.assertNotNull(table.bonuss.get(0));
    Assert.assertEquals(90, table.bonuss.get(0).direction);
    Assert.assertEquals(-805_306_368, table.bonuss.get(0).X);
    Assert.assertEquals(-2_147_483_648, table.bonuss.get(0).Y);
    Assert.assertEquals(-1_744_830_464, table.bonuss.get(0).vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid38() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 90;
    bonus.X = 503_316_508;
    bonus.Y = -2_147_483_648;
    bonus.vitesse = -134_217_728;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 369_098_760;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 1;
    mechant.X = 8192;
    mechant.Y = 0;
    mechant.vitesse = 528_482_302;
    arrayList1.add(mechant);
    final Mechant mechant1 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant1.direction = 1;
    mechant1.X = 1_073_750_016;
    mechant1.Y = 0;
    mechant1.vitesse = -1_073_741_824;
    arrayList1.add(mechant1);
    table.mechants = arrayList1;
    table.level = 3;
    table.sc0re = -100_000_100;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertNotNull(table.bonuss);
    Assert.assertEquals(1, table.bonuss.size());
    Assert.assertNotNull(table.bonuss.get(0));
    Assert.assertEquals(90, table.bonuss.get(0).direction);
    Assert.assertEquals(369_098_780, table.bonuss.get(0).X);
    Assert.assertEquals(-2_147_483_648, table.bonuss.get(0).Y);
    Assert.assertEquals(-134_217_728, table.bonuss.get(0).vitesse);
    Assert.assertEquals(1, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid39() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 90;
    bonus.X = 503_316_508;
    bonus.Y = -2_147_483_648;
    bonus.vitesse = -134_217_728;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 369_098_760;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = 3;
    table.sc0re = -100_000_100;
    Reflector.setField(table, "label", null);
    table.nivo = 2;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertNotNull(table.bonuss);
    Assert.assertEquals(1, table.bonuss.size());
    Assert.assertNotNull(table.bonuss.get(0));
    Assert.assertEquals(90, table.bonuss.get(0).direction);
    Assert.assertEquals(369_098_780, table.bonuss.get(0).X);
    Assert.assertEquals(-2_147_483_648, table.bonuss.get(0).Y);
    Assert.assertEquals(-134_217_728, table.bonuss.get(0).vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid40() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 90;
    bonus.X = 503_316_508;
    bonus.Y = -2_147_483_648;
    bonus.vitesse = -134_217_728;
    arrayList.add(bonus);
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = true;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 369_098_760;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = 3;
    table.sc0re = -100_000_100;
    Reflector.setField(table, "label", null);
    table.nivo = 2;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertNotNull(table.bonuss);
    Assert.assertEquals(1, table.bonuss.size());
    Assert.assertNotNull(table.bonuss.get(0));
    Assert.assertEquals(90, table.bonuss.get(0).direction);
    Assert.assertEquals(369_098_780, table.bonuss.get(0).X);
    Assert.assertEquals(-2_147_483_648, table.bonuss.get(0).Y);
    Assert.assertEquals(-134_217_728, table.bonuss.get(0).vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid41() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = -568_589_329;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -828_899_253;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = -2_147_483_648;
    mechant.X = -963_116_977;
    mechant.Y = -568_589_344;
    mechant.vitesse = 2_009_581_535;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 3;
    table.sc0re = 268_435_456;
    Reflector.setField(table, "label", null);
    table.nivo = 3;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertEquals(4, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid42() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = -568_589_329;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -828_899_253;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = -2_147_483_648;
    mechant.X = -963_116_977;
    mechant.Y = -568_589_344;
    mechant.vitesse = 2_009_581_535;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 3;
    table.sc0re = 268_435_456;
    Reflector.setField(table, "label", null);
    table.nivo = 5;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertEquals(6, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid43() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 180;
    bonus.X = -963_059_106;
    bonus.Y = -568_589_309;
    bonus.vitesse = 536_870_912;
    arrayList.add(bonus);
    final Bonus bonus1 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus1.direction = 180;
    bonus1.X = -1_978_138_530;
    bonus1.Y = -535_822_336;
    bonus1.vitesse = 988_807_168;
    arrayList.add(bonus1);
    final Bonus bonus2 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus2.direction = 180;
    bonus2.X = -828_899_268;
    bonus2.Y = -568_589_307;
    bonus2.vitesse = -2_147_483_648;
    arrayList.add(bonus2);
    table.bonuss = arrayList;
    table.joueurY = -568_589_329;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -828_899_253;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = 3;
    table.sc0re = 268_435_456;
    Reflector.setField(table, "label", null);
    table.nivo = 6;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertNotNull(table.bonuss);
    Assert.assertEquals(3, table.bonuss.size());
    Assert.assertNotNull(table.bonuss.get(0));
    Assert.assertEquals(180, table.bonuss.get(0).direction);
    Assert.assertEquals(-963_059_106, table.bonuss.get(0).X);
    Assert.assertEquals(-31_718_397, table.bonuss.get(0).Y);
    Assert.assertEquals(536_870_912, table.bonuss.get(0).vitesse);
    Assert.assertNotNull(table.bonuss.get(1));
    Assert.assertEquals(180, table.bonuss.get(1).direction);
    Assert.assertEquals(-1_978_138_530, table.bonuss.get(1).X);
    Assert.assertEquals(452_984_832, table.bonuss.get(1).Y);
    Assert.assertEquals(988_807_168, table.bonuss.get(1).vitesse);
    Assert.assertNotNull(table.bonuss.get(2));
    Assert.assertEquals(180, table.bonuss.get(2).direction);
    Assert.assertEquals(-828_899_268, table.bonuss.get(2).X);
    Assert.assertEquals(1_578_894_341, table.bonuss.get(2).Y);
    Assert.assertEquals(-2_147_483_648, table.bonuss.get(2).vitesse);
    Assert.assertEquals(7, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid44() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 180;
    bonus.X = -963_059_106;
    bonus.Y = -568_589_309;
    bonus.vitesse = 536_870_912;
    arrayList.add(bonus);
    final Bonus bonus1 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus1.direction = 180;
    bonus1.X = -1_978_138_530;
    bonus1.Y = -535_822_336;
    bonus1.vitesse = 988_807_168;
    arrayList.add(bonus1);
    final Bonus bonus2 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus2.direction = 180;
    bonus2.X = -828_899_268;
    bonus2.Y = -568_589_307;
    bonus2.vitesse = -2_147_483_648;
    arrayList.add(bonus2);
    table.bonuss = arrayList;
    table.joueurY = -568_589_329;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -828_899_253;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = 7;
    table.sc0re = 268_435_456;
    Reflector.setField(table, "label", null);
    table.nivo = 1;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertNotNull(table.bonuss);
    Assert.assertEquals(3, table.bonuss.size());
    Assert.assertNotNull(table.bonuss.get(0));
    Assert.assertEquals(180, table.bonuss.get(0).direction);
    Assert.assertEquals(-963_059_106, table.bonuss.get(0).X);
    Assert.assertEquals(-31_718_397, table.bonuss.get(0).Y);
    Assert.assertEquals(536_870_912, table.bonuss.get(0).vitesse);
    Assert.assertNotNull(table.bonuss.get(1));
    Assert.assertEquals(180, table.bonuss.get(1).direction);
    Assert.assertEquals(-1_978_138_530, table.bonuss.get(1).X);
    Assert.assertEquals(452_984_832, table.bonuss.get(1).Y);
    Assert.assertEquals(988_807_168, table.bonuss.get(1).vitesse);
    Assert.assertNotNull(table.bonuss.get(2));
    Assert.assertEquals(180, table.bonuss.get(2).direction);
    Assert.assertEquals(-828_899_268, table.bonuss.get(2).X);
    Assert.assertEquals(1_578_894_341, table.bonuss.get(2).Y);
    Assert.assertEquals(-2_147_483_648, table.bonuss.get(2).vitesse);
    Assert.assertEquals(2, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid45() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = -568_588_945;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = -828_899_245;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = -2_147_483_648;
    mechant.X = -828_899_257;
    mechant.Y = -568_588_944;
    mechant.vitesse = 1_741_146_079;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 7;
    table.sc0re = 268_435_456;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 1;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertTrue(table.perdu);
    final ArrayList<Mechant> arrayList3 = new ArrayList<Mechant>();
    Assert.assertEquals(arrayList3, table.mechants);
    Assert.assertEquals(2, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid46() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 181;
    bonus.X = -495_544_411;
    bonus.Y = -568_588_947;
    bonus.vitesse = 645_044_138;
    arrayList.add(bonus);
    final Bonus bonus1 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus1.direction = 270;
    bonus1.X = 838_243_301;
    bonus1.Y = -568_588_955;
    bonus1.vitesse = 993_304_077;
    arrayList.add(bonus1);
    table.bonuss = arrayList;
    table.joueurY = -568_588_932;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 838_243_283;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 4_194_484;
    mechant.X = 838_243_287;
    mechant.Y = -568_588_931;
    mechant.vitesse = 2_005_140_273;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 7;
    table.sc0re = 268_435_456;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 1;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertTrue(table.perdu);
    final ArrayList<Mechant> arrayList3 = new ArrayList<Mechant>();
    Assert.assertEquals(arrayList3, table.mechants);
    Assert.assertEquals(2, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid47() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 181;
    bonus.X = -495_544_411;
    bonus.Y = -568_588_947;
    bonus.vitesse = 645_044_138;
    arrayList.add(bonus);
    final Bonus bonus1 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus1.direction = 270;
    bonus1.X = 838_243_301;
    bonus1.Y = -568_588_859;
    bonus1.vitesse = 993_304_077;
    arrayList.add(bonus1);
    table.bonuss = arrayList;
    table.joueurY = -568_588_932;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 838_243_283;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 4_194_484;
    mechant.X = 838_243_287;
    mechant.Y = -568_588_931;
    mechant.vitesse = 2_005_140_273;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 7;
    table.sc0re = 268_435_456;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 1;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertTrue(table.perdu);
    final ArrayList<Mechant> arrayList3 = new ArrayList<Mechant>();
    Assert.assertEquals(arrayList3, table.mechants);
    Assert.assertEquals(2, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid48() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 181;
    bonus.X = 1_593_219_012;
    bonus.Y = -568_589_091;
    bonus.vitesse = 645_044_194;
    arrayList.add(bonus);
    final Bonus bonus1 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus1.direction = 270;
    bonus1.X = 1_324_781_549;
    bonus1.Y = -196_379_071;
    bonus1.vitesse = 573_872_389;
    arrayList.add(bonus1);
    final Bonus bonus2 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus2.direction = 181;
    bonus2.X = 1_324_781_544;
    bonus2.Y = 1_263_139_581;
    bonus2.vitesse = -1_569_015_814;
    arrayList.add(bonus2);
    table.bonuss = arrayList;
    table.joueurY = 1_263_139_564;
    table.perdu = false;
    table.kelbonus = "???????????";
    table.highscore = 0;
    table.joueurX = 1_324_781_557;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = 7;
    table.sc0re = 268_435_356;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 1;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" + 100  !!", table.kelbonus);
    Assert.assertEquals(2, table.level);
    Assert.assertEquals(268_435_456, table.sc0re);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid49() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 181;
    bonus.X = 1_593_219_012;
    bonus.Y = -568_589_091;
    bonus.vitesse = 645_044_194;
    arrayList.add(bonus);
    final Bonus bonus1 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus1.direction = 270;
    bonus1.X = 1_324_781_549;
    bonus1.Y = -196_379_071;
    bonus1.vitesse = 573_872_389;
    arrayList.add(bonus1);
    final Bonus bonus2 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus2.direction = 181;
    bonus2.X = 1_324_781_544;
    bonus2.Y = 1_263_139_581;
    bonus2.vitesse = -1_569_015_814;
    arrayList.add(bonus2);
    table.bonuss = arrayList;
    table.joueurY = 1_263_139_564;
    table.perdu = false;
    table.kelbonus = "???????????";
    table.highscore = 0;
    table.joueurX = 1_324_781_557;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = 7;
    table.sc0re = 268_435_356;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 1;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" + 100  !!", table.kelbonus);
    Assert.assertEquals(2, table.level);
    Assert.assertEquals(268_435_456, table.sc0re);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid50() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 181;
    bonus.X = 1_593_219_012;
    bonus.Y = -568_589_091;
    bonus.vitesse = 645_044_194;
    arrayList.add(bonus);
    final Bonus bonus1 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus1.direction = 270;
    bonus1.X = 1_324_781_549;
    bonus1.Y = -196_379_071;
    bonus1.vitesse = 573_872_389;
    arrayList.add(bonus1);
    final Bonus bonus2 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus2.direction = 181;
    bonus2.X = 1_324_781_544;
    bonus2.Y = 1_263_139_581;
    bonus2.vitesse = -1_569_015_814;
    arrayList.add(bonus2);
    table.bonuss = arrayList;
    table.joueurY = 1_263_139_564;
    table.perdu = false;
    table.kelbonus = "??????????";
    table.highscore = 0;
    table.joueurX = 1_324_781_557;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = 7;
    table.sc0re = 268_435_256;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 1;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" + 200  !!", table.kelbonus);
    Assert.assertEquals(2, table.level);
    Assert.assertEquals(268_435_456, table.sc0re);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid51() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 181;
    bonus.X = 1_593_219_012;
    bonus.Y = -568_589_091;
    bonus.vitesse = 645_044_194;
    arrayList.add(bonus);
    final Bonus bonus1 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus1.direction = 270;
    bonus1.X = 1_324_781_549;
    bonus1.Y = -196_379_071;
    bonus1.vitesse = 573_872_389;
    arrayList.add(bonus1);
    table.bonuss = arrayList;
    table.joueurY = 1_263_139_564;
    table.perdu = false;
    table.kelbonus = "??????????";
    table.highscore = 0;
    table.joueurX = 1_324_781_557;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 4_194_484;
    mechant.X = 1_324_781_552;
    mechant.Y = 1_665_792_733;
    mechant.vitesse = -142_211_271;
    arrayList1.add(mechant);
    final Mechant mechant1 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant1.direction = 1;
    mechant1.X = 1_307_975_633;
    mechant1.Y = 1_656_880_095;
    mechant1.vitesse = 1_602_551_065;
    arrayList1.add(mechant1);
    table.mechants = arrayList1;
    table.level = 7;
    table.sc0re = 268_435_256;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 1;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertNotNull(table.bonuss);
    Assert.assertEquals(2, table.bonuss.size());
    Assert.assertNotNull(table.bonuss.get(0));
    Assert.assertEquals(181, table.bonuss.get(0).direction);
    Assert.assertEquals(1_593_219_012, table.bonuss.get(0).X);
    Assert.assertEquals(-568_589_091, table.bonuss.get(0).Y);
    Assert.assertEquals(645_044_194, table.bonuss.get(0).vitesse);
    Assert.assertNotNull(table.bonuss.get(1));
    Assert.assertEquals(270, table.bonuss.get(1).direction);
    Assert.assertEquals(750_909_160, table.bonuss.get(1).X);
    Assert.assertEquals(-196_379_071, table.bonuss.get(1).Y);
    Assert.assertEquals(573_872_389, table.bonuss.get(1).vitesse);
    Assert.assertEquals(2, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid52() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 181;
    bonus.X = 1_593_219_012;
    bonus.Y = -568_589_091;
    bonus.vitesse = 645_044_194;
    arrayList.add(bonus);
    final Bonus bonus1 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus1.direction = 270;
    bonus1.X = 1_324_781_549;
    bonus1.Y = -196_379_071;
    bonus1.vitesse = 573_872_389;
    arrayList.add(bonus1);
    table.bonuss = arrayList;
    table.joueurY = 1_263_139_564;
    table.perdu = false;
    table.kelbonus = "??????????";
    table.highscore = 0;
    table.joueurX = 1_324_781_557;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 4_194_484;
    mechant.X = 1_324_781_552;
    mechant.Y = 189_333_213;
    mechant.vitesse = -201_128_135;
    arrayList1.add(mechant);
    final Mechant mechant1 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant1.direction = 1;
    mechant1.X = 1_307_975_633;
    mechant1.Y = 1_656_880_095;
    mechant1.vitesse = 1_602_551_065;
    arrayList1.add(mechant1);
    table.mechants = arrayList1;
    table.level = 7;
    table.sc0re = 268_435_256;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 1;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertNotNull(table.bonuss);
    Assert.assertEquals(2, table.bonuss.size());
    Assert.assertNotNull(table.bonuss.get(0));
    Assert.assertEquals(181, table.bonuss.get(0).direction);
    Assert.assertEquals(1_593_219_012, table.bonuss.get(0).X);
    Assert.assertEquals(-568_589_091, table.bonuss.get(0).Y);
    Assert.assertEquals(645_044_194, table.bonuss.get(0).vitesse);
    Assert.assertNotNull(table.bonuss.get(1));
    Assert.assertEquals(270, table.bonuss.get(1).direction);
    Assert.assertEquals(750_909_160, table.bonuss.get(1).X);
    Assert.assertEquals(-196_379_071, table.bonuss.get(1).Y);
    Assert.assertEquals(573_872_389, table.bonuss.get(1).vitesse);
    Assert.assertEquals(2, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid53() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 181;
    bonus.X = 1_324_781_572;
    bonus.Y = 1_263_139_573;
    bonus.vitesse = 553_818_082;
    arrayList.add(bonus);
    final Bonus bonus1 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus1.direction = 270;
    bonus1.X = 1_324_781_549;
    bonus1.Y = -196_379_071;
    bonus1.vitesse = 573_872_389;
    arrayList.add(bonus1);
    table.bonuss = arrayList;
    table.joueurY = 1_263_139_564;
    table.perdu = false;
    table.kelbonus = "??????????";
    table.highscore = 0;
    table.joueurX = 1_324_781_557;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 4_194_484;
    mechant.X = 1_324_781_552;
    mechant.Y = 189_333_213;
    mechant.vitesse = -201_128_135;
    arrayList1.add(mechant);
    final Mechant mechant1 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant1.direction = 1;
    mechant1.X = 1_307_975_633;
    mechant1.Y = 1_656_880_095;
    mechant1.vitesse = 1_602_551_065;
    arrayList1.add(mechant1);
    table.mechants = arrayList1;
    table.level = 7;
    table.sc0re = 268_435_456;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 1;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" Cleared!! ", table.kelbonus);
    final ArrayList<Mechant> arrayList3 = new ArrayList<Mechant>();
    Assert.assertEquals(arrayList3, table.mechants);
    Assert.assertEquals(2, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid54() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 181;
    bonus.X = 1_324_781_572;
    bonus.Y = 1_263_139_573;
    bonus.vitesse = 553_818_082;
    arrayList.add(bonus);
    final Bonus bonus1 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus1.direction = 270;
    bonus1.X = 1_324_781_549;
    bonus1.Y = -196_379_071;
    bonus1.vitesse = 573_872_389;
    arrayList.add(bonus1);
    table.bonuss = arrayList;
    table.joueurY = 1_263_139_564;
    table.perdu = false;
    table.kelbonus = "??????????";
    table.highscore = 0;
    table.joueurX = 1_324_781_557;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 4_194_484;
    mechant.X = 1_324_781_552;
    mechant.Y = 189_333_213;
    mechant.vitesse = -201_128_135;
    arrayList1.add(mechant);
    final Mechant mechant1 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant1.direction = 1;
    mechant1.X = 1_307_975_633;
    mechant1.Y = 1_656_880_095;
    mechant1.vitesse = 1_602_551_065;
    arrayList1.add(mechant1);
    table.mechants = arrayList1;
    table.level = 7;
    table.sc0re = 268_435_456;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 1;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" +1 each ! !", table.kelbonus);
    Assert.assertEquals(2, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid55() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = 1_052_741_637;
    bonus.Y = 1_263_139_574;
    bonus.vitesse = -809_500_735;
    arrayList.add(bonus);
    final Bonus bonus1 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus1.direction = 270;
    bonus1.X = 1_052_741_628;
    bonus1.Y = -196_379_069;
    bonus1.vitesse = 309_336_321;
    arrayList.add(bonus1);
    final Bonus bonus2 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus2.direction = 90;
    bonus2.X = 1_324_769_256;
    bonus2.Y = 1_263_139_577;
    bonus2.vitesse = 578_453_497;
    arrayList.add(bonus2);
    table.bonuss = arrayList;
    table.joueurY = 1_263_139_565;
    table.perdu = false;
    table.kelbonus = "??????????";
    table.highscore = 0;
    table.joueurX = 1_052_741_637;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 0;
    mechant.X = 918_591_504;
    mechant.Y = 189_332_758;
    mechant.vitesse = -1_206_649_469;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 7;
    table.sc0re = 268_435_456;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 1;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" Cleared!! ", table.kelbonus);
    final ArrayList<Mechant> arrayList3 = new ArrayList<Mechant>();
    Assert.assertEquals(arrayList3, table.mechants);
    Assert.assertEquals(2, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid56() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = 1_052_741_637;
    bonus.Y = 1_263_139_574;
    bonus.vitesse = -809_500_735;
    arrayList.add(bonus);
    final Bonus bonus1 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus1.direction = 270;
    bonus1.X = 1_052_741_628;
    bonus1.Y = -196_379_069;
    bonus1.vitesse = 309_336_321;
    arrayList.add(bonus1);
    final Bonus bonus2 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus2.direction = 90;
    bonus2.X = 1_324_769_256;
    bonus2.Y = 1_263_139_577;
    bonus2.vitesse = 578_453_497;
    arrayList.add(bonus2);
    table.bonuss = arrayList;
    table.joueurY = 1_263_139_565;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 1_052_741_637;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 0;
    mechant.X = 918_591_504;
    mechant.Y = 189_332_758;
    mechant.vitesse = -1_206_649_469;
    arrayList1.add(mechant);
    table.mechants = arrayList1;
    table.level = 7;
    table.sc0re = 268_435_456;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 1;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertEquals(" Cleared!! ", table.kelbonus);
    final ArrayList<Mechant> arrayList3 = new ArrayList<Mechant>();
    Assert.assertEquals(arrayList3, table.mechants);
    Assert.assertEquals(2, table.level);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid57() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = -2_147_223_603;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 1_081_534_464;
    table.joueurX = -2_004_876_481;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 268_436_086;
    mechant.X = -1_602_223_237;
    mechant.Y = 195_581;
    mechant.vitesse = 1_112_787;
    arrayList1.add(mechant);
    final Mechant mechant1 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant1.direction = 630;
    mechant1.X = 234_883_874;
    mechant1.Y = 2852;
    mechant1.vitesse = -33_551_582;
    arrayList1.add(mechant1);
    final Mechant mechant2 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant2.direction = 630;
    mechant2.X = -2_137_915_117;
    mechant2.Y = -2_147_352_557;
    mechant2.vitesse = 131_091;
    arrayList1.add(mechant2);
    final Mechant mechant3 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant3.direction = 631;
    mechant3.X = 131_094;
    mechant3.Y = 537_002_176;
    mechant3.vitesse = 536_684_720;
    arrayList1.add(mechant3);
    table.mechants = arrayList1;
    table.level = 513;
    table.sc0re = 67_240;
    Reflector.setField(table, "label", null);
    table.nivo = -2_147_483_646;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    Assert.assertNotNull(table.mechants);
    Assert.assertEquals(4, table.mechants.size());
    Assert.assertNotNull(table.mechants.get(0));
    Assert.assertEquals(268_436_086, table.mechants.get(0).direction);
    Assert.assertEquals(-1_602_223_237, table.mechants.get(0).X);
    Assert.assertEquals(195_581, table.mechants.get(0).Y);
    Assert.assertEquals(1_112_787, table.mechants.get(0).vitesse);
    Assert.assertNotNull(table.mechants.get(1));
    Assert.assertEquals(630, table.mechants.get(1).direction);
    Assert.assertEquals(268_435_456, table.mechants.get(1).X);
    Assert.assertEquals(33_554_434, table.mechants.get(1).Y);
    Assert.assertEquals(-33_551_582, table.mechants.get(1).vitesse);
    Assert.assertNotNull(table.mechants.get(2));
    Assert.assertEquals(630, table.mechants.get(2).direction);
    Assert.assertEquals(-2_138_046_208, table.mechants.get(2).X);
    Assert.assertEquals(-2_147_483_648, table.mechants.get(2).Y);
    Assert.assertEquals(131_091, table.mechants.get(2).vitesse);
    Assert.assertNotNull(table.mechants.get(3));
    Assert.assertEquals(631, table.mechants.get(3).direction);
    Assert.assertEquals(131_094, table.mechants.get(3).X);
    Assert.assertEquals(537_002_176, table.mechants.get(3).Y);
    Assert.assertEquals(536_684_720, table.mechants.get(3).vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid58() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 176;
    bonus.X = 0;
    bonus.Y = -2_147_483_648;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    final Bonus bonus1 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus1.direction = 270;
    bonus1.X = 0;
    bonus1.Y = -2_147_483_648;
    bonus1.vitesse = 0;
    arrayList.add(bonus1);
    table.bonuss = arrayList;
    table.joueurY = -2_113_763_411;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 1_081_534_464;
    table.joueurX = 671_088_637;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 268_436_086;
    mechant.X = -1_467_949_061;
    mechant.Y = 41_981;
    mechant.vitesse = 1_310_419;
    arrayList1.add(mechant);
    final Mechant mechant1 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant1.direction = 630;
    mechant1.X = 671_088_646;
    mechant1.Y = 804;
    mechant1.vitesse = -16_777_214;
    arrayList1.add(mechant1);
    final Mechant mechant2 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant2.direction = 630;
    mechant2.X = 671_088_622;
    mechant2.Y = -2_113_763_393;
    mechant2.vitesse = 163_701;
    arrayList1.add(mechant2);
    final Mechant mechant3 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant3.direction = 631;
    mechant3.X = 671_088_638;
    mechant3.Y = -2_113_763_392;
    mechant3.vitesse = 1_442_672_304;
    arrayList1.add(mechant3);
    table.mechants = arrayList1;
    table.level = 513;
    table.sc0re = 67_240;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = -2_147_483_646;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertTrue(table.perdu);
    final ArrayList<Mechant> arrayList3 = new ArrayList<Mechant>();
    Assert.assertEquals(arrayList3, table.mechants);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Graphics.class, Table.class, JPanel.class})
  @Test
  public void paintComponentInputNotNullOutputVoid59() throws Exception, InvocationTargetException {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.paintComponent(or(isA(Graphics.class), isNull(Graphics.class)));
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 176;
    bonus.X = 671_088_640;
    bonus.Y = -2_113_763_394;
    bonus.vitesse = 0;
    arrayList.add(bonus);
    final Bonus bonus1 = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus1.direction = 270;
    bonus1.X = 671_088_640;
    bonus1.Y = -2_147_483_648;
    bonus1.vitesse = 1_073_741_824;
    arrayList.add(bonus1);
    table.bonuss = arrayList;
    table.joueurY = -2_113_763_411;
    table.perdu = false;
    table.kelbonus = "?????????";
    table.highscore = 1_081_534_464;
    table.joueurX = 671_088_637;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 268_436_086;
    mechant.X = -1_467_949_061;
    mechant.Y = 41_981;
    mechant.vitesse = 1_310_419;
    arrayList1.add(mechant);
    final Mechant mechant1 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant1.direction = 630;
    mechant1.X = 671_088_646;
    mechant1.Y = 804;
    mechant1.vitesse = -16_777_214;
    arrayList1.add(mechant1);
    final Mechant mechant2 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant2.direction = 630;
    mechant2.X = 671_088_622;
    mechant2.Y = -2_113_763_393;
    mechant2.vitesse = 163_701;
    arrayList1.add(mechant2);
    final Mechant mechant3 = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant3.direction = 631;
    mechant3.X = 671_088_638;
    mechant3.Y = -2_113_763_392;
    mechant3.vitesse = 1_442_672_304;
    arrayList1.add(mechant3);
    table.mechants = arrayList1;
    table.level = 513;
    table.sc0re = 8_455_848;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = -2_147_483_646;
    final Graphics contexteGraphique = PowerMockito.mock(Graphics.class);

    // Act
    table.paintComponent(contexteGraphique);

    // Assert side effects
    final ArrayList<Bonus> arrayList2 = new ArrayList<Bonus>();
    Assert.assertEquals(arrayList2, table.bonuss);
    Assert.assertTrue(table.perdu);
    Assert.assertEquals(" +1 each ! !", table.kelbonus);
    final ArrayList<Mechant> arrayList3 = new ArrayList<Mechant>();
    Assert.assertEquals(arrayList3, table.mechants);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class, Table.class, JLabel.class})
  @Test
  public void creerMechantOutputVoid4() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", -44);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = "?";
    table.highscore = -805_306_367;
    table.joueurX = 0;
    table.score = -25;
    final ArrayList<Mechant> arrayList = new ArrayList<Mechant>();
    arrayList.add(null);
    table.mechants = arrayList;
    table.level = -5;
    table.sc0re = 43;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(0).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act
    table.creerMechant();

    // Assert side effects
    Assert.assertEquals(-24, table.score);
    Assert.assertNotNull(table.mechants);
    Assert.assertEquals(2, table.mechants.size());
    Assert.assertNull(table.mechants.get(0));
    Assert.assertNotNull(table.mechants.get(1));
    Assert.assertEquals(90, table.mechants.get(1).direction);
    Assert.assertEquals(0, table.mechants.get(1).X);
    Assert.assertEquals(0, table.mechants.get(1).Y);
    Assert.assertEquals(0, table.mechants.get(1).vitesse);
    Assert.assertEquals(0, table.sc0re);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class, Table.class, JLabel.class})
  @Test
  public void creerMechantOutputVoid3() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 1_572_500);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = "?";
    table.highscore = 1;
    table.joueurX = 0;
    table.score = 385_249_295;
    final ArrayList<Mechant> arrayList = new ArrayList<Mechant>();
    table.mechants = arrayList;
    table.level = -5;
    table.sc0re = 363;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(0).thenReturn(0).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act
    table.creerMechant();

    // Assert side effects
    Assert.assertEquals(385_249_296, table.score);
    Assert.assertNotNull(table.mechants);
    Assert.assertEquals(1, table.mechants.size());
    Assert.assertNotNull(table.mechants.get(0));
    Assert.assertEquals(90, table.mechants.get(0).direction);
    Assert.assertEquals(0, table.mechants.get(0).X);
    Assert.assertEquals(0, table.mechants.get(0).Y);
    Assert.assertEquals(15_409_972, table.mechants.get(0).vitesse);
    Assert.assertEquals(16_982_835, table.sc0re);
    Assert.assertEquals(15_409_971, table.nivo);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class, Table.class, JLabel.class})
  @Test
  public void creerMechantOutputVoid2() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 8);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = "??";
    table.highscore = 557_185;
    table.joueurX = 0;
    table.score = 1_893_334_650;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = -5;
    table.sc0re = -5;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(4).thenReturn(592).thenReturn(193);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act
    table.creerMechant();

    // Assert side effects
    Assert.assertEquals(1_893_334_651, table.score);
    Assert.assertNotNull(table.mechants);
    Assert.assertEquals(1, table.mechants.size());
    Assert.assertNotNull(table.mechants.get(0));
    Assert.assertEquals(630, table.mechants.get(0).direction);
    Assert.assertEquals(193, table.mechants.get(0).X);
    Assert.assertEquals(480, table.mechants.get(0).Y);
    Assert.assertEquals(4, table.mechants.get(0).vitesse);
    Assert.assertEquals(75_733_390, table.sc0re);
    Assert.assertEquals(75_733_386, table.nivo);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class, Table.class, JLabel.class})
  @Test
  public void creerMechantOutputVoid3() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 148);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    arrayList.add(null);
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = "foo";
    table.highscore = 43;
    table.joueurX = 0;
    table.score = 629_145_792;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    table.mechants = arrayList1;
    table.level = -10_000_000;
    table.sc0re = -149;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(705).thenReturn(225);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act
    table.creerMechant();

    // Assert side effects
    Assert.assertEquals(629_145_793, table.score);
    Assert.assertNotNull(table.mechants);
    Assert.assertEquals(1, table.mechants.size());
    Assert.assertNotNull(table.mechants.get(0));
    Assert.assertEquals(450, table.mechants.get(0).direction);
    Assert.assertEquals(0, table.mechants.get(0).X);
    Assert.assertEquals(225, table.mechants.get(0).Y);
    Assert.assertEquals(1, table.mechants.get(0).vitesse);
    Assert.assertEquals(25_165_831, table.sc0re);
    Assert.assertEquals(25_165_831, table.nivo);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class, Table.class, JLabel.class})
  @Test
  public void creerMechantOutputVoid5() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", -2_147_483_648);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = "?";
    table.highscore = 44;
    table.joueurX = 0;
    table.score = 1_677_721_727;
    final ArrayList<Mechant> arrayList = new ArrayList<Mechant>();
    arrayList.add(null);
    table.mechants = arrayList;
    table.level = -5;
    table.sc0re = -2_147_483_648;
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(128).thenReturn(65);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act
    table.creerMechant();

    // Assert side effects
    Assert.assertEquals(1_677_721_728, table.score);
    Assert.assertNotNull(table.mechants);
    Assert.assertEquals(2, table.mechants.size());
    Assert.assertNull(table.mechants.get(0));
    Assert.assertNotNull(table.mechants.get(1));
    Assert.assertEquals(270, table.mechants.get(1).direction);
    Assert.assertEquals(480, table.mechants.get(1).X);
    Assert.assertEquals(65, table.mechants.get(1).Y);
    Assert.assertEquals(1, table.mechants.get(1).vitesse);
    Assert.assertEquals(67_108_870, table.sc0re);
    Assert.assertEquals(67_108_869, table.nivo);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void creerBonusOutputVoid2() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    arrayList.add(null);
    arrayList.add(null);
    table.bonuss = arrayList;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 0;
    final ArrayList<Mechant> arrayList1 = new ArrayList<Mechant>();
    arrayList1.add(null);
    table.mechants = arrayList1;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(0).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act
    table.creerBonus();

    // Assert side effects
    Assert.assertNotNull(table.bonuss);
    Assert.assertEquals(3, table.bonuss.size());
    Assert.assertNull(table.bonuss.get(0));
    Assert.assertNull(table.bonuss.get(1));
    Assert.assertNotNull(table.bonuss.get(2));
    Assert.assertEquals(90, table.bonuss.get(2).direction);
    Assert.assertEquals(0, table.bonuss.get(2).X);
    Assert.assertEquals(0, table.bonuss.get(2).Y);
    Assert.assertEquals(5, table.bonuss.get(2).vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void creerBonusOutputVoid3() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
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
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(332).thenReturn(3).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act
    table.creerBonus();

    // Assert side effects
    Assert.assertNotNull(table.bonuss);
    Assert.assertEquals(1, table.bonuss.size());
    Assert.assertNotNull(table.bonuss.get(0));
    Assert.assertEquals(0, table.bonuss.get(0).direction);
    Assert.assertEquals(0, table.bonuss.get(0).X);
    Assert.assertEquals(480, table.bonuss.get(0).Y);
    Assert.assertEquals(3, table.bonuss.get(0).vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void creerBonusOutputVoid2() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    final ArrayList<Bonus> arrayList = new ArrayList<Bonus>();
    table.bonuss = arrayList;
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
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(0).thenReturn(0).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act
    table.creerBonus();

    // Assert side effects
    Assert.assertNotNull(table.bonuss);
    Assert.assertEquals(1, table.bonuss.size());
    Assert.assertNotNull(table.bonuss.get(0));
    Assert.assertEquals(90, table.bonuss.get(0).direction);
    Assert.assertEquals(0, table.bonuss.get(0).X);
    Assert.assertEquals(0, table.bonuss.get(0).Y);
    Assert.assertEquals(5, table.bonuss.get(0).vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({JLabel.class, Table.class})
  @Test
  public void affecterTexteMessageInputNullOutputVoid() throws Exception {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.affecterTexteMessage(or(isA(String.class), isNull(String.class)));
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
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 0;
    final String texte = null;

    // Act
    table.affecterTexteMessage(texte);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({JLabel.class, Table.class})
  @Test
  public void affecterTexteMessageInputNotNullOutputVoid() throws Exception {

    // Arrange
    final Table table = PowerMockito.mock(Table.class);
    PowerMockito.doCallRealMethod().when(table);
    table.affecterTexteMessage(or(isA(String.class), isNull(String.class)));
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
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 0;
    final String texte = "foo";

    // Act
    table.affecterTexteMessage(texte);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Container.class, Table.class, JLabel.class})
  @Test
  public void ajouteAuCadreInputNotNullOutputVoid() throws Exception {

    // Arrange
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
    final Container conteneur = PowerMockito.mock(Container.class);
    final Method addMethod = DTUMemberMatcher.method(Container.class, "add", Component.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null).doReturn(null))
        .when(conteneur, addMethod)
        .withArguments(or(isA(Component.class), isNull(Component.class)));
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    PowerMockito.whenNew(JLabel.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(jLabel);
    final BoxLayout boxLayout = PowerMockito.mock(BoxLayout.class);
    PowerMockito.whenNew(BoxLayout.class)
        .withParameterTypes(Container.class, int.class)
        .withArguments(or(isA(Container.class), isNull(Container.class)), anyInt())
        .thenReturn(boxLayout);

    // Act
    table.ajouteAuCadre(conteneur);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Container.class, Table.class, JLabel.class})
  @Test
  public void ajouteAuCadreInputNotNullOutputVoid3() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 1;
    table.joueurX = 0;
    table.score = 0;
    final ArrayList<Mechant> arrayList = new ArrayList<Mechant>();
    table.mechants = arrayList;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Container conteneur = PowerMockito.mock(Container.class);
    final Method addMethod = DTUMemberMatcher.method(Container.class, "add", Component.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null).doReturn(null))
        .when(conteneur, addMethod)
        .withArguments(or(isA(Component.class), isNull(Component.class)));
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    PowerMockito.whenNew(JLabel.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(jLabel);
    final BoxLayout boxLayout = PowerMockito.mock(BoxLayout.class);
    PowerMockito.whenNew(BoxLayout.class)
        .withParameterTypes(Container.class, int.class)
        .withArguments(or(isA(Container.class), isNull(Container.class)), anyInt())
        .thenReturn(boxLayout);

    // Act
    table.ajouteAuCadre(conteneur);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Container.class, Table.class, JLabel.class})
  @Test
  public void ajouteAuCadreInputNotNullOutputVoid2() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 1;
    table.joueurX = 0;
    table.score = 0;
    final ArrayList<Mechant> arrayList = new ArrayList<Mechant>();
    arrayList.add(null);
    table.mechants = arrayList;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Container conteneur = PowerMockito.mock(Container.class);
    final Method addMethod = DTUMemberMatcher.method(Container.class, "add", Component.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null).doReturn(null))
        .when(conteneur, addMethod)
        .withArguments(or(isA(Component.class), isNull(Component.class)));
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    PowerMockito.whenNew(JLabel.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(jLabel);
    final BoxLayout boxLayout = PowerMockito.mock(BoxLayout.class);
    PowerMockito.whenNew(BoxLayout.class)
        .withParameterTypes(Container.class, int.class)
        .withArguments(or(isA(Container.class), isNull(Container.class)), anyInt())
        .thenReturn(boxLayout);

    // Act
    table.ajouteAuCadre(conteneur);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Container.class, Table.class, JLabel.class})
  @Test
  public void ajouteAuCadreInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
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
    final JLabel jLabel = PowerMockito.mock(JLabel.class);
    Reflector.setField(table, "label", jLabel);
    table.nivo = 0;
    final Container conteneur = PowerMockito.mock(Container.class);
    final Component component1 = (Component)Reflector.getInstance("java.awt.Component");
    final Component component = (Component)Reflector.getInstance("java.awt.Component");
    final Method addMethod = DTUMemberMatcher.method(Container.class, "add", Component.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(component).doReturn(component1))
        .when(conteneur, addMethod)
        .withArguments(or(isA(Component.class), isNull(Component.class)));
    final JLabel jLabel1 = PowerMockito.mock(JLabel.class);
    PowerMockito.whenNew(JLabel.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(jLabel1);
    final BoxLayout boxLayout = PowerMockito.mock(BoxLayout.class);
    PowerMockito.whenNew(BoxLayout.class)
        .withParameterTypes(Container.class, int.class)
        .withArguments(or(isA(Container.class), isNull(Container.class)), anyInt())
        .thenReturn(boxLayout);

    // Act
    table.ajouteAuCadre(conteneur);

    // The method returns void, testing that no exception is thrown
  }
}
