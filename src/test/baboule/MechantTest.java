package baboule;

import static org.mockito.Matchers.anyInt;

import baboule.Mechant;
import baboule.Table;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class MechantTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid36() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 75;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(14).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(1, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid1() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = -25;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(0).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid2() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 13_107_175;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(524_288).thenReturn(96).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(270, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(1, actual.Y);
    Assert.assertEquals(524_288, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid4() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 196;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(8).thenReturn(90).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(270, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(1, actual.Y);
    Assert.assertEquals(8, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid5() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 196;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(8).thenReturn(218).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(180, actual.direction);
    Assert.assertEquals(8, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid6() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 79;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(4).thenReturn(218).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(180, actual.direction);
    Assert.assertEquals(4, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid7() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 1_677_721_679;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt()))
        .thenReturn(67_108_868)
        .thenReturn(270)
        .thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(1, actual.X);
    Assert.assertEquals(480, actual.Y);
    Assert.assertEquals(67_108_868, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid8() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 1_677_721_679;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt()))
        .thenReturn(67_108_868)
        .thenReturn(398)
        .thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(360, actual.direction);
    Assert.assertEquals(67_108_868, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid9() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 1_677_721_679;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt()))
        .thenReturn(67_108_868)
        .thenReturn(456)
        .thenReturn(142);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(540, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(142, actual.Y);
    Assert.assertEquals(67_108_868, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid10() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 106;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(4).thenReturn(72).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(4, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid11() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 127;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(4).thenReturn(90).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(270, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(4, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid12() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 1_677_721_727;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt()))
        .thenReturn(67_108_868)
        .thenReturn(540)
        .thenReturn(352);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(630, actual.direction);
    Assert.assertEquals(352, actual.X);
    Assert.assertEquals(480, actual.Y);
    Assert.assertEquals(67_108_868, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid13() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 1_677_721_727;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt()))
        .thenReturn(67_108_868)
        .thenReturn(636)
        .thenReturn(24);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(450, actual.direction);
    Assert.assertEquals(24, actual.Y);
    Assert.assertEquals(67_108_868, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid14() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 169;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(0).thenReturn(480).thenReturn(154);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(540, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(154, actual.Y);
    Assert.assertEquals(7, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid15() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 42;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(0).thenReturn(176).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(270, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(2, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid16() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 17;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(0).thenReturn(48).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid17() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 125;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(94).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(270, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(1, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid18() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 125;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(198).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(180, actual.direction);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid19() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 1;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(66).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid20() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 101;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(66).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid21() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 29;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(176).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(270, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid22() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 158;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(48).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid23() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 95;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(182).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(180, actual.direction);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid24() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 191;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(224).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(180, actual.direction);
    Assert.assertEquals(1, actual.X);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid25() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 316;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(480).thenReturn(257);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(540, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(257, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid26() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 316;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(448).thenReturn(224);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(360, actual.direction);
    Assert.assertEquals(224, actual.X);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid27() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 316;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(603).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(630, actual.direction);
    Assert.assertEquals(480, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid28() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 838_860_958;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(656).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(450, actual.direction);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid29() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 838_860_991;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(272).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(480, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid30() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 25;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(0).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid31() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 25;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(154).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(270, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(1, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid32() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 150;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(154).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(270, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(1, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid33() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 150;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(260).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(180, actual.direction);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid34() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 150;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(271).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(1, actual.X);
    Assert.assertEquals(480, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid35() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 175;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(270).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(1, actual.X);
    Assert.assertEquals(480, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid35() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 13_107_175;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(524_288).thenReturn(0).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(524_288, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid37() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 838_860_875;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(14).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(1, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid38() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = -24;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(14).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(1, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid39() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 1_677_721_624;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(398).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(360, actual.direction);
    Assert.assertEquals(1, actual.X);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid40() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 136;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(360).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(360, actual.direction);
    Assert.assertEquals(1, actual.X);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid41() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 1736;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(450).thenReturn(360);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(540, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(360, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid42() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 1784;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(631).thenReturn(450);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(450, actual.direction);
    Assert.assertEquals(450, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid43() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 1784;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(626).thenReturn(66);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(630, actual.direction);
    Assert.assertEquals(66, actual.X);
    Assert.assertEquals(480, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid44() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 120;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(354).thenReturn(65);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(65, actual.X);
    Assert.assertEquals(480, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid45() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 13_107_175;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(524_288).thenReturn(90).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(270, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(1, actual.Y);
    Assert.assertEquals(524_288, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid46() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 185;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(92).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(270, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(1, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid47() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 185;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(218).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(180, actual.direction);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid48() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 185;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(448).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(360, actual.direction);
    Assert.assertEquals(1, actual.X);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid49() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 185;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(452).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(540, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid50() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 185;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(324).thenReturn(224);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(224, actual.X);
    Assert.assertEquals(480, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid51() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 3385;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(631).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(450, actual.direction);
    Assert.assertEquals(1, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid52() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 3385;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(615).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(630, actual.direction);
    Assert.assertEquals(480, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid53() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 153;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(181).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(180, actual.direction);
    Assert.assertEquals(1, actual.X);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid54() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 136;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(181).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(180, actual.direction);
    Assert.assertEquals(1, actual.X);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid55() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 40;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(53).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(1, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid56() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 113;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(164).thenReturn(64);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(270, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(64, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid57() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 81;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(36).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(1, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Mechant.class})
  @Test
  public void constructorInputNotNullOutputVoid58() throws Exception {

    // Arrange
    final Table table = new Table();
    Reflector.setField(table, "nulbonul", 0);
    table.bonuss = null;
    table.joueurY = 0;
    table.perdu = false;
    table.kelbonus = null;
    table.highscore = 0;
    table.joueurX = 0;
    table.score = 17;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(0).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Mechant actual = new Mechant(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(1, actual.Y);
    Assert.assertEquals(1, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @Test
  public void deplacementOutputVoid() throws InvocationTargetException {

    // Arrange
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 270;
    mechant.X = 0;
    mechant.Y = 0;
    mechant.vitesse = 0;

    // Act
    mechant.deplacement();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void deplacementOutputVoid1() throws InvocationTargetException {

    // Arrange
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 0;
    mechant.X = 0;
    mechant.Y = 0;
    mechant.vitesse = 0;

    // Act
    mechant.deplacement();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void deplacementOutputVoid2() throws InvocationTargetException {

    // Arrange
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 540;
    mechant.X = 0;
    mechant.Y = 0;
    mechant.vitesse = 0;

    // Act
    mechant.deplacement();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void deplacementOutputVoid3() throws InvocationTargetException {

    // Arrange
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 630;
    mechant.X = 0;
    mechant.Y = 0;
    mechant.vitesse = 0;

    // Act
    mechant.deplacement();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void deplacementOutputVoid4() throws InvocationTargetException {

    // Arrange
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 450;
    mechant.X = 0;
    mechant.Y = 0;
    mechant.vitesse = 0;

    // Act
    mechant.deplacement();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void deplacementOutputVoid5() throws InvocationTargetException {

    // Arrange
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 360;
    mechant.X = 0;
    mechant.Y = 0;
    mechant.vitesse = 0;

    // Act
    mechant.deplacement();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void deplacementOutputVoid6() throws InvocationTargetException {

    // Arrange
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 512;
    mechant.X = 0;
    mechant.Y = 0;
    mechant.vitesse = 0;

    // Act
    mechant.deplacement();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void deplacementOutputVoid7() throws InvocationTargetException {

    // Arrange
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 90;
    mechant.X = 0;
    mechant.Y = 0;
    mechant.vitesse = 0;

    // Act
    mechant.deplacement();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void deplacementOutputVoid8() throws InvocationTargetException {

    // Arrange
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 180;
    mechant.X = 0;
    mechant.Y = 0;
    mechant.vitesse = 0;

    // Act
    mechant.deplacement();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void deplacementOutputVoid9() throws InvocationTargetException {

    // Arrange
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 32;
    mechant.X = 0;
    mechant.Y = 0;
    mechant.vitesse = 0;

    // Act
    mechant.deplacement();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void deplacementOutputVoid10() throws InvocationTargetException {

    // Arrange
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 360;
    mechant.X = 0;
    mechant.Y = 0;
    mechant.vitesse = 0;

    // Act
    mechant.deplacement();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void deplacementOutputVoid11() throws InvocationTargetException {

    // Arrange
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 540;
    mechant.X = 0;
    mechant.Y = 0;
    mechant.vitesse = 0;

    // Act
    mechant.deplacement();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void deplacementOutputVoid12() throws InvocationTargetException {

    // Arrange
    final Mechant mechant = (Mechant)Reflector.getInstance("baboule.Mechant");
    mechant.direction = 450;
    mechant.X = 0;
    mechant.Y = 0;
    mechant.vitesse = 0;

    // Act
    mechant.deplacement();

    // The method returns void, testing that no exception is thrown
  }
}
