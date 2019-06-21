package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.modelsimple.j;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.RegionCodeDecoder.Region;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.List;

public class MultiStageCitySelectUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private static List<RegionCodeDecoder.Region> zGy;
  private int cGC;
  private String countryCode;
  private String eUt;
  private b.a ecy;
  private com.tencent.mm.ui.base.preference.f ehK;
  private o elS;
  private String fHE;
  private String fno;
  private String fnp;
  private d fwu;
  private boolean gwZ;
  private ak handler;
  private boolean nPX;
  private Runnable zGA;
  private String zGo;
  private boolean zGp;
  private int zGq;
  private RegionCodeDecoder.Region[] zGr;
  private boolean zGs;
  private boolean zGt;
  private boolean zGu;
  private boolean zGv;
  private boolean zGw;
  private ZoneRecommandPreference zGx;
  private String zGz;

  public MultiStageCitySelectUI()
  {
    AppMethodBeat.i(34899);
    this.countryCode = null;
    this.fnp = null;
    this.fno = null;
    this.fHE = null;
    this.zGo = null;
    this.eUt = null;
    this.zGp = false;
    this.cGC = 0;
    this.zGq = -1;
    this.zGs = false;
    this.zGt = true;
    this.zGu = true;
    this.zGv = false;
    this.zGw = false;
    this.gwZ = true;
    this.elS = new o((byte)0);
    this.handler = new ak(Looper.getMainLooper());
    this.ecy = new MultiStageCitySelectUI.1(this);
    this.zGA = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(34897);
        MultiStageCitySelectUI.m(MultiStageCitySelectUI.this);
        AppMethodBeat.o(34897);
      }
    };
    AppMethodBeat.o(34899);
  }

  private void dJO()
  {
    switch (this.cGC)
    {
    default:
    case 2:
    case 1:
    case 0:
    }
    while (true)
    {
      return;
      this.fno = null;
      continue;
      this.fnp = null;
      continue;
      this.countryCode = null;
    }
  }

  // ERROR //
  private static List<RegionCodeDecoder.Region> dJP()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: ldc 153
    //   4: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: invokestatic 159	com/tencent/mm/storage/RegionCodeDecoder:duj	()Lcom/tencent/mm/storage/RegionCodeDecoder;
    //   10: astore_1
    //   11: aload_1
    //   12: invokestatic 165	com/tencent/mm/sdk/platformtools/aa:dor	()Ljava/lang/String;
    //   15: putfield 168	com/tencent/mm/storage/RegionCodeDecoder:xZT	Ljava/lang/String;
    //   18: aload_1
    //   19: invokevirtual 171	com/tencent/mm/storage/RegionCodeDecoder:duk	()Ljava/lang/String;
    //   22: astore_2
    //   23: aload_2
    //   24: invokestatic 177	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   27: ifeq +45 -> 72
    //   30: ldc 179
    //   32: new 181	java/lang/StringBuilder
    //   35: dup
    //   36: ldc 183
    //   38: invokespecial 186	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   41: aload_1
    //   42: getfield 168	com/tencent/mm/storage/RegionCodeDecoder:xZT	Ljava/lang/String;
    //   45: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: invokevirtual 193	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: invokestatic 199	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   54: aconst_null
    //   55: astore_1
    //   56: aload_1
    //   57: invokestatic 177	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   60: ifeq +36 -> 96
    //   63: ldc 153
    //   65: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   68: aload_0
    //   69: astore_1
    //   70: aload_1
    //   71: areturn
    //   72: new 181	java/lang/StringBuilder
    //   75: dup
    //   76: invokespecial 200	java/lang/StringBuilder:<init>	()V
    //   79: getstatic 203	com/tencent/mm/storage/RegionCodeDecoder:xZS	Ljava/lang/String;
    //   82: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: aload_2
    //   86: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: invokevirtual 193	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: astore_1
    //   93: goto -37 -> 56
    //   96: new 205	java/util/ArrayList
    //   99: dup
    //   100: invokespecial 206	java/util/ArrayList:<init>	()V
    //   103: astore_3
    //   104: aload_1
    //   105: invokestatic 212	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   108: astore 4
    //   110: new 214	java/io/InputStreamReader
    //   113: astore_2
    //   114: aload_2
    //   115: aload 4
    //   117: invokespecial 217	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   120: new 219	java/io/BufferedReader
    //   123: astore 5
    //   125: aload 5
    //   127: aload_2
    //   128: invokespecial 222	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   131: aconst_null
    //   132: astore_0
    //   133: aconst_null
    //   134: astore_1
    //   135: aload 5
    //   137: invokevirtual 225	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   140: astore 6
    //   142: aload 6
    //   144: ifnull +259 -> 403
    //   147: aload 6
    //   149: ldc 227
    //   151: invokevirtual 233	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   154: astore 7
    //   156: new 235	com/tencent/mm/storage/RegionCodeDecoder$Region
    //   159: astore 6
    //   161: aload 6
    //   163: invokespecial 236	com/tencent/mm/storage/RegionCodeDecoder$Region:<init>	()V
    //   166: aload 7
    //   168: arraylength
    //   169: iconst_2
    //   170: if_icmpne +452 -> 622
    //   173: aload 6
    //   175: aload 7
    //   177: iconst_1
    //   178: aaload
    //   179: invokevirtual 239	com/tencent/mm/storage/RegionCodeDecoder$Region:setName	(Ljava/lang/String;)V
    //   182: aload 7
    //   184: iconst_0
    //   185: aaload
    //   186: ldc 241
    //   188: invokevirtual 233	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   191: astore 8
    //   193: aload 8
    //   195: iconst_0
    //   196: aaload
    //   197: astore 7
    //   199: aload 6
    //   201: aload 7
    //   203: invokevirtual 244	com/tencent/mm/storage/RegionCodeDecoder$Region:setCountryCode	(Ljava/lang/String;)V
    //   206: aload 7
    //   208: invokestatic 177	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   211: ifne -76 -> 135
    //   214: aload 8
    //   216: arraylength
    //   217: iconst_1
    //   218: if_icmpne +43 -> 261
    //   221: aload 6
    //   223: aload 7
    //   225: invokevirtual 247	com/tencent/mm/storage/RegionCodeDecoder$Region:setCode	(Ljava/lang/String;)V
    //   228: aload 6
    //   230: iconst_0
    //   231: invokevirtual 251	com/tencent/mm/storage/RegionCodeDecoder$Region:setProvince	(Z)V
    //   234: aload 6
    //   236: iconst_0
    //   237: invokevirtual 254	com/tencent/mm/storage/RegionCodeDecoder$Region:setCity	(Z)V
    //   240: aload 6
    //   242: iconst_1
    //   243: invokevirtual 257	com/tencent/mm/storage/RegionCodeDecoder$Region:setCountry	(Z)V
    //   246: aload 6
    //   248: astore_0
    //   249: aload_3
    //   250: aload 6
    //   252: invokeinterface 263 2 0
    //   257: pop
    //   258: goto -123 -> 135
    //   261: aload 8
    //   263: arraylength
    //   264: iconst_2
    //   265: if_icmpne +66 -> 331
    //   268: aload 6
    //   270: aload 8
    //   272: iconst_1
    //   273: aaload
    //   274: invokevirtual 247	com/tencent/mm/storage/RegionCodeDecoder$Region:setCode	(Ljava/lang/String;)V
    //   277: aload 6
    //   279: iconst_1
    //   280: invokevirtual 251	com/tencent/mm/storage/RegionCodeDecoder$Region:setProvince	(Z)V
    //   283: aload 6
    //   285: iconst_0
    //   286: invokevirtual 257	com/tencent/mm/storage/RegionCodeDecoder$Region:setCountry	(Z)V
    //   289: aload 6
    //   291: iconst_0
    //   292: invokevirtual 254	com/tencent/mm/storage/RegionCodeDecoder$Region:setCity	(Z)V
    //   295: aload_0
    //   296: ifnull +29 -> 325
    //   299: aload_0
    //   300: invokevirtual 266	com/tencent/mm/storage/RegionCodeDecoder$Region:getCountryCode	()Ljava/lang/String;
    //   303: aload 6
    //   305: invokevirtual 266	com/tencent/mm/storage/RegionCodeDecoder$Region:getCountryCode	()Ljava/lang/String;
    //   308: invokevirtual 269	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   311: ifeq +14 -> 325
    //   314: aload_0
    //   315: iconst_1
    //   316: invokevirtual 272	com/tencent/mm/storage/RegionCodeDecoder$Region:setHasChildren	(Z)V
    //   319: aload 6
    //   321: aload_0
    //   322: invokevirtual 276	com/tencent/mm/storage/RegionCodeDecoder$Region:setParent	(Lcom/tencent/mm/storage/RegionCodeDecoder$Region;)V
    //   325: aload 6
    //   327: astore_1
    //   328: goto -79 -> 249
    //   331: aload 8
    //   333: arraylength
    //   334: iconst_3
    //   335: if_icmpne +65 -> 400
    //   338: aload 6
    //   340: aload 8
    //   342: iconst_2
    //   343: aaload
    //   344: invokevirtual 247	com/tencent/mm/storage/RegionCodeDecoder$Region:setCode	(Ljava/lang/String;)V
    //   347: aload 6
    //   349: iconst_1
    //   350: invokevirtual 254	com/tencent/mm/storage/RegionCodeDecoder$Region:setCity	(Z)V
    //   353: aload 6
    //   355: iconst_0
    //   356: invokevirtual 257	com/tencent/mm/storage/RegionCodeDecoder$Region:setCountry	(Z)V
    //   359: aload 6
    //   361: iconst_0
    //   362: invokevirtual 251	com/tencent/mm/storage/RegionCodeDecoder$Region:setProvince	(Z)V
    //   365: aload 6
    //   367: iconst_0
    //   368: invokevirtual 272	com/tencent/mm/storage/RegionCodeDecoder$Region:setHasChildren	(Z)V
    //   371: aload_1
    //   372: ifnull +28 -> 400
    //   375: aload_1
    //   376: invokevirtual 279	com/tencent/mm/storage/RegionCodeDecoder$Region:getCode	()Ljava/lang/String;
    //   379: aload 8
    //   381: iconst_1
    //   382: aaload
    //   383: invokevirtual 269	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   386: ifeq +14 -> 400
    //   389: aload 6
    //   391: aload_1
    //   392: invokevirtual 276	com/tencent/mm/storage/RegionCodeDecoder$Region:setParent	(Lcom/tencent/mm/storage/RegionCodeDecoder$Region;)V
    //   395: aload_1
    //   396: iconst_1
    //   397: invokevirtual 272	com/tencent/mm/storage/RegionCodeDecoder$Region:setHasChildren	(Z)V
    //   400: goto -151 -> 249
    //   403: aload 4
    //   405: ifnull +8 -> 413
    //   408: aload 4
    //   410: invokevirtual 284	java/io/InputStream:close	()V
    //   413: aload_2
    //   414: invokevirtual 285	java/io/InputStreamReader:close	()V
    //   417: aload 5
    //   419: invokevirtual 286	java/io/BufferedReader:close	()V
    //   422: ldc 153
    //   424: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   427: aload_3
    //   428: astore_1
    //   429: goto -359 -> 70
    //   432: astore_0
    //   433: aconst_null
    //   434: astore_1
    //   435: aconst_null
    //   436: astore_2
    //   437: aconst_null
    //   438: astore 4
    //   440: ldc_w 288
    //   443: aload_0
    //   444: ldc_w 290
    //   447: iconst_1
    //   448: anewarray 292	java/lang/Object
    //   451: dup
    //   452: iconst_0
    //   453: aload_0
    //   454: invokevirtual 295	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   457: aastore
    //   458: invokestatic 299	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   461: aload 4
    //   463: ifnull +8 -> 471
    //   466: aload 4
    //   468: invokevirtual 284	java/io/InputStream:close	()V
    //   471: aload_2
    //   472: ifnull +7 -> 479
    //   475: aload_2
    //   476: invokevirtual 285	java/io/InputStreamReader:close	()V
    //   479: aload_1
    //   480: ifnull -58 -> 422
    //   483: aload_1
    //   484: invokevirtual 286	java/io/BufferedReader:close	()V
    //   487: goto -65 -> 422
    //   490: astore_1
    //   491: goto -69 -> 422
    //   494: astore_1
    //   495: aconst_null
    //   496: astore_0
    //   497: aconst_null
    //   498: astore_2
    //   499: aconst_null
    //   500: astore 4
    //   502: aload 4
    //   504: ifnull +8 -> 512
    //   507: aload 4
    //   509: invokevirtual 284	java/io/InputStream:close	()V
    //   512: aload_2
    //   513: ifnull +7 -> 520
    //   516: aload_2
    //   517: invokevirtual 285	java/io/InputStreamReader:close	()V
    //   520: aload_0
    //   521: ifnull +7 -> 528
    //   524: aload_0
    //   525: invokevirtual 286	java/io/BufferedReader:close	()V
    //   528: ldc 153
    //   530: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   533: aload_1
    //   534: athrow
    //   535: astore_1
    //   536: goto -123 -> 413
    //   539: astore_1
    //   540: goto -123 -> 417
    //   543: astore_1
    //   544: goto -122 -> 422
    //   547: astore_0
    //   548: goto -77 -> 471
    //   551: astore_0
    //   552: goto -73 -> 479
    //   555: astore 4
    //   557: goto -45 -> 512
    //   560: astore_2
    //   561: goto -41 -> 520
    //   564: astore_0
    //   565: goto -37 -> 528
    //   568: astore_1
    //   569: aconst_null
    //   570: astore_0
    //   571: aconst_null
    //   572: astore_2
    //   573: goto -71 -> 502
    //   576: astore_1
    //   577: aconst_null
    //   578: astore_0
    //   579: goto -77 -> 502
    //   582: astore_1
    //   583: aload 5
    //   585: astore_0
    //   586: goto -84 -> 502
    //   589: astore_0
    //   590: aload_1
    //   591: astore 5
    //   593: aload_0
    //   594: astore_1
    //   595: aload 5
    //   597: astore_0
    //   598: goto -96 -> 502
    //   601: astore_0
    //   602: aconst_null
    //   603: astore_1
    //   604: aconst_null
    //   605: astore_2
    //   606: goto -166 -> 440
    //   609: astore_0
    //   610: aconst_null
    //   611: astore_1
    //   612: goto -172 -> 440
    //   615: astore_0
    //   616: aload 5
    //   618: astore_1
    //   619: goto -179 -> 440
    //   622: goto -364 -> 258
    //
    // Exception table:
    //   from	to	target	type
    //   104	110	432	java/lang/Exception
    //   483	487	490	java/io/IOException
    //   104	110	494	finally
    //   408	413	535	java/io/IOException
    //   413	417	539	java/io/IOException
    //   417	422	543	java/io/IOException
    //   466	471	547	java/io/IOException
    //   475	479	551	java/io/IOException
    //   507	512	555	java/io/IOException
    //   516	520	560	java/io/IOException
    //   524	528	564	java/io/IOException
    //   110	120	568	finally
    //   120	131	576	finally
    //   135	142	582	finally
    //   147	193	582	finally
    //   199	246	582	finally
    //   249	258	582	finally
    //   261	295	582	finally
    //   299	325	582	finally
    //   331	371	582	finally
    //   375	400	582	finally
    //   440	461	589	finally
    //   110	120	601	java/lang/Exception
    //   120	131	609	java/lang/Exception
    //   135	142	615	java/lang/Exception
    //   147	193	615	java/lang/Exception
    //   199	246	615	java/lang/Exception
    //   249	258	615	java/lang/Exception
    //   261	295	615	java/lang/Exception
    //   299	325	615	java/lang/Exception
    //   331	371	615	java/lang/Exception
    //   375	400	615	java/lang/Exception
  }

  private void dJQ()
  {
    AppMethodBeat.i(34910);
    if (this.zGx != null)
      this.zGx.dKc();
    AppMethodBeat.o(34910);
  }

  public final int JC()
  {
    return 2130971253;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    Object localObject1 = null;
    AppMethodBeat.i(34906);
    Object localObject2;
    boolean bool;
    label115: label628: Object localObject3;
    if ((paramPreference instanceof ZonePreference))
    {
      paramPreference = ((ZonePreference)paramPreference).zIi;
      if ((paramPreference == null) || (bo.isNullOrNil(paramPreference.getCode())))
      {
        localObject2 = new StringBuilder("onPreferenceTreeClick error item, code:");
        if (paramPreference == null)
        {
          paramf = Integer.valueOf(-1);
          localObject2 = ((StringBuilder)localObject2).append(paramf).append(" ,name:");
          if (paramPreference != null)
            break label115;
        }
        for (paramf = "null"; ; paramf = paramPreference.getName())
        {
          ab.e("MicroMsg.MultiStageCitySelectUI", paramf);
          AppMethodBeat.o(34906);
          bool = false;
          return bool;
          paramf = paramPreference.getCode();
          break;
        }
      }
      if (this.cGC == 3)
      {
        this.countryCode = "CN";
        this.fnp = paramPreference.getCode();
        this.zGo = paramPreference.getName();
      }
      if (this.cGC == 0)
      {
        this.countryCode = paramPreference.getCode();
        this.fHE = paramPreference.getName();
        label177: if (paramPreference.hasChildren())
          break label628;
        if (!this.zGs)
        {
          aw.ZK();
          c.Ry().set(12324, this.countryCode);
          aw.ZK();
          c.Ry().set(12325, this.fnp);
          aw.ZK();
          c.Ry().set(12326, this.fno);
        }
        paramf = new Intent();
        paramf.putExtra("CountryName", this.fHE);
        paramf.putExtra("ProviceName", this.zGo);
        paramf.putExtra("CityName", this.eUt);
        paramf.putExtra("Country", this.countryCode);
        paramf.putExtra("Contact_Province", this.fnp);
        paramf.putExtra("Contact_City", this.fno);
        aqX();
        setResult(-1, paramf);
        finish();
      }
      while (true)
      {
        AppMethodBeat.o(34906);
        bool = true;
        break;
        if (this.cGC == 1)
        {
          this.fnp = paramPreference.getCode();
          this.zGo = paramPreference.getName();
          break label177;
        }
        if (this.cGC == 2)
        {
          this.fno = paramPreference.getCode();
          this.eUt = paramPreference.getName();
          if (("CN".equalsIgnoreCase(this.countryCode)) || ("HK".equalsIgnoreCase(this.countryCode)) || ("MO".equalsIgnoreCase(this.countryCode)) || ("TW".equalsIgnoreCase(this.countryCode)))
          {
            this.fHE = null;
            break label177;
          }
          this.zGo = null;
          break label177;
        }
        if (this.cGC != 4)
          break label177;
        if ((paramPreference.getParent() != null) && (!paramPreference.hasChildren()))
        {
          this.fno = paramPreference.getCode();
          this.eUt = paramPreference.getName();
          this.fnp = paramPreference.getParent().getCode();
          this.zGo = paramPreference.getParent().getName();
          this.countryCode = paramPreference.getCountryCode();
          this.fHE = null;
          break label177;
        }
        if ((paramPreference.hasChildren()) && (paramPreference.getParent() != null))
        {
          this.fnp = paramPreference.getCode();
          this.zGo = paramPreference.getName();
          this.countryCode = paramPreference.getCountryCode();
          this.fHE = null;
          break label177;
        }
        this.countryCode = paramPreference.getCode();
        this.fHE = paramPreference.getName();
        this.fnp = null;
        this.zGo = null;
        this.fno = null;
        this.eUt = null;
        break label177;
        localObject3 = new Intent(this, MultiStageCitySelectUI.class);
        localObject2 = new Bundle();
        ((Bundle)localObject2).putString("Country", this.countryCode);
        ((Bundle)localObject2).putString("Provice", this.fnp);
        ((Bundle)localObject2).putString("CountryName", this.fHE);
        ((Bundle)localObject2).putString("ProviceName", this.zGo);
        ((Bundle)localObject2).putBoolean("GetAddress", this.zGs);
        ((Bundle)localObject2).putBoolean("ShowSelectedLocation", this.zGu);
        if (this.zGp)
        {
          paramPreference = paramPreference.getCountryCode();
          paramf = paramPreference;
          if (bo.isNullOrNil(paramPreference))
            paramf = this.countryCode;
          if (("CN".equalsIgnoreCase(paramf)) || ("HK".equalsIgnoreCase(paramf)) || ("MO".equalsIgnoreCase(paramf)) || ("TW".equalsIgnoreCase(paramf)))
            ((Bundle)localObject2).putBoolean("IsNeedShowSearchBar", true);
        }
        ((Intent)localObject3).putExtras((Bundle)localObject2);
        aqX();
        startActivityForResult((Intent)localObject3, 1);
      }
    }
    int i;
    label845: RegionCodeDecoder.Region[] arrayOfRegion;
    label902: label927: label952: label970: label979: label989: label998: Intent localIntent;
    if (paramPreference.mKey.equals("current_location"))
    {
      if (this.zGx.status != 1)
        break label1160;
      i = 1;
      if (i != 0)
      {
        paramf = this.zGx;
        arrayOfRegion = new RegionCodeDecoder.Region[3];
        arrayOfRegion[0] = paramf.zIl;
        arrayOfRegion[1] = paramf.zIm;
        arrayOfRegion[2] = paramf.zIn;
        aw.ZK();
        paramPreference = c.Ry();
        if (arrayOfRegion[0] != null)
          break label1166;
        paramf = null;
        paramPreference.set(12324, paramf);
        aw.ZK();
        paramPreference = c.Ry();
        if (arrayOfRegion[1] != null)
          break label1177;
        paramf = null;
        paramPreference.set(12325, paramf);
        aw.ZK();
        paramPreference = c.Ry();
        if (arrayOfRegion[2] != null)
          break label1188;
        paramf = null;
        paramPreference.set(12326, paramf);
        if (arrayOfRegion[0] != null)
          break label1199;
        localObject2 = null;
        if (arrayOfRegion[0] != null)
          break label1211;
        paramf = null;
        if (arrayOfRegion[1] != null)
          break label1222;
        localObject3 = null;
        if (arrayOfRegion[1] != null)
          break label1234;
        paramPreference = null;
        if ((!"CN".equalsIgnoreCase((String)localObject2)) && (!"HK".equalsIgnoreCase((String)localObject2)) && (!"MO".equalsIgnoreCase((String)localObject2)) && (!"TW".equalsIgnoreCase((String)localObject2)))
          break label1245;
        paramf = null;
        label1044: localIntent = new Intent();
        localIntent.putExtra("CountryName", paramf);
        localIntent.putExtra("ProviceName", paramPreference);
        if (arrayOfRegion[2] != null)
          break label1250;
        paramf = null;
        label1082: localIntent.putExtra("CityName", paramf);
        localIntent.putExtra("Country", (String)localObject2);
        localIntent.putExtra("Contact_Province", (String)localObject3);
        if (arrayOfRegion[2] != null)
          break label1261;
      }
    }
    label1160: label1166: label1177: label1188: label1199: label1211: label1222: label1234: label1245: label1250: label1261: for (paramf = localObject1; ; paramf = arrayOfRegion[2].getCode())
    {
      localIntent.putExtra("Contact_City", paramf);
      aqX();
      setResult(-1, localIntent);
      finish();
      AppMethodBeat.o(34906);
      bool = false;
      break;
      i = 0;
      break label845;
      paramf = arrayOfRegion[0].getCode();
      break label902;
      paramf = arrayOfRegion[1].getCode();
      break label927;
      paramf = arrayOfRegion[2].getCode();
      break label952;
      localObject2 = arrayOfRegion[0].getCode();
      break label970;
      paramf = arrayOfRegion[0].getName();
      break label979;
      localObject3 = arrayOfRegion[1].getCode();
      break label989;
      paramPreference = arrayOfRegion[1].getName();
      break label998;
      paramPreference = null;
      break label1044;
      paramf = arrayOfRegion[2].getName();
      break label1082;
    }
  }

  public final void ash()
  {
    AppMethodBeat.i(34900);
    Object localObject1;
    if (this.cGC == 3)
    {
      localObject1 = RegionCodeDecoder.duj().apS("CN");
      this.zGr = ((RegionCodeDecoder.Region[])localObject1);
      if ((this.zGr != null) && (this.zGr.length > 0))
        break label246;
      ab.e("MicroMsg.MultiStageCitySelectUI", "initZoneItems error ,check zone lists!");
      AppMethodBeat.o(34900);
    }
    while (true)
    {
      return;
      Object localObject2;
      if (bo.isNullOrNil(this.countryCode))
      {
        localObject2 = RegionCodeDecoder.duj().dul();
        localObject1 = localObject2;
        if (!this.zGv)
          break;
        localObject3 = new ArrayList();
        if (localObject2 != null)
        {
          int i = localObject2.length;
          for (j = 0; j < i; j++)
          {
            localObject1 = localObject2[j];
            if ((!"CN".equalsIgnoreCase(((RegionCodeDecoder.Region)localObject1).getCode())) && (!"HK".equalsIgnoreCase(((RegionCodeDecoder.Region)localObject1).getCode())) && (!"TW".equalsIgnoreCase(((RegionCodeDecoder.Region)localObject1).getCode())) && (!"MO".equalsIgnoreCase(((RegionCodeDecoder.Region)localObject1).getCode())))
              ((List)localObject3).add(localObject1);
          }
        }
        localObject1 = new RegionCodeDecoder.Region[((List)localObject3).size()];
        ((List)localObject3).toArray((Object[])localObject1);
        break;
      }
      if (bo.isNullOrNil(this.fnp))
      {
        localObject1 = RegionCodeDecoder.duj().apS(this.countryCode);
        break;
      }
      localObject1 = RegionCodeDecoder.duj().ie(this.countryCode, this.fnp);
      break;
      label246: this.ehK.removeAll();
      aw.ZK();
      String str = (String)c.Ry().get(12324, null);
      aw.ZK();
      localObject1 = (String)c.Ry().get(12325, null);
      aw.ZK();
      Object localObject3 = (String)c.Ry().get(12326, null);
      this.zGu = getIntent().getBooleanExtra("ShowSelectedLocation", true);
      int j = 0;
      if (j < this.zGr.length)
      {
        if ((this.zGr[j] != null) && (!bo.isNullOrNil(this.zGr[j].getCode())) && (!bo.isNullOrNil(this.zGr[j].getName())))
        {
          localObject2 = new ZonePreference(this);
          ((ZonePreference)localObject2).a(this.zGr[j]);
          if (!this.zGu)
            break label561;
          if ((this.cGC != 0) || (!this.zGr[j].getCode().equalsIgnoreCase(str)))
            break label456;
          this.ehK.a((Preference)localObject2, 0);
          ((ZonePreference)localObject2).setSummary(2131303019);
        }
        label561: 
        while (true)
        {
          j++;
          break;
          label456: if ((this.cGC == 1) && (this.zGr[j].getCode().equalsIgnoreCase((String)localObject1)))
          {
            this.ehK.a((Preference)localObject2, 0);
            ((ZonePreference)localObject2).setSummary(2131303019);
          }
          else if ((this.cGC == 2) && (this.zGr[j].getCode().equalsIgnoreCase((String)localObject3)))
          {
            this.ehK.a((Preference)localObject2, 0);
            ((ZonePreference)localObject2).setSummary(2131303019);
          }
          else
          {
            this.ehK.b((Preference)localObject2);
            continue;
            this.ehK.b((Preference)localObject2);
          }
        }
      }
      if (this.cGC == 3)
      {
        localObject1 = new ZoneSelectOtherCountryPreference(this);
        ((ZoneSelectOtherCountryPreference)localObject1).text = getString(2131303015);
        ((ZoneSelectOtherCountryPreference)localObject1).zIq = new ZoneSelectOtherCountryPreference.a()
        {
          public final void onClick()
          {
            AppMethodBeat.i(34892);
            Intent localIntent = new Intent(MultiStageCitySelectUI.this, MultiStageCitySelectUI.class);
            Bundle localBundle = new Bundle();
            localBundle.putBoolean("GetAddress", MultiStageCitySelectUI.g(MultiStageCitySelectUI.this));
            localBundle.putBoolean("ShowSelectedLocation", MultiStageCitySelectUI.h(MultiStageCitySelectUI.this));
            localBundle.putBoolean("IsSelectNonChinaCountry", true);
            localBundle.putBoolean("IsAutoPosition", false);
            localBundle.putBoolean("IsNeedShowSearchBar", true);
            localIntent.putExtras(localBundle);
            MultiStageCitySelectUI.this.startActivityForResult(localIntent, 1);
            AppMethodBeat.o(34892);
          }
        };
        this.ehK.b((Preference)localObject1);
      }
      localObject1 = new PreferenceCategory(this.mController.ylL);
      this.ehK.b((Preference)localObject1);
      if ((this.cGC == 0) || (this.cGC == 3))
      {
        if (this.zGt)
        {
          localObject1 = new PreferenceTitleCategory(this);
          ((PreferenceTitleCategory)localObject1).setTitle(2131303013);
          this.ehK.a((Preference)localObject1, 0);
          this.zGx = new ZoneRecommandPreference(this);
          this.zGx.setKey("current_location");
          this.ehK.a(this.zGx, 1);
        }
        localObject1 = new PreferenceTitleCategory(this);
        ((PreferenceTitleCategory)localObject1).setTitle(2131303012);
        if (this.zGt)
        {
          this.ehK.a((Preference)localObject1, 2);
          AppMethodBeat.o(34900);
        }
        else
        {
          this.ehK.a((Preference)localObject1, 0);
        }
      }
      else
      {
        AppMethodBeat.o(34900);
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(34905);
    setMMTitle(2131301613);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(34898);
        MultiStageCitySelectUI.n(MultiStageCitySelectUI.this);
        MultiStageCitySelectUI.this.finish();
        AppMethodBeat.o(34898);
        return true;
      }
    });
    this.zGs = getIntent().getBooleanExtra("GetAddress", false);
    this.countryCode = getIntent().getStringExtra("Country");
    this.fnp = getIntent().getStringExtra("Provice");
    this.fHE = getIntent().getStringExtra("CountryName");
    this.zGo = getIntent().getStringExtra("ProviceName");
    Intent localIntent = getIntent();
    boolean bool;
    if (!bo.gT(this))
    {
      bool = true;
      this.zGt = localIntent.getBooleanExtra("IsAutoPosition", bool);
      this.zGp = getIntent().getBooleanExtra("IsRealNameVerifyScene", false);
      this.zGv = getIntent().getBooleanExtra("IsSelectNonChinaCountry", false);
      this.zGw = getIntent().getBooleanExtra("IsNeedShowSearchBar", false);
      ab.i("MicroMsg.MultiStageCitySelectUI", " country = " + this.countryCode + " province =" + this.fnp + " city = " + this.fno + " " + this.fHE + " " + this.zGo + " " + this.zGp + " " + this.zGv);
      if (!this.zGp)
        break label299;
      this.cGC = 3;
    }
    while (true)
    {
      ash();
      AppMethodBeat.o(34905);
      return;
      bool = false;
      break;
      label299: if (this.countryCode == null)
      {
        this.cGC = 0;
        this.fnp = null;
        this.fno = null;
      }
      else if (this.fnp == null)
      {
        this.cGC = 1;
        this.fno = null;
      }
      else
      {
        this.cGC = 2;
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(34908);
    switch (paramInt1)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(34908);
      return;
      if (paramInt2 == -1)
      {
        setResult(-1, paramIntent);
        finish();
      }
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(34907);
    dJO();
    super.onBackPressed();
    AppMethodBeat.o(34907);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(34902);
    super.onCreate(paramBundle);
    aw.Rg().a(665, this);
    this.ehK = this.yCw;
    initView();
    long l;
    if (this.zGw)
      if ((zGy == null) || (zGy.size() <= 0))
      {
        l = bo.yz();
        paramBundle = RegionCodeDecoder.duj().dul();
        if ((paramBundle != null) && (paramBundle.length > 0))
          break label107;
      }
    while (true)
    {
      a(this.elS);
      this.elS.zHa = new o.b()
      {
        public final void apo()
        {
          AppMethodBeat.i(34893);
          MultiStageCitySelectUI.this.aqX();
          MultiStageCitySelectUI.i(MultiStageCitySelectUI.this);
          MultiStageCitySelectUI.this.ash();
          AppMethodBeat.o(34893);
        }

        public final void app()
        {
        }

        public final void apq()
        {
          AppMethodBeat.i(34896);
          MultiStageCitySelectUI.i(MultiStageCitySelectUI.this);
          MultiStageCitySelectUI.this.ash();
          AppMethodBeat.o(34896);
        }

        public final void apr()
        {
        }

        public final boolean vN(String paramAnonymousString)
        {
          AppMethodBeat.i(34895);
          boolean bool;
          if (!bo.isNullOrNil(paramAnonymousString))
          {
            MultiStageCitySelectUI.a(MultiStageCitySelectUI.this, paramAnonymousString);
            MultiStageCitySelectUI.j(MultiStageCitySelectUI.this).removeAll();
            MultiStageCitySelectUI.l(MultiStageCitySelectUI.this).removeCallbacks(MultiStageCitySelectUI.k(MultiStageCitySelectUI.this));
            MultiStageCitySelectUI.l(MultiStageCitySelectUI.this).postDelayed(MultiStageCitySelectUI.k(MultiStageCitySelectUI.this), 50L);
            bool = true;
            AppMethodBeat.o(34895);
          }
          while (true)
          {
            return bool;
            bool = false;
            AppMethodBeat.o(34895);
          }
        }

        public final void vO(String paramAnonymousString)
        {
          AppMethodBeat.i(34894);
          if (!bo.isNullOrNil(paramAnonymousString))
          {
            MultiStageCitySelectUI.a(MultiStageCitySelectUI.this, paramAnonymousString);
            MultiStageCitySelectUI.j(MultiStageCitySelectUI.this).removeAll();
            MultiStageCitySelectUI.l(MultiStageCitySelectUI.this).removeCallbacks(MultiStageCitySelectUI.k(MultiStageCitySelectUI.this));
            MultiStageCitySelectUI.l(MultiStageCitySelectUI.this).postDelayed(MultiStageCitySelectUI.k(MultiStageCitySelectUI.this), 50L);
          }
          AppMethodBeat.o(34894);
        }
      };
      AppMethodBeat.o(34902);
      return;
      label107: if ((zGy == null) || (zGy.size() <= 0))
      {
        paramBundle = dJP();
        zGy = paramBundle;
        if (paramBundle != null)
          ab.i("MicroMsg.MultiStageCitySelectUI", "buildAllSearchRegion used %sms, size: %s", new Object[] { Long.valueOf(bo.az(l)), Integer.valueOf(zGy.size()) });
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(34904);
    aw.Rg().b(665, this);
    if (this.fwu != null)
      this.fwu.c(this.ecy);
    super.onDestroy();
    AppMethodBeat.o(34904);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(34911);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.MultiStageCitySelectUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(34911);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.MultiStageCitySelectUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
      if (paramArrayOfInt.length != 0)
        break;
      AppMethodBeat.o(34911);
    }
    switch (paramInt)
    {
    default:
    case 64:
    }
    while (true)
    {
      AppMethodBeat.o(34911);
      break;
      if (paramArrayOfInt[0] != 0)
      {
        if (this.zGx != null)
          this.zGx.dKc();
        this.gwZ = false;
      }
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(34903);
    super.onResume();
    if (this.gwZ)
    {
      boolean bool = b.a(this, "android.permission.ACCESS_COARSE_LOCATION", 64, null, null);
      ab.i("MicroMsg.MultiStageCitySelectUI", "settings district,checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        if (this.fwu == null)
          this.fwu = d.agz();
        this.fwu.a(this.ecy, true);
      }
    }
    AppMethodBeat.o(34903);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(34909);
    j localj;
    Object localObject;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (paramm.getType() != 665)
        break label328;
      localj = (j)paramm;
      paramm = localj.country;
      paramString = localj.duc;
      localObject = localj.dud;
      ab.i("MicroMsg.MultiStageCitySelectUI", "current location country %s, province %s, city %s", new Object[] { paramm, paramString, localObject });
      RegionCodeDecoder.Region[] arrayOfRegion = RegionCodeDecoder.duj().dul();
      paramInt2 = arrayOfRegion.length;
      paramInt1 = 0;
      if (paramInt1 >= paramInt2)
        break label337;
      localj = arrayOfRegion[paramInt1];
      if (localj.getCode().equalsIgnoreCase(paramm))
      {
        arrayOfRegion = RegionCodeDecoder.duj().apS(localj.getCode());
        paramInt2 = arrayOfRegion.length;
        paramInt1 = 0;
        label136: if (paramInt1 < paramInt2)
        {
          paramm = arrayOfRegion[paramInt1];
          if (paramm.getCode().equalsIgnoreCase(paramString))
          {
            arrayOfRegion = RegionCodeDecoder.duj().ie(localj.getCode(), paramm.getCode());
            paramInt2 = arrayOfRegion.length;
            paramInt1 = 0;
            label183: if (paramInt1 < paramInt2)
            {
              paramString = arrayOfRegion[paramInt1];
              if (!paramString.getCode().equalsIgnoreCase((String)localObject));
            }
          }
        }
      }
    }
    while (true)
    {
      label205: if ((localj == null) && (paramm == null) && (paramString == null))
      {
        if (this.zGx == null)
          break label315;
        this.zGx.dKc();
        AppMethodBeat.o(34909);
      }
      while (true)
      {
        return;
        paramInt1++;
        break label183;
        paramString = null;
        break label205;
        paramInt1++;
        break label136;
        paramString = null;
        paramm = null;
        break label205;
        paramInt1++;
        break;
        if (this.zGx != null)
        {
          localObject = this.zGx;
          ((ZoneRecommandPreference)localObject).status = 1;
          ((ZoneRecommandPreference)localObject).zIl = localj;
          ((ZoneRecommandPreference)localObject).zIm = paramm;
          ((ZoneRecommandPreference)localObject).zIn = paramString;
          ((ZoneRecommandPreference)localObject).dKb();
        }
        label315: AppMethodBeat.o(34909);
        continue;
        dJQ();
        label328: AppMethodBeat.o(34909);
      }
      label337: paramString = null;
      paramm = null;
      localj = null;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MultiStageCitySelectUI
 * JD-Core Version:    0.6.2
 */