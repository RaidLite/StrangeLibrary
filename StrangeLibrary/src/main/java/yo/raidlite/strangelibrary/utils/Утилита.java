package yo.raidlite.strangelibrary.utils;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.stream.*;

@SuppressWarnings(
        {"NonAsciiCharacters",
                "ClassNamingConvention",
                "MethodNamingConvention",
                "FieldNamingConvention",
                "ParameterNamingConvention",
                "LocalVariableNamingConvention"}
)
public class Утилита {

    public static void вывести(Object объект) {
        System.out.print(объект);
    }

    public static void вывестиСтроку(Object объект) {
        System.out.println(объект);
    }

    public static void вывестиОшибку(Object объект) {
        System.err.println(объект);
    }

    public static long текущееВремя() {
        return System.currentTimeMillis();
    }

    public static void выход(int код) {
        System.exit(код);
    }

    public static Properties системныеСвойства() {
        return System.getProperties();
    }

    public static String получитьСвойство(String ключ) {
        return System.getProperty(ключ);
    }

    public static String объединитьСтроки(String разделитель, String... строки) {
        return String.join(разделитель, строки);
    }

    public static String форматСтроки(String формат, Object... аргументы) {
        return String.format(формат, аргументы);
    }

    public static boolean пустаяСтрока(String строка) {
        return строка == null || строка.isEmpty();
    }

    public static boolean равнаСтрока(String стр1, String стр2) {
        return Objects.equals(стр1, стр2);
    }

    public static String обрезатьПробелы(String строка) {
        return строка.trim();
    }

    public static String заменитьВсе(String строка, String цель, String замена) {
        return строка.replaceAll(цель, замена);
    }

    public static String верхнийРегистр(String строка) {
        return строка.toUpperCase();
    }

    public static String нижнийРегистр(String строка) {
        return строка.toLowerCase();
    }

    public static boolean содержит(String строка, String подстрока) {
        return строка.contains(подстрока);
    }

    public static String подстрока(String строка, int начало, int конец) {
        return строка.substring(начало, конец);
    }

    public static String[] разделитьСтроку(String строка, String разделитель) {
        return строка.split(разделитель);
    }

    public static int максимум(int a, int b) {
        return Math.max(a, b);
    }

    public static int минимум(int a, int b) {
        return Math.min(a, b);
    }

    public static double синус(double угол) {
        return Math.sin(угол);
    }

    public static double косинус(double угол) {
        return Math.cos(угол);
    }

    public static double тангенс(double угол) {
        return Math.tan(угол);
    }

    public static double кореньКвадратный(double число) {
        return Math.sqrt(число);
    }

    public static double степень(double основание, double показатель) {
        return Math.pow(основание, показатель);
    }

    public static double абсолютноеЗначение(double число) {
        return Math.abs(число);
    }

    public static long округлить(double число) {
        return Math.round(число);
    }

    public static double случайноеЧисло() {
        return Math.random();
    }

    public static double экспонента(double степень) {
        return Math.exp(степень);
    }

    public static double логарифм(double число) {
        return Math.log(число);
    }

    public static <T> List<T> массивВСписок(T[] массив) {
        return Arrays.asList(массив);
    }

    public static void сортироватьМассив(int[] массив) {
        Arrays.sort(массив);
    }

    public static boolean равенствоМассивов(Object[] arr1, Object[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void заполнитьМассив(int[] массив, int значение) {
        Arrays.fill(массив, значение);
    }

    public static <T> T[] копироватьМассив(T[] оригинал) {
        return Arrays.copyOf(оригинал, оригинал.length);
    }

    public static <T> List<T> создатьСписок() {
        return new ArrayList<>();
    }

    public static <K,V> Map<K,V> создатьКарту() {
        return new HashMap<>();
    }

    public static <T> Set<T> создатьМножество() {
        return new HashSet<>();
    }

    public static <T> void добавитьВСписок(List<T> список, T элемент) {
        список.add(элемент);
    }

    public static <T> boolean содержитЭлемент(Collection<T> коллекция, T элемент) {
        return коллекция.contains(элемент);
    }

    public static <T> void удалитьИзСписка(List<T> список, T элемент) {
        список.remove(элемент);
    }

    public static <T> int размерКоллекции(Collection<T> коллекция) {
        return коллекция.size();
    }

    public static <T> boolean пустаяКоллекция(Collection<T> коллекция) {
        return коллекция.isEmpty();
    }

    public static <T> void очиститьКоллекцию(Collection<T> коллекция) {
        коллекция.clear();
    }

    public static <T> void сортироватьСписок(List<T> список) {
        Collections.sort((List<Comparable>) список);
    }

    public static <T> T получитьИзСписка(List<T> список, int индекс) {
        return список.get(индекс);
    }

    public static boolean файлСуществует(String путь) {
        return Files.exists(Paths.get(путь));
    }

    public static void создатьФайл(String путь) throws IOException {
        Files.createFile(Paths.get(путь));
    }

    public static void создатьДиректорию(String путь) throws IOException {
        Files.createDirectories(Paths.get(путь));
    }

    public static List<String> прочитатьВсеСтроки(String путь) throws IOException {
        return Files.readAllLines(Paths.get(путь));
    }

    public static String прочитатьФайл(String путь) throws IOException {
        return new String(Files.readAllBytes(Paths.get(путь)));
    }

    public static void записатьВФайл(String путь, String содержимое) throws IOException {
        Files.write(Paths.get(путь), содержимое.getBytes());
    }

    public static void удалитьФайл(String путь) throws IOException {
        Files.delete(Paths.get(путь));
    }

    public static boolean этоДиректория(String путь) {
        return Files.isDirectory(Paths.get(путь));
    }

    public static long размерФайла(String путь) throws IOException {
        return Files.size(Paths.get(путь));
    }

    public static LocalDate текущаяДата() {
        return LocalDate.now();
    }

    public static LocalDateTime текущаяДатаИВремя() {
        return LocalDateTime.now();
    }

    public static String форматироватьДату(LocalDate дата, String формат) {
        return дата.format(DateTimeFormatter.ofPattern(формат));
    }

    public static LocalDate парситьДату(String датаСтрока, String формат) {
        return LocalDate.parse(датаСтрока, DateTimeFormatter.ofPattern(формат));
    }

    public static LocalDateTime парситьДатуВремя(String датаВремяСтрока, String формат) {
        return LocalDateTime.parse(датаВремяСтрока, DateTimeFormatter.ofPattern(формат));
    }

    public static int получитьГод(LocalDate дата) {
        return дата.getYear();
    }

    public static int получитьМесяц(LocalDate дата) {
        return дата.getMonthValue();
    }

    public static int получитьДень(LocalDate дата) {
        return дата.getDayOfMonth();
    }

    public static <T> Stream<T> создатьПотокИзСписка(List<T> список) {
        return список.stream();
    }

    public static <T> List<T> собратьПотокВСписок(Stream<T> поток) {
        return поток.collect(Collectors.toList());
    }

    public static <T> List<T> фильтроватьСписок(List<T> список, java.util.function.Predicate<T> условие) {
        return список.stream().filter(условие).collect(Collectors.toList());
    }

    public static <T,R> List<R> преобразоватьСписок(List<T> список, java.util.function.Function<T,R> функция) {
        return список.stream().map(функция).collect(Collectors.toList());
    }

    public static <T> Optional<T> найтиПервый(List<T> список, java.util.function.Predicate<T> условие) {
        return список.stream().filter(условие).findFirst();
    }

    public static int строкуВЧисло(String строка) {
        return Integer.parseInt(строка);
    }

    public static double строкуВДробное(String строка) {
        return Double.parseDouble(строка);
    }

    public static String числоВСтроку(int число) {
        return String.valueOf(число);
    }

    public static String дробноеВСтроку(double число) {
        return String.valueOf(число);
    }

    public static boolean строкуВБулево(String строка) {
        return Boolean.parseBoolean(строка);
    }

    public static boolean равно(Object obj1, Object obj2) {
        return Objects.equals(obj1, obj2);
    }

    public static boolean неРавно(Object obj1, Object obj2) {
        return !Objects.equals(obj1, obj2);
    }

    public static boolean больше(int a, int b) {
        return a > b;
    }

    public static boolean меньше(int a, int b) {
        return a < b;
    }

    public static boolean большеИлиРавно(int a, int b) {
        return a >= b;
    }

    public static boolean меньшеИлиРавно(int a, int b) {
        return a <= b;
    }

    public static boolean и(boolean a, boolean b) {
        return a && b;
    }

    public static boolean или(boolean a, boolean b) {
        return a || b;
    }

    public static boolean не(boolean a) {
        return !a;
    }

    public static void выброситьИсключение(String сообщение) throws Exception {
        throw new Exception(сообщение);
    }

    public static void выброситьRuntimeИсключение(String сообщение) {
        throw new RuntimeException(сообщение);
    }

    public static int хэшКод(Object объект) {
        return Objects.hashCode(объект);
    }

    public static boolean являетсяNull(Object объект) {
        return объект == null;
    }

    public static boolean неNull(Object объект) {
        return объект != null;
    }

    public static String классОбъекта(Object объект) {
        return объект.getClass().getName();
    }

    public static boolean этоБуква(char символ) {
        return Character.isLetter(символ);
    }

    public static boolean этоЦифра(char символ) {
        return Character.isDigit(символ);
    }

    public static boolean этоПробел(char символ) {
        return Character.isWhitespace(символ);
    }

    public static char верхнийРегистрСимвола(char символ) {
        return Character.toUpperCase(символ);
    }

    public static char нижнийРегистрСимвола(char символ) {
        return Character.toLowerCase(символ);
    }

    public static boolean истина() {
        return true;
    }

    public static boolean ложь() {
        return false;
    }

    public static boolean логическоеИ(boolean a, boolean b) {
        return a && b;
    }

    public static boolean логическоеИли(boolean a, boolean b) {
        return a || b;
    }

    public static boolean логическоеНе(boolean a) {
        return !a;
    }

    public static int сумма(int a, int b) {
        return a + b;
    }

    public static int разность(int a, int b) {
        return a - b;
    }

    public static int произведение(int a, int b) {
        return a * b;
    }

    public static double деление(int a, int b) {
        return (double) a / b;
    }

    public static int остатокОтДеления(int a, int b) {
        return a % b;
    }

    public static int инкремент(int число) {
        return число + 1;
    }

    public static int декремент(int число) {
        return число - 1;
    }

    public static <T extends Comparable<T>> int сравнить(T obj1, T obj2) {
        return obj1.compareTo(obj2);
    }

    public static <T extends Comparable<T>> boolean большеЧем(T obj1, T obj2) {
        return obj1.compareTo(obj2) > 0;
    }

    public static <T extends Comparable<T>> boolean меньшеЧем(T obj1, T obj2) {
        return obj1.compareTo(obj2) < 0;
    }

    public static <T> Queue<T> создатьОчередь() {
        return new LinkedList<>();
    }

    public static <T> void добавитьВОчередь(Queue<T> очередь, T элемент) {
        очередь.add(элемент);
    }

    public static <T> T удалитьИзОчереди(Queue<T> очередь) {
        return очередь.poll();
    }

    public static <T> Deque<T> создатьСтек() {
        return new ArrayDeque<>();
    }

    public static <T> void положитьВСтек(Deque<T> стек, T элемент) {
        стек.push(элемент);
    }

    public static <T> T взятьИзСтека(Deque<T> стек) {
        return стек.pop();
    }

    public static int случайноеЦелое(int граница) {
        return new Random().nextInt(граница);
    }

    public static int случайноеЦелоеВДиапазоне(int мин, int макс) {
        return new Random().nextInt(макс - мин) + мин;
    }

    public static double случайноеДробное() {
        return new Random().nextDouble();
    }

    public static boolean случайноеБулево() {
        return new Random().nextBoolean();
    }

    public static String ввестиСтроку() {
        return new Scanner(System.in).nextLine();
    }

    public static int ввестиЧисло() {
        return new Scanner(System.in).nextInt();
    }

    public static double ввестиДробное() {
        return new Scanner(System.in).nextDouble();
    }

    public static boolean ввестиБулево() {
        return new Scanner(System.in).nextBoolean();
    }

    public static String повторениеСтроки(String строка, int количество) {
        return строка.repeat(количество);
    }

    public static boolean начинаетсяС(String строка, String префикс) {
        return строка.startsWith(префикс);
    }

    public static boolean заканчиваетсяНа(String строка, String суффикс) {
        return строка.endsWith(суффикс);
    }

    public static int индексПервогоВхождения(String строка, String подстрока) {
        return строка.indexOf(подстрока);
    }

    public static int индексПоследнегоВхождения(String строка, String подстрока) {
        return строка.lastIndexOf(подстрока);
    }

    public static String удалитьПробелы(String строка) {
        return строка.replaceAll("\\s+", "");
    }

    public static boolean файлСуществуетЧерезFile(String путь) {
        return new File(путь).exists();
    }

    public static boolean этоФайл(String путь) {
        return new File(путь).isFile();
    }

    public static String[] списокФайлов(String путь) {
        return new File(путь).list();
    }

    public static long размерФайлаЧерезFile(String путь) {
        return new File(путь).length();
    }

    public static boolean удалитьФайлЧерезFile(String путь) {
        return new File(путь).delete();
    }

    public static byte[] строкуВБайты(String строка) {
        return строка.getBytes();
    }

    public static String байтыВСтроку(byte[] байты) {
        return new String(байты);
    }

    public static byte[] строкуВБайтыUTF8(String строка) {
        return строка.getBytes(StandardCharsets.UTF_8);
    }

    public static String байтыВСтрокуUTF8(byte[] байты) {
        return new String(байты, StandardCharsets.UTF_8);
    }

    public static boolean соответствуетРегулярке(String строка, String регулярка) {
        return строка.matches(регулярка);
    }

    public static String[] разделитьПоРегулярке(String строка, String регулярка) {
        return строка.split(регулярка);
    }

    public static String заменитьПоРегулярке(String строка, String регулярка, String замена) {
        return строка.replaceAll(регулярка, замена);
    }

    public static void пауза(long миллисекунды) throws InterruptedException {
        Thread.sleep(миллисекунды);
    }

    public static long измеритьВремя(Runnable задача) {
        long начало = System.currentTimeMillis();
        задача.run();
        return System.currentTimeMillis() - начало;
    }

    public static String версияJava() {
        return System.getProperty("java.version");
    }

    public static String операционнаяСистема() {
        return System.getProperty("os.name");
    }

    public static String архитектураОС() {
        return System.getProperty("os.arch");
    }

    public static String пользователь() {
        return System.getProperty("user.name");
    }

    public static String домашняяДиректория() {
        return System.getProperty("user.home");
    }

    public static Map<String, String> переменныеОкружения() {
        return System.getenv();
    }

    public static String получитьПеременнуюОкружения(String имя) {
        return System.getenv(имя);
    }

    public static class СтроительСтрок {
        private final StringBuilder builder = new StringBuilder();

        public СтроительСтрок добавить(String строка) {
            builder.append(строка);
            return this;
        }

        public СтроительСтрок добавитьСНовойСтрокой(String строка) {
            builder.append("\n").append(строка);
            return this;
        }

        public String получитьРезультат() {
            return builder.toString();
        }

        public void очистить() {
            builder.setLength(0);
        }
    }

    public static <T> List<T> обратныйСписок(List<T> список) {
        List<T> результат = new ArrayList<>(список);
        Collections.reverse(результат);
        return результат;
    }

    public static <T> Set<T> объединитьМножества(Set<T> set1, Set<T> set2) {
        Set<T> результат = new HashSet<>(set1);
        результат.addAll(set2);
        return результат;
    }

    public static <T> List<T> объединитьСписки(List<T> list1, List<T> list2) {
        List<T> результат = new ArrayList<>(list1);
        результат.addAll(list2);
        return результат;
    }

    public static int[] создатьМассивЦелых(int размер) {
        return new int[размер];
    }

    public static int[] заполнитьМассивЦелых(int размер, int значение) {
        int[] массив = new int[размер];
        Arrays.fill(массив, значение);
        return массив;
    }

    public static int[] преобразоватьСписокВМассив(List<Integer> список) {
        return список.stream().mapToInt(i -> i).toArray();
    }

    public static List<Integer> преобразоватьМассивВСписок(int[] массив) {
        return Arrays.stream(массив).boxed().collect(Collectors.toList());
    }

    public static double пи() {
        return Math.PI;
    }

    public static double е() {
        return Math.E;
    }

    public static double логарифм10(double число) {
        return Math.log10(число);
    }

    public static double арксинус(double значение) {
        return Math.asin(значение);
    }

    public static double арккосинус(double значение) {
        return Math.acos(значение);
    }

    public static double арктангенс(double значение) {
        return Math.atan(значение);
    }

    public static double гиперболическийСинус(double угол) {
        return Math.sinh(угол);
    }

    public static double гиперболическийКосинус(double угол) {
        return Math.cosh(угол);
    }

    public static double гиперболическийТангенс(double угол) {
        return Math.tanh(угол);
    }

    public static double сложныйПроцент(double основнаяСумма, double ставка, int периоды) {
        return основнаяСумма * Math.pow(1 + ставка, периоды);
    }

    public static double будущаяСтоимость(double текущаяСтоимость, double ставка, int периоды) {
        return текущаяСтоимость * Math.pow(1 + ставка, периоды);
    }

    public static double среднееЗначение(double[] числа) {
        return Arrays.stream(числа).average().orElse(0);
    }

    public static double суммаМассива(double[] числа) {
        return Arrays.stream(числа).sum();
    }

    public static double максимумМассива(double[] числа) {
        return Arrays.stream(числа).max().orElse(0);
    }

    public static double минимумМассива(double[] числа) {
        return Arrays.stream(числа).min().orElse(0);
    }

    public static boolean валидныйEmail(String email) {
        return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    public static boolean валидныйНомерТелефона(String телефон) {
        return телефон.matches("^\\+?[1-9][0-9]{7,14}$");
    }

    public static String base64Кодировать(String строка) {
        return Base64.getEncoder().encodeToString(строка.getBytes());
    }

    public static String base64Декодировать(String строка) {
        return new String(Base64.getDecoder().decode(строка));
    }

    public static String вФорматКлючЗначение(Map<String, Object> карта) {
        return карта.entrySet().stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.joining(", "));
    }

    public static long свободнаяПамять() {
        return Runtime.getRuntime().freeMemory();
    }

    public static long общаяПамять() {
        return Runtime.getRuntime().totalMemory();
    }

    public static long максимальнаяПамять() {
        return Runtime.getRuntime().maxMemory();
    }

    public static void сборкаМусора() {
        System.gc();
    }
}