package com.tencent.mm.af;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.t;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Map;
import junit.framework.Assert;

public final class j extends t
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(77792);
    c.a locala = new c.a();
    locala.xDb = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "msgId";
    locala.xDd.put("msgId", "LONG default '0'  PRIMARY KEY ");
    localStringBuilder.append(" msgId LONG default '0'  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "msgId";
    locala.columns[1] = "xml";
    locala.xDd.put("xml", "TEXT");
    localStringBuilder.append(" xml TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "appId";
    locala.xDd.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "title";
    locala.xDd.put("title", "TEXT");
    localStringBuilder.append(" title TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "description";
    locala.xDd.put("description", "TEXT");
    localStringBuilder.append(" description TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "source";
    locala.xDd.put("source", "TEXT");
    localStringBuilder.append(" source TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "type";
    locala.xDd.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    locala.columns[7] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    if (b.dnO())
      Assert.assertTrue(XA());
    AppMethodBeat.o(77792);
  }

  private static final boolean XA()
  {
    boolean bool = false;
    AppMethodBeat.i(77791);
    Field[] arrayOfField = j.b.class.getDeclaredFields();
    int i = 0;
    int k;
    for (int j = 0; i < arrayOfField.length; j = k)
    {
      k = j;
      if (!Modifier.isStatic(arrayOfField[i].getModifiers()))
        k = j + 1;
      i++;
    }
    if (j > 196)
    {
      ab.e("MicroMsg.AppMessage", "AppMessage.Content should not add new field!!! (%d) is over the limit(%d)!!!", new Object[] { Integer.valueOf(j), Integer.valueOf(196) });
      AppMethodBeat.o(77791);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.AppMessage", "AppMessage.Content nonStaticFieldCount: %d", new Object[] { Integer.valueOf(j) });
      AppMethodBeat.o(77791);
      bool = true;
    }
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.af.j
 * JD-Core Version:    0.6.2
 */