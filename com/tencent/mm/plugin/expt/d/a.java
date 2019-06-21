package com.tencent.mm.plugin.expt.d;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.bh;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a extends bh
{
  public static c.a ccO;
  private HashMap<String, String> ckP = null;

  static
  {
    AppMethodBeat.i(93273);
    c.a locala = new c.a();
    locala.xDb = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "exptId";
    locala.xDd.put("exptId", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" exptId INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "exptId";
    locala.columns[1] = "groupId";
    locala.xDd.put("groupId", "INTEGER");
    localStringBuilder.append(" groupId INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "exptSeq";
    locala.xDd.put("exptSeq", "INTEGER");
    localStringBuilder.append(" exptSeq INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "exptContent";
    locala.xDd.put("exptContent", "TEXT");
    localStringBuilder.append(" exptContent TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "startTime";
    locala.xDd.put("startTime", "LONG");
    localStringBuilder.append(" startTime LONG");
    localStringBuilder.append(", ");
    locala.columns[5] = "endTime";
    locala.xDd.put("endTime", "LONG");
    localStringBuilder.append(" endTime LONG");
    localStringBuilder.append(", ");
    locala.columns[6] = "exptType";
    locala.xDd.put("exptType", "INTEGER");
    localStringBuilder.append(" exptType INTEGER");
    locala.columns[7] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(93273);
  }

  private static void a(HashMap<String, String> paramHashMap, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(93272);
    if (paramJSONObject == null)
      AppMethodBeat.o(93272);
    while (true)
    {
      return;
      String str = paramJSONObject.optString("Key");
      paramJSONObject = paramJSONObject.optString("Val");
      if ((!bo.isNullOrNil(str)) && (!bo.isNullOrNil(paramJSONObject)))
        paramHashMap.put(str, new String(Base64.decode(paramJSONObject, 0)));
      AppMethodBeat.o(93272);
    }
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final boolean La(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(93268);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(93268);
    while (true)
    {
      return bool;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        String str = toString();
        this.field_exptContent = paramString;
        this.field_exptId = localJSONObject.optInt("ExptId");
        this.field_groupId = localJSONObject.optInt("GroupId");
        this.field_exptSeq = localJSONObject.optInt("ExptSequence");
        this.field_startTime = localJSONObject.optLong("StartTime");
        this.field_endTime = localJSONObject.optLong("EndTime");
        this.field_exptType = localJSONObject.optInt("ExptType");
        ab.v("MicroMsg.ExptItem", "convertFrom new [%s] old[%s] args[%s]", new Object[] { toString(), str, paramString });
        AppMethodBeat.o(93268);
        bool = true;
      }
      catch (Exception localException)
      {
        e.pXa.a(863L, 5L, 1L, false);
        ab.e("MicroMsg.ExptItem", "%d convertFrom [%s] error [%s]", new Object[] { Integer.valueOf(hashCode()), paramString, localException.toString() });
        AppMethodBeat.o(93268);
      }
    }
  }

  public final boolean bro()
  {
    if (this.field_exptType == 10);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean brp()
  {
    if (this.field_exptType == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  // ERROR //
  public final HashMap<String, String> brq()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 245
    //   4: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: getfield 112	com/tencent/mm/plugin/expt/d/a:ckP	Ljava/util/HashMap;
    //   11: ifnull +15 -> 26
    //   14: aload_0
    //   15: getfield 112	com/tencent/mm/plugin/expt/d/a:ckP	Ljava/util/HashMap;
    //   18: astore_1
    //   19: ldc 245
    //   21: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   24: aload_1
    //   25: areturn
    //   26: aload_0
    //   27: getfield 158	com/tencent/mm/plugin/expt/d/a:field_exptContent	Ljava/lang/String;
    //   30: invokestatic 131	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   33: ifne +163 -> 196
    //   36: aload_0
    //   37: getfield 158	com/tencent/mm/plugin/expt/d/a:field_exptContent	Ljava/lang/String;
    //   40: astore_2
    //   41: new 119	org/json/JSONObject
    //   44: astore_3
    //   45: aload_3
    //   46: aload_2
    //   47: invokespecial 154	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   50: aload_3
    //   51: ldc 247
    //   53: invokevirtual 251	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   56: astore_3
    //   57: aload_3
    //   58: ifnonnull +11 -> 69
    //   61: ldc 245
    //   63: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   66: goto -42 -> 24
    //   69: new 142	java/util/HashMap
    //   72: astore_1
    //   73: aload_1
    //   74: invokespecial 252	java/util/HashMap:<init>	()V
    //   77: aload_3
    //   78: instanceof 254
    //   81: ifeq +58 -> 139
    //   84: aload_3
    //   85: checkcast 254	org/json/JSONArray
    //   88: astore_3
    //   89: aload_3
    //   90: ifnull +31 -> 121
    //   93: iconst_0
    //   94: istore 4
    //   96: iload 4
    //   98: aload_3
    //   99: invokevirtual 257	org/json/JSONArray:length	()I
    //   102: if_icmpge +19 -> 121
    //   105: aload_1
    //   106: aload_3
    //   107: iload 4
    //   109: invokevirtual 261	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   112: invokestatic 263	com/tencent/mm/plugin/expt/d/a:a	(Ljava/util/HashMap;Lorg/json/JSONObject;)V
    //   115: iinc 4 1
    //   118: goto -22 -> 96
    //   121: aload_0
    //   122: aload_1
    //   123: putfield 112	com/tencent/mm/plugin/expt/d/a:ckP	Ljava/util/HashMap;
    //   126: aload_0
    //   127: getfield 112	com/tencent/mm/plugin/expt/d/a:ckP	Ljava/util/HashMap;
    //   130: astore_1
    //   131: ldc 245
    //   133: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: goto -112 -> 24
    //   139: aload_3
    //   140: instanceof 119
    //   143: ifeq +11 -> 154
    //   146: aload_1
    //   147: aload_3
    //   148: checkcast 119	org/json/JSONObject
    //   151: invokestatic 263	com/tencent/mm/plugin/expt/d/a:a	(Ljava/util/HashMap;Lorg/json/JSONObject;)V
    //   154: goto -33 -> 121
    //   157: astore_3
    //   158: aconst_null
    //   159: astore_1
    //   160: ldc 200
    //   162: ldc_w 265
    //   165: iconst_2
    //   166: anewarray 204	java/lang/Object
    //   169: dup
    //   170: iconst_0
    //   171: aload_3
    //   172: invokevirtual 236	java/lang/Exception:toString	()Ljava/lang/String;
    //   175: aastore
    //   176: dup
    //   177: iconst_1
    //   178: aload_0
    //   179: getfield 168	com/tencent/mm/plugin/expt/d/a:field_exptId	I
    //   182: invokestatic 235	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   185: aastore
    //   186: invokestatic 239	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   189: goto -68 -> 121
    //   192: astore_3
    //   193: goto -33 -> 160
    //   196: aconst_null
    //   197: astore_1
    //   198: goto -77 -> 121
    //
    // Exception table:
    //   from	to	target	type
    //   41	57	157	java/lang/Exception
    //   69	77	157	java/lang/Exception
    //   77	89	192	java/lang/Exception
    //   96	115	192	java/lang/Exception
    //   139	154	192	java/lang/Exception
  }

  public final boolean isReady()
  {
    boolean bool1 = false;
    AppMethodBeat.i(93270);
    boolean bool2;
    if (this.field_exptSeq < 0)
      bool2 = bool1;
    while (true)
    {
      AppMethodBeat.o(93270);
      return bool2;
      long l = bo.anT();
      bool2 = bool1;
      if (l >= this.field_startTime)
        if (this.field_endTime > 0L)
        {
          bool2 = bool1;
          if (l > this.field_endTime);
        }
        else
        {
          bool2 = true;
        }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(93269);
    String str = "{ Id: " + this.field_exptId + " group: " + this.field_groupId + " seq: " + this.field_exptSeq + " startTime: " + this.field_startTime + " endTime: " + this.field_endTime + " content: " + this.field_exptContent + " type: " + this.field_exptType + " }";
    AppMethodBeat.o(93269);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.d.a
 * JD-Core Version:    0.6.2
 */