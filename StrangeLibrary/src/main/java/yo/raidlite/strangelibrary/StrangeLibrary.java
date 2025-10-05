package yo.raidlite.strangelibrary;

import org.bukkit.plugin.java.JavaPlugin;
import yo.raidlite.strangelibrary.utils.Утилита;

@SuppressWarnings(
        {"NonAsciiCharacters",
                "ClassNamingConvention",
                "MethodNamingConvention",
                "FieldNamingConvention",
                "ParameterNamingConvention",
                "LocalVariableNamingConvention"}
)
public final class StrangeLibrary extends JavaPlugin {

    @Override
    public void onEnable() {
        Утилита утилита = new Утилита();
        утилита.вывести("Библиотека запущена!");
    }
}