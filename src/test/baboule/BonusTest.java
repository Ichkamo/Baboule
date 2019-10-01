package baboule;

import static org.mockito.Matchers.anyInt;

import baboule.Bonus;
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
public class BonusTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid11() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(3).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(3, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNotNullOutputVoid() throws Exception {

    // Arrange
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
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(0).thenReturn(0).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(5, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNotNullOutputVoid3() throws Exception {

    // Arrange
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
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(182).thenReturn(4).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(180, actual.direction);
    Assert.assertEquals(1, actual.X);
    Assert.assertEquals(4, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
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
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(176).thenReturn(3).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(270, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(3, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
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
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(352).thenReturn(3).thenReturn(225);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(225, actual.X);
    Assert.assertEquals(480, actual.Y);
    Assert.assertEquals(3, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid1() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(0).thenReturn(0).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(5, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid2() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(0).thenReturn(4).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(4, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid3() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(182).thenReturn(4).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(180, actual.direction);
    Assert.assertEquals(1, actual.X);
    Assert.assertEquals(4, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid4() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(176).thenReturn(3).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(270, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(3, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid5() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(320).thenReturn(3).thenReturn(128);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(128, actual.X);
    Assert.assertEquals(480, actual.Y);
    Assert.assertEquals(3, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid6() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(0).thenReturn(5).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(5, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid7() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(90).thenReturn(5).thenReturn(4);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(270, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(4, actual.Y);
    Assert.assertEquals(5, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid8() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(180).thenReturn(5).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(180, actual.direction);
    Assert.assertEquals(5, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid9() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(270).thenReturn(5).thenReturn(5);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(5, actual.X);
    Assert.assertEquals(480, actual.Y);
    Assert.assertEquals(5, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid10() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1).thenReturn(0).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(5, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
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
    table.score = 0;
    table.mechants = null;
    table.level = 0;
    table.sc0re = 0;
    Reflector.setField(table, "label", null);
    table.nivo = 0;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(0).thenReturn(4).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(90, actual.direction);
    Assert.assertEquals(4, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid12() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(90).thenReturn(3).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(270, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(1, actual.Y);
    Assert.assertEquals(3, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid13() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(218).thenReturn(3).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(180, actual.direction);
    Assert.assertEquals(3, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid14() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(353).thenReturn(3).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(1, actual.X);
    Assert.assertEquals(480, actual.Y);
    Assert.assertEquals(3, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid15() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(299).thenReturn(4).thenReturn(5);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(5, actual.X);
    Assert.assertEquals(480, actual.Y);
    Assert.assertEquals(4, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid16() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(265).thenReturn(5).thenReturn(5);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(180, actual.direction);
    Assert.assertEquals(5, actual.X);
    Assert.assertEquals(5, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid17() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(128).thenReturn(5).thenReturn(5);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(270, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(5, actual.Y);
    Assert.assertEquals(5, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid18() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(328).thenReturn(4).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(1, actual.X);
    Assert.assertEquals(480, actual.Y);
    Assert.assertEquals(4, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid19() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(264).thenReturn(5).thenReturn(1);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(180, actual.direction);
    Assert.assertEquals(1, actual.X);
    Assert.assertEquals(5, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Random.class, Bonus.class})
  @Test
  public void constructorInputNullOutputVoid20() throws Exception {

    // Arrange
    final Table table = null;
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(128).thenReturn(5).thenReturn(0);
    PowerMockito.whenNew(Random.class).withNoArguments().thenReturn(random);

    // Act, creating object to test constructor
    final Bonus actual = new Bonus(table);

    // Assert side effects
    Assert.assertEquals(270, actual.direction);
    Assert.assertEquals(480, actual.X);
    Assert.assertEquals(5, actual.vitesse);
  }

  // Test written by Diffblue Cover.
  @Test
  public void deplacementOutputVoid() throws InvocationTargetException {

    // Arrange
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 0;
    bonus.X = 0;
    bonus.Y = 0;
    bonus.vitesse = 0;

    // Act
    bonus.deplacement();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void deplacementOutputVoid1() throws InvocationTargetException {

    // Arrange
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 32;
    bonus.X = 0;
    bonus.Y = 0;
    bonus.vitesse = 0;

    // Act
    bonus.deplacement();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void deplacementOutputVoid2() throws InvocationTargetException {

    // Arrange
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 90;
    bonus.X = 0;
    bonus.Y = 0;
    bonus.vitesse = 0;

    // Act
    bonus.deplacement();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void deplacementOutputVoid3() throws InvocationTargetException {

    // Arrange
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 270;
    bonus.X = 0;
    bonus.Y = 0;
    bonus.vitesse = 0;

    // Act
    bonus.deplacement();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void deplacementOutputVoid4() throws InvocationTargetException {

    // Arrange
    final Bonus bonus = (Bonus)Reflector.getInstance("baboule.Bonus");
    bonus.direction = 180;
    bonus.X = 0;
    bonus.Y = 0;
    bonus.vitesse = 0;

    // Act
    bonus.deplacement();

    // The method returns void, testing that no exception is thrown
  }
}
