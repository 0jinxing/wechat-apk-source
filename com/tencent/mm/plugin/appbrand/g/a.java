package com.tencent.mm.plugin.appbrand.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

final class a
{
  static final String[] huC;

  static
  {
    AppMethodBeat.i(65351);
    LinkedList localLinkedList = new LinkedList();
    Field[] arrayOfField = android.support.d.a.class.getDeclaredFields();
    int i = arrayOfField.length;
    int j = 0;
    while (true)
    {
      Field localField;
      if (j < i)
        localField = arrayOfField[j];
      try
      {
        if ((Modifier.isFinal(localField.getModifiers())) && (Modifier.isStatic(localField.getModifiers())) && (localField.getName().startsWith("TAG_")))
          localLinkedList.add((String)localField.get(null));
        label85: j++;
        continue;
        huC = (String[])localLinkedList.toArray(new String[localLinkedList.size()]);
        AppMethodBeat.o(65351);
        return;
      }
      catch (Exception localException)
      {
        break label85;
      }
    }
  }

  static void a(android.support.d.a parama1, android.support.d.a parama2)
  {
    AppMethodBeat.i(65350);
    for (String str1 : huC)
    {
      String str2 = parama1.getAttribute(str1);
      if (str2 != null)
        parama2.setAttribute(str1, str2);
    }
    parama2.saveAttributes();
    AppMethodBeat.o(65350);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.g.a
 * JD-Core Version:    0.6.2
 */