package com.tencent.mm.protocal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class z
{
  public int ver;
  public String vyO;
  public String vyP;

  z(String paramString1, String paramString2, int paramInt)
  {
    this.vyO = paramString1;
    this.vyP = paramString2;
    this.ver = paramInt;
  }

  public static void O(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(58873);
    ab.d("MicroMsg.RsaInfo", "summercert dkcert saveRsaInfo ver:%d keye:%s keyn:%s  ", new Object[] { Integer.valueOf(paramInt), paramString1, paramString2 });
    SharedPreferences.Editor localEditor = ah.getContext().getSharedPreferences("rsa_public_key_prefs", h.Mu()).edit();
    localEditor.putString("keye", paramString1);
    localEditor.putString("keyn", paramString2);
    localEditor.putInt("version", paramInt);
    localEditor.putInt("client_version", d.vxo);
    localEditor.commit();
    AppMethodBeat.o(58873);
  }

  public static z dmv()
  {
    AppMethodBeat.i(58874);
    SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("rsa_public_key_prefs", h.Mu());
    z localz = new z(localSharedPreferences.getString("keye", ""), localSharedPreferences.getString("keyn", ""), localSharedPreferences.getInt("version", 0));
    int i = localSharedPreferences.getInt("client_version", 0);
    if (!localz.dmy())
      if (i > 637665843)
        AppMethodBeat.o(58874);
    while (true)
    {
      return localz;
      boolean bool = localSharedPreferences.edit().clear().commit();
      e.pXa.a(148L, 38L, 1L, false);
      ab.i("MicroMsg.RsaInfo", "summercert clear old rsa lastClientVer[%d] nowVer[%d], commit[%b]", new Object[] { Integer.valueOf(i), Integer.valueOf(d.vxo), Boolean.valueOf(bool) });
      e.pXa.a(148L, 39L, 1L, false);
      ab.d("MicroMsg.RsaInfo", "summercert default req keye[%s], keyn[%s], ver[%d]", new Object[] { "010001", "BB5FB9017F1CA20257A0384C7C87F568F618FA2697A7C12821FCEC3C97BA2509576944A67D4B4FA5A4B9FB4DB9DDB687FE3354B607E1FD0DE58E39F05B772F5E4976A6E83F6BE1DDD5F0D02A237B6CF5DD957B76EF9BF29B523EFA1041A87D3469590F473C9EC4B448034A3EC0C4B221B960F346FDCDA3BBF3CD984FBBDE97FAFE26FC317E4ACC653688F407E5BE93D41DE8981C113069A21329119F65578E0614957AFE0E0CF52A4A38A85CFD163424945C28CD181A3BEB198DF54303ED070C90419F1C31703C93448F1B381623EE6AED759A21865B5F612EBC9FD367AC4AD781D0E99DD4D7E68664989AF71E9A9342A38277018AA8672A465C8225CACD2CB9".substring(0, 4) + "_" + "BB5FB9017F1CA20257A0384C7C87F568F618FA2697A7C12821FCEC3C97BA2509576944A67D4B4FA5A4B9FB4DB9DDB687FE3354B607E1FD0DE58E39F05B772F5E4976A6E83F6BE1DDD5F0D02A237B6CF5DD957B76EF9BF29B523EFA1041A87D3469590F473C9EC4B448034A3EC0C4B221B960F346FDCDA3BBF3CD984FBBDE97FAFE26FC317E4ACC653688F407E5BE93D41DE8981C113069A21329119F65578E0614957AFE0E0CF52A4A38A85CFD163424945C28CD181A3BEB198DF54303ED070C90419F1C31703C93448F1B381623EE6AED759A21865B5F612EBC9FD367AC4AD781D0E99DD4D7E68664989AF71E9A9342A38277018AA8672A465C8225CACD2CB9".substring(507, 511), Integer.valueOf(184) });
      localz = new z("010001", "BB5FB9017F1CA20257A0384C7C87F568F618FA2697A7C12821FCEC3C97BA2509576944A67D4B4FA5A4B9FB4DB9DDB687FE3354B607E1FD0DE58E39F05B772F5E4976A6E83F6BE1DDD5F0D02A237B6CF5DD957B76EF9BF29B523EFA1041A87D3469590F473C9EC4B448034A3EC0C4B221B960F346FDCDA3BBF3CD984FBBDE97FAFE26FC317E4ACC653688F407E5BE93D41DE8981C113069A21329119F65578E0614957AFE0E0CF52A4A38A85CFD163424945C28CD181A3BEB198DF54303ED070C90419F1C31703C93448F1B381623EE6AED759A21865B5F612EBC9FD367AC4AD781D0E99DD4D7E68664989AF71E9A9342A38277018AA8672A465C8225CACD2CB9", 184);
      AppMethodBeat.o(58874);
    }
  }

  public static z dmw()
  {
    AppMethodBeat.i(58875);
    z localz = new z("010001", "D8D2AE73FF601B93B1471B35870A1B59D7649EEA815CDD8CE5496BBD0C6CFE19C0E082F4E513B615C6030CCFCE3153E25AA00E8156D0311AF72ABBB9BBEC8B1D3751592234B1A621CA774E2EC50047A93FA0BC60DF0C10E8A65C3B29D13167EC217FC6A29034494870705CBF4AC929FBA0E1E656A8F8B50E779AD89BB4EEF6FF", 125);
    AppMethodBeat.o(58875);
    return localz;
  }

  public static z dmx()
  {
    AppMethodBeat.i(58876);
    ab.d("MicroMsg.RsaInfo", "summercert default base keye[%s], keyn[%s], ver[%d]", new Object[] { "010001", "AF64B69AA6F14D838E22F72BBAD6DCDBDC7B2262617C553968EFC0CF2E73FD1714597F9E6BDF1661113B2DC82FDB77286E35822A187380640F5C107DF86CF35FFA3811BDD7012C4C41F5803F644DEE7CF3F037F0BE239A2FBE99F4E002C636759B65BDE41ECF15E594CE28793623FEE039B0E6D3C14131B8AE7BE8C01DF4D03D31C6DCDC228A9A35F74FF4DBB51F8A4E57490965D1074871CE3DB450966A444CF1BE85005D5089752C13D074DAE0172E2BAD3717357A6B49E7A156A6A4EDCFB1BA70C6073431AD0BE0FBBC3C53DCF746663733298385EB5105CA17796A62DAF110380061B1ECF21E686F7467D4327EE6393D2F666C973EA4651AEC32FEC52885".substring(0, 4) + "_" + "AF64B69AA6F14D838E22F72BBAD6DCDBDC7B2262617C553968EFC0CF2E73FD1714597F9E6BDF1661113B2DC82FDB77286E35822A187380640F5C107DF86CF35FFA3811BDD7012C4C41F5803F644DEE7CF3F037F0BE239A2FBE99F4E002C636759B65BDE41ECF15E594CE28793623FEE039B0E6D3C14131B8AE7BE8C01DF4D03D31C6DCDC228A9A35F74FF4DBB51F8A4E57490965D1074871CE3DB450966A444CF1BE85005D5089752C13D074DAE0172E2BAD3717357A6B49E7A156A6A4EDCFB1BA70C6073431AD0BE0FBBC3C53DCF746663733298385EB5105CA17796A62DAF110380061B1ECF21E686F7467D4327EE6393D2F666C973EA4651AEC32FEC52885".substring(507, 511), Integer.valueOf(183) });
    z localz = new z("010001", "AF64B69AA6F14D838E22F72BBAD6DCDBDC7B2262617C553968EFC0CF2E73FD1714597F9E6BDF1661113B2DC82FDB77286E35822A187380640F5C107DF86CF35FFA3811BDD7012C4C41F5803F644DEE7CF3F037F0BE239A2FBE99F4E002C636759B65BDE41ECF15E594CE28793623FEE039B0E6D3C14131B8AE7BE8C01DF4D03D31C6DCDC228A9A35F74FF4DBB51F8A4E57490965D1074871CE3DB450966A444CF1BE85005D5089752C13D074DAE0172E2BAD3717357A6B49E7A156A6A4EDCFB1BA70C6073431AD0BE0FBBC3C53DCF746663733298385EB5105CA17796A62DAF110380061B1ECF21E686F7467D4327EE6393D2F666C973EA4651AEC32FEC52885", 183);
    AppMethodBeat.o(58876);
    return localz;
  }

  // ERROR //
  public static boolean dmz()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_0
    //   2: ldc 187
    //   4: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 189	java/io/FileWriter
    //   10: astore_1
    //   11: new 154	java/lang/StringBuilder
    //   14: astore_2
    //   15: aload_2
    //   16: invokespecial 155	java/lang/StringBuilder:<init>	()V
    //   19: aload_1
    //   20: aload_2
    //   21: getstatic 194	com/tencent/mm/compatible/util/e:eSn	Ljava/lang/String;
    //   24: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: ldc 196
    //   29: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: invokevirtual 173	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   35: invokespecial 199	java/io/FileWriter:<init>	(Ljava/lang/String;)V
    //   38: aload_1
    //   39: astore_2
    //   40: aload_1
    //   41: ldc 201
    //   43: invokevirtual 204	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   46: aload_1
    //   47: astore_2
    //   48: new 154	java/lang/StringBuilder
    //   51: astore_3
    //   52: aload_1
    //   53: astore_2
    //   54: aload_3
    //   55: ldc 206
    //   57: invokespecial 207	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   60: aload_1
    //   61: astore_2
    //   62: aload_1
    //   63: aload_3
    //   64: getstatic 212	com/tencent/mm/sdk/platformtools/f:CLIENT_VERSION	Ljava/lang/String;
    //   67: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: ldc 214
    //   72: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: invokevirtual 173	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   78: invokevirtual 204	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   81: aload_1
    //   82: astore_2
    //   83: new 154	java/lang/StringBuilder
    //   86: astore 4
    //   88: aload_1
    //   89: astore_2
    //   90: aload 4
    //   92: ldc 216
    //   94: invokespecial 207	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   97: aload_1
    //   98: astore_2
    //   99: new 218	java/text/SimpleDateFormat
    //   102: astore 5
    //   104: aload_1
    //   105: astore_2
    //   106: aload 5
    //   108: ldc 220
    //   110: invokespecial 221	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   113: aload_1
    //   114: astore_2
    //   115: new 223	java/util/Date
    //   118: astore_3
    //   119: aload_1
    //   120: astore_2
    //   121: aload_3
    //   122: invokespecial 224	java/util/Date:<init>	()V
    //   125: aload_1
    //   126: astore_2
    //   127: aload_1
    //   128: aload 4
    //   130: aload 5
    //   132: aload_3
    //   133: invokevirtual 228	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   136: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: ldc 230
    //   141: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: invokevirtual 173	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   147: invokevirtual 204	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   150: aload_1
    //   151: astore_2
    //   152: aload_1
    //   153: ldc 232
    //   155: invokevirtual 204	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   158: aload_1
    //   159: astore_2
    //   160: aload_1
    //   161: ldc 234
    //   163: invokevirtual 204	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   166: aload_1
    //   167: astore_2
    //   168: aload_1
    //   169: ldc 236
    //   171: invokevirtual 204	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   174: aload_1
    //   175: astore_2
    //   176: aload_1
    //   177: ldc 238
    //   179: invokevirtual 204	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   182: aload_1
    //   183: astore_2
    //   184: aload_1
    //   185: ldc 240
    //   187: invokevirtual 204	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   190: aload_1
    //   191: astore_2
    //   192: aload_1
    //   193: ldc 242
    //   195: invokevirtual 204	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   198: aload_1
    //   199: astore_2
    //   200: aload_1
    //   201: ldc 244
    //   203: invokevirtual 204	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   206: iconst_1
    //   207: istore 6
    //   209: aload_1
    //   210: invokevirtual 247	java/io/FileWriter:close	()V
    //   213: ldc 187
    //   215: invokestatic 101	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   218: iload 6
    //   220: ireturn
    //   221: astore_3
    //   222: aconst_null
    //   223: astore_1
    //   224: aload_1
    //   225: astore_2
    //   226: ldc 31
    //   228: aload_3
    //   229: ldc 106
    //   231: iconst_0
    //   232: anewarray 4	java/lang/Object
    //   235: invokestatic 251	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   238: iload_0
    //   239: istore 6
    //   241: aload_1
    //   242: ifnull -29 -> 213
    //   245: aload_1
    //   246: invokevirtual 247	java/io/FileWriter:close	()V
    //   249: iload_0
    //   250: istore 6
    //   252: goto -39 -> 213
    //   255: astore_2
    //   256: iload_0
    //   257: istore 6
    //   259: goto -46 -> 213
    //   262: astore_1
    //   263: aconst_null
    //   264: astore_2
    //   265: aload_2
    //   266: ifnull +7 -> 273
    //   269: aload_2
    //   270: invokevirtual 247	java/io/FileWriter:close	()V
    //   273: ldc 187
    //   275: invokestatic 101	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   278: aload_1
    //   279: athrow
    //   280: astore_2
    //   281: goto -68 -> 213
    //   284: astore_2
    //   285: goto -12 -> 273
    //   288: astore_1
    //   289: goto -24 -> 265
    //   292: astore_3
    //   293: goto -69 -> 224
    //
    // Exception table:
    //   from	to	target	type
    //   7	38	221	java/lang/Exception
    //   245	249	255	java/lang/Exception
    //   7	38	262	finally
    //   209	213	280	java/lang/Exception
    //   269	273	284	java/lang/Exception
    //   40	46	288	finally
    //   48	52	288	finally
    //   54	60	288	finally
    //   62	81	288	finally
    //   83	88	288	finally
    //   90	97	288	finally
    //   99	104	288	finally
    //   106	113	288	finally
    //   115	119	288	finally
    //   121	125	288	finally
    //   127	150	288	finally
    //   152	158	288	finally
    //   160	166	288	finally
    //   168	174	288	finally
    //   176	182	288	finally
    //   184	190	288	finally
    //   192	198	288	finally
    //   200	206	288	finally
    //   226	238	288	finally
    //   40	46	292	java/lang/Exception
    //   48	52	292	java/lang/Exception
    //   54	60	292	java/lang/Exception
    //   62	81	292	java/lang/Exception
    //   83	88	292	java/lang/Exception
    //   90	97	292	java/lang/Exception
    //   99	104	292	java/lang/Exception
    //   106	113	292	java/lang/Exception
    //   115	119	292	java/lang/Exception
    //   121	125	292	java/lang/Exception
    //   127	150	292	java/lang/Exception
    //   152	158	292	java/lang/Exception
    //   160	166	292	java/lang/Exception
    //   168	174	292	java/lang/Exception
    //   176	182	292	java/lang/Exception
    //   184	190	292	java/lang/Exception
    //   192	198	292	java/lang/Exception
    //   200	206	292	java/lang/Exception
  }

  public final boolean dmy()
  {
    AppMethodBeat.i(58877);
    boolean bool;
    if ((this.ver == 0) || (bo.isNullOrNil(this.vyO)) || (bo.isNullOrNil(this.vyP)))
    {
      bool = true;
      AppMethodBeat.o(58877);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(58877);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.z
 * JD-Core Version:    0.6.2
 */