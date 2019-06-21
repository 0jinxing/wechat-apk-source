package android.support.multidex;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

final class a$a
{
  static void a(ClassLoader paramClassLoader, List<File> paramList, File paramFile)
  {
    paramClassLoader = a.c(paramClassLoader, "pathList").get(paramClassLoader);
    paramList = new ArrayList(paramList);
    a.a(paramClassLoader, "dexElements", (Object[])a.c(paramClassLoader, "makeDexElements", new Class[] { ArrayList.class, File.class }).invoke(paramClassLoader, new Object[] { paramList, paramFile }));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.multidex.a.a
 * JD-Core Version:    0.6.2
 */