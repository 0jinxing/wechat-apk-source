package com.tencent.mm.storage.emotion;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.k;
import com.tencent.mm.g.c.ba;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.gif.i;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.vfs.b;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Map;

public class EmojiInfo extends ba
  implements Parcelable, k
{
  public static final Parcelable.Creator<EmojiInfo> CREATOR;
  public static int TYPE_TEXT;
  protected static c.a ccO;
  public static int yaA;
  public static int yaB;
  public static int yab;
  public static int yaf;
  public static String yag;
  public static int yah;
  public static int yai;
  public static int yaj;
  public static int yak;
  public static int yal;
  public static int yam;
  public static int yan;
  public static int yao;
  public static int yap;
  public static int yaq;
  public static int yar;
  public static int yas;
  public static int yat;
  public static int yau;
  public static int yav;
  public static int yax;
  public static int yay;
  public static int yaz;
  public final String ptQ;
  public String talker;

  static
  {
    AppMethodBeat.i(62792);
    yag = ".gif";
    yah = 17;
    yai = 32;
    yaj = 49;
    yak = 50;
    yaf = 65;
    yal = 81;
    yab = -1;
    yam = 1;
    yan = 2;
    yao = 3;
    TYPE_TEXT = 4;
    yap = 10;
    yaq = 11;
    yar = 0;
    yas = 1;
    yat = 3;
    yau = 4;
    yav = 8;
    yax = 0;
    yay = 1;
    yaz = 0;
    yaA = 1;
    yaB = 1;
    c.a locala = new c.a();
    locala.xDb = new Field[44];
    locala.columns = new String[45];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "md5";
    locala.xDd.put("md5", "TEXT PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(" md5 TEXT PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(", ");
    locala.xDc = "md5";
    locala.columns[1] = "svrid";
    locala.xDd.put("svrid", "TEXT");
    localStringBuilder.append(" svrid TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "catalog";
    locala.xDd.put("catalog", "INTEGER");
    localStringBuilder.append(" catalog INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "type";
    locala.xDd.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "size";
    locala.xDd.put("size", "INTEGER");
    localStringBuilder.append(" size INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "start";
    locala.xDd.put("start", "INTEGER");
    localStringBuilder.append(" start INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "state";
    locala.xDd.put("state", "INTEGER");
    localStringBuilder.append(" state INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "name";
    locala.xDd.put("name", "TEXT");
    localStringBuilder.append(" name TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "content";
    locala.xDd.put("content", "TEXT");
    localStringBuilder.append(" content TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "reserved1";
    locala.xDd.put("reserved1", "TEXT");
    localStringBuilder.append(" reserved1 TEXT");
    localStringBuilder.append(", ");
    locala.columns[10] = "reserved2";
    locala.xDd.put("reserved2", "TEXT");
    localStringBuilder.append(" reserved2 TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "reserved3";
    locala.xDd.put("reserved3", "INTEGER");
    localStringBuilder.append(" reserved3 INTEGER");
    localStringBuilder.append(", ");
    locala.columns[12] = "reserved4";
    locala.xDd.put("reserved4", "INTEGER");
    localStringBuilder.append(" reserved4 INTEGER");
    localStringBuilder.append(", ");
    locala.columns[13] = "app_id";
    locala.xDd.put("app_id", "TEXT");
    localStringBuilder.append(" app_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "groupId";
    locala.xDd.put("groupId", "TEXT default '' ");
    localStringBuilder.append(" groupId TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[15] = "lastUseTime";
    locala.xDd.put("lastUseTime", "LONG");
    localStringBuilder.append(" lastUseTime LONG");
    localStringBuilder.append(", ");
    locala.columns[16] = "framesInfo";
    locala.xDd.put("framesInfo", "TEXT default '' ");
    localStringBuilder.append(" framesInfo TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[17] = "idx";
    locala.xDd.put("idx", "INTEGER default '0' ");
    localStringBuilder.append(" idx INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[18] = "temp";
    locala.xDd.put("temp", "INTEGER default '0' ");
    localStringBuilder.append(" temp INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[19] = "source";
    locala.xDd.put("source", "INTEGER default '0' ");
    localStringBuilder.append(" source INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[20] = "needupload";
    locala.xDd.put("needupload", "INTEGER default '0' ");
    localStringBuilder.append(" needupload INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[21] = "designerID";
    locala.xDd.put("designerID", "TEXT");
    localStringBuilder.append(" designerID TEXT");
    localStringBuilder.append(", ");
    locala.columns[22] = "thumbUrl";
    locala.xDd.put("thumbUrl", "TEXT");
    localStringBuilder.append(" thumbUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[23] = "cdnUrl";
    locala.xDd.put("cdnUrl", "TEXT");
    localStringBuilder.append(" cdnUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[24] = "encrypturl";
    locala.xDd.put("encrypturl", "TEXT");
    localStringBuilder.append(" encrypturl TEXT");
    localStringBuilder.append(", ");
    locala.columns[25] = "aeskey";
    locala.xDd.put("aeskey", "TEXT");
    localStringBuilder.append(" aeskey TEXT");
    localStringBuilder.append(", ");
    locala.columns[26] = "width";
    locala.xDd.put("width", "INTEGER default '0' ");
    localStringBuilder.append(" width INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[27] = "height";
    locala.xDd.put("height", "INTEGER default '0' ");
    localStringBuilder.append(" height INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[28] = "externUrl";
    locala.xDd.put("externUrl", "TEXT");
    localStringBuilder.append(" externUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[29] = "externMd5";
    locala.xDd.put("externMd5", "TEXT");
    localStringBuilder.append(" externMd5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[30] = "activityid";
    locala.xDd.put("activityid", "TEXT");
    localStringBuilder.append(" activityid TEXT");
    localStringBuilder.append(", ");
    locala.columns[31] = "tpurl";
    locala.xDd.put("tpurl", "TEXT");
    localStringBuilder.append(" tpurl TEXT");
    localStringBuilder.append(", ");
    locala.columns[32] = "tpauthkey";
    locala.xDd.put("tpauthkey", "TEXT");
    localStringBuilder.append(" tpauthkey TEXT");
    localStringBuilder.append(", ");
    locala.columns[33] = "wxamMd5";
    locala.xDd.put("wxamMd5", "TEXT");
    localStringBuilder.append(" wxamMd5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[34] = "attachedText";
    locala.xDd.put("attachedText", "TEXT");
    localStringBuilder.append(" attachedText TEXT");
    localStringBuilder.append(", ");
    locala.columns[35] = "captureStatus";
    locala.xDd.put("captureStatus", "INTEGER default '0' ");
    localStringBuilder.append(" captureStatus INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[36] = "attachedEmojiMD5";
    locala.xDd.put("attachedEmojiMD5", "BLOB default '' ");
    localStringBuilder.append(" attachedEmojiMD5 BLOB default '' ");
    localStringBuilder.append(", ");
    locala.columns[37] = "imitateMd5";
    locala.xDd.put("imitateMd5", "TEXT");
    localStringBuilder.append(" imitateMd5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[38] = "captureUploadErrCode";
    locala.xDd.put("captureUploadErrCode", "INTEGER default '0' ");
    localStringBuilder.append(" captureUploadErrCode INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[39] = "captureUploadCounter";
    locala.xDd.put("captureUploadCounter", "INTEGER default '0' ");
    localStringBuilder.append(" captureUploadCounter INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[40] = "captureEnterTime";
    locala.xDd.put("captureEnterTime", "LONG");
    localStringBuilder.append(" captureEnterTime LONG");
    localStringBuilder.append(", ");
    locala.columns[41] = "lensId";
    locala.xDd.put("lensId", "TEXT");
    localStringBuilder.append(" lensId TEXT");
    localStringBuilder.append(", ");
    locala.columns[42] = "attachTextColor";
    locala.xDd.put("attachTextColor", "TEXT");
    localStringBuilder.append(" attachTextColor TEXT");
    localStringBuilder.append(", ");
    locala.columns[43] = "captureScene";
    locala.xDd.put("captureScene", "INTEGER");
    localStringBuilder.append(" captureScene INTEGER");
    locala.columns[44] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    CREATOR = new EmojiInfo.1();
    AppMethodBeat.o(62792);
  }

  public EmojiInfo()
  {
    AppMethodBeat.i(62765);
    StringBuilder localStringBuilder;
    if (((h)g.RM().Rn()).SG())
    {
      localStringBuilder = new StringBuilder();
      g.RQ();
    }
    for (this.ptQ = (g.RP().eJM + "emoji/"); ; this.ptQ = (((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().getAccPath() + "emoji/"))
    {
      reset();
      AppMethodBeat.o(62765);
      return;
    }
  }

  protected EmojiInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(62791);
    this.ptQ = paramParcel.readString();
    this.field_md5 = paramParcel.readString();
    this.field_svrid = paramParcel.readString();
    this.field_catalog = paramParcel.readInt();
    this.field_type = paramParcel.readInt();
    this.field_size = paramParcel.readInt();
    this.field_start = paramParcel.readInt();
    this.field_state = paramParcel.readInt();
    this.field_name = paramParcel.readString();
    this.field_content = paramParcel.readString();
    this.field_reserved1 = paramParcel.readString();
    this.field_reserved2 = paramParcel.readString();
    this.field_reserved3 = paramParcel.readInt();
    this.field_reserved4 = paramParcel.readInt();
    this.field_app_id = paramParcel.readString();
    this.field_groupId = paramParcel.readString();
    this.field_lastUseTime = paramParcel.readLong();
    this.field_framesInfo = paramParcel.readString();
    this.field_idx = paramParcel.readInt();
    this.field_temp = paramParcel.readInt();
    this.field_source = paramParcel.readInt();
    this.field_needupload = paramParcel.readInt();
    this.field_designerID = paramParcel.readString();
    this.field_thumbUrl = paramParcel.readString();
    this.field_cdnUrl = paramParcel.readString();
    this.field_encrypturl = paramParcel.readString();
    this.field_aeskey = paramParcel.readString();
    this.field_width = paramParcel.readInt();
    this.field_height = paramParcel.readInt();
    this.field_activityid = paramParcel.readString();
    this.xDa = paramParcel.readLong();
    this.field_wxamMd5 = paramParcel.readString();
    this.field_attachedText = paramParcel.readString();
    this.field_captureStatus = paramParcel.readInt();
    int i = paramParcel.readInt();
    if (i > 0)
    {
      this.field_attachedEmojiMD5 = new byte[i];
      paramParcel.readByteArray(this.field_attachedEmojiMD5);
    }
    this.field_imitateMd5 = paramParcel.readString();
    this.field_captureUploadErrCode = paramParcel.readInt();
    this.field_captureUploadCounter = paramParcel.readInt();
    this.field_captureEnterTime = paramParcel.readLong();
    this.field_lensId = paramParcel.readString();
    this.field_attachTextColor = paramParcel.readString();
    this.field_captureScene = paramParcel.readInt();
    AppMethodBeat.o(62791);
  }

  public EmojiInfo(String paramString)
  {
    AppMethodBeat.i(62766);
    this.ptQ = paramString;
    reset();
    AppMethodBeat.o(62766);
  }

  public static boolean Mv(int paramInt)
  {
    if ((paramInt == yak) || (paramInt == yaj));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static InputStream bJ(Context paramContext, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(62772);
    if ((paramContext == null) || (bo.isNullOrNil(paramString)))
    {
      AppMethodBeat.o(62772);
      paramContext = localObject;
    }
    while (true)
    {
      return paramContext;
      try
      {
        paramString = paramString.split("\\.")[0];
        ab.d("MicroMsg.emoji.EmojiInfo", "emoji drawable name is %s", new Object[] { paramString });
        int i = paramContext.getResources().getIdentifier(paramString, "drawable", paramContext.getPackageName());
        paramContext = paramContext.getResources().openRawResource(i);
        AppMethodBeat.o(62772);
      }
      catch (Exception paramContext)
      {
        ab.w("MicroMsg.emoji.EmojiInfo", "get emoji file fail, %s", new Object[] { paramContext.getMessage() });
        AppMethodBeat.o(62772);
        paramContext = localObject;
      }
    }
  }

  public static String dvg()
  {
    AppMethodBeat.i(62786);
    String str = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().getAccPath() + "emoji/";
    AppMethodBeat.o(62786);
    return str;
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final String Aq()
  {
    if (this.field_md5 == null);
    for (String str = ""; ; str = this.field_md5)
      return str;
  }

  public final void Mw(int paramInt)
  {
    this.field_catalog = paramInt;
  }

  public final void a(EmojiInfo.a parama)
  {
    AppMethodBeat.i(62780);
    this.field_captureStatus = parama.ordinal();
    AppMethodBeat.o(62780);
  }

  public final void a(EmojiInfo.b paramb)
  {
    AppMethodBeat.i(62781);
    this.field_captureUploadErrCode = paramb.ordinal();
    AppMethodBeat.o(62781);
  }

  // ERROR //
  public final void al(java.util.ArrayList<String> paramArrayList)
  {
    // Byte code:
    //   0: ldc_w 634
    //   3: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 636	java/io/ByteArrayOutputStream
    //   9: astore_2
    //   10: aload_2
    //   11: invokespecial 637	java/io/ByteArrayOutputStream:<init>	()V
    //   14: new 639	java/io/ObjectOutputStream
    //   17: astore_3
    //   18: aload_3
    //   19: aload_2
    //   20: invokespecial 642	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   23: aload_3
    //   24: astore 4
    //   26: aload_2
    //   27: astore 5
    //   29: aload_3
    //   30: aload_1
    //   31: invokevirtual 646	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   34: aload_3
    //   35: astore 4
    //   37: aload_2
    //   38: astore 5
    //   40: aload_0
    //   41: aload_2
    //   42: invokevirtual 650	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   45: putfield 527	com/tencent/mm/storage/emotion/EmojiInfo:field_attachedEmojiMD5	[B
    //   48: aload_3
    //   49: invokevirtual 653	java/io/ObjectOutputStream:close	()V
    //   52: aload_2
    //   53: invokevirtual 654	java/io/ByteArrayOutputStream:close	()V
    //   56: ldc_w 634
    //   59: invokestatic 352	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   62: return
    //   63: astore_1
    //   64: ldc_w 575
    //   67: new 123	java/lang/StringBuilder
    //   70: dup
    //   71: ldc_w 656
    //   74: invokespecial 658	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   77: aload_1
    //   78: invokevirtual 611	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   81: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: invokestatic 662	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   90: goto -38 -> 52
    //   93: astore_1
    //   94: ldc_w 575
    //   97: new 123	java/lang/StringBuilder
    //   100: dup
    //   101: ldc_w 664
    //   104: invokespecial 658	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   107: aload_1
    //   108: invokevirtual 611	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   111: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   117: invokestatic 662	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   120: ldc_w 634
    //   123: invokestatic 352	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   126: goto -64 -> 62
    //   129: astore 6
    //   131: aconst_null
    //   132: astore_1
    //   133: aconst_null
    //   134: astore_2
    //   135: aload_1
    //   136: astore 4
    //   138: aload_2
    //   139: astore 5
    //   141: new 123	java/lang/StringBuilder
    //   144: astore_3
    //   145: aload_1
    //   146: astore 4
    //   148: aload_2
    //   149: astore 5
    //   151: aload_3
    //   152: ldc_w 666
    //   155: invokespecial 658	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   158: aload_1
    //   159: astore 4
    //   161: aload_2
    //   162: astore 5
    //   164: ldc_w 575
    //   167: aload_3
    //   168: aload 6
    //   170: invokevirtual 611	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   173: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   179: invokestatic 662	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   182: aload_1
    //   183: ifnull +7 -> 190
    //   186: aload_1
    //   187: invokevirtual 653	java/io/ObjectOutputStream:close	()V
    //   190: aload_2
    //   191: ifnull +7 -> 198
    //   194: aload_2
    //   195: invokevirtual 654	java/io/ByteArrayOutputStream:close	()V
    //   198: ldc_w 634
    //   201: invokestatic 352	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   204: goto -142 -> 62
    //   207: astore_1
    //   208: ldc_w 575
    //   211: new 123	java/lang/StringBuilder
    //   214: dup
    //   215: ldc_w 656
    //   218: invokespecial 658	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   221: aload_1
    //   222: invokevirtual 611	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   225: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   231: invokestatic 662	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   234: goto -44 -> 190
    //   237: astore_1
    //   238: ldc_w 575
    //   241: new 123	java/lang/StringBuilder
    //   244: dup
    //   245: ldc_w 664
    //   248: invokespecial 658	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   251: aload_1
    //   252: invokevirtual 611	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   255: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   261: invokestatic 662	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   264: ldc_w 634
    //   267: invokestatic 352	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   270: goto -208 -> 62
    //   273: astore_1
    //   274: aconst_null
    //   275: astore 4
    //   277: aconst_null
    //   278: astore_2
    //   279: aload 4
    //   281: ifnull +8 -> 289
    //   284: aload 4
    //   286: invokevirtual 653	java/io/ObjectOutputStream:close	()V
    //   289: aload_2
    //   290: ifnull +7 -> 297
    //   293: aload_2
    //   294: invokevirtual 654	java/io/ByteArrayOutputStream:close	()V
    //   297: ldc_w 634
    //   300: invokestatic 352	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   303: aload_1
    //   304: athrow
    //   305: astore 5
    //   307: ldc_w 575
    //   310: new 123	java/lang/StringBuilder
    //   313: dup
    //   314: ldc_w 656
    //   317: invokespecial 658	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   320: aload 5
    //   322: invokevirtual 611	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   325: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   331: invokestatic 662	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   334: goto -45 -> 289
    //   337: astore_2
    //   338: ldc_w 575
    //   341: new 123	java/lang/StringBuilder
    //   344: dup
    //   345: ldc_w 664
    //   348: invokespecial 658	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   351: aload_2
    //   352: invokevirtual 611	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   355: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   358: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   361: invokestatic 662	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   364: goto -67 -> 297
    //   367: astore_1
    //   368: aconst_null
    //   369: astore 4
    //   371: goto -92 -> 279
    //   374: astore_1
    //   375: aload 5
    //   377: astore_2
    //   378: goto -99 -> 279
    //   381: astore 6
    //   383: aconst_null
    //   384: astore_1
    //   385: goto -250 -> 135
    //   388: astore 6
    //   390: aload_3
    //   391: astore_1
    //   392: goto -257 -> 135
    //
    // Exception table:
    //   from	to	target	type
    //   48	52	63	java/lang/Exception
    //   52	56	93	java/lang/Exception
    //   6	14	129	java/lang/Exception
    //   186	190	207	java/lang/Exception
    //   194	198	237	java/lang/Exception
    //   6	14	273	finally
    //   284	289	305	java/lang/Exception
    //   293	297	337	java/lang/Exception
    //   14	23	367	finally
    //   29	34	374	finally
    //   40	48	374	finally
    //   141	145	374	finally
    //   151	158	374	finally
    //   164	182	374	finally
    //   14	23	381	java/lang/Exception
    //   29	34	388	java/lang/Exception
    //   40	48	388	java/lang/Exception
  }

  public final void aqe(String paramString)
  {
    this.field_groupId = paramString;
  }

  public final String awa()
  {
    return this.field_groupId;
  }

  public final boolean cJ(Object paramObject)
  {
    AppMethodBeat.i(62788);
    boolean bool;
    if ((paramObject != null) && ((paramObject instanceof EmojiInfo)) && (((EmojiInfo)paramObject).Aq().equalsIgnoreCase(this.field_md5)))
    {
      bool = true;
      AppMethodBeat.o(62788);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62788);
    }
  }

  public final boolean cVD()
  {
    AppMethodBeat.i(62779);
    boolean bool;
    if (Aq().length() == 32)
    {
      bool = true;
      AppMethodBeat.o(62779);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62779);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public final boolean duP()
  {
    boolean bool = false;
    AppMethodBeat.i(62769);
    if ((this.field_catalog == yah) || (this.field_catalog == EmojiGroupInfo.yad) || (this.field_catalog == yak) || (this.field_catalog == yaj))
    {
      AppMethodBeat.o(62769);
      bool = true;
    }
    while (true)
    {
      return bool;
      Object localObject = dve();
      if (bo.isNullOrNil((String)localObject))
      {
        AppMethodBeat.o(62769);
      }
      else
      {
        localObject = new b((String)localObject);
        if ((((b)localObject).exists()) && (((b)localObject).length() > 0L))
        {
          AppMethodBeat.o(62769);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(62769);
        }
      }
    }
  }

  public final void duQ()
  {
    AppMethodBeat.i(62770);
    if ((this.field_catalog == yah) || (this.field_catalog == yak) || (this.field_catalog == yaj))
      AppMethodBeat.o(62770);
    while (true)
    {
      return;
      Object localObject = dve();
      if (!bo.isNullOrNil((String)localObject))
      {
        localObject = new b((String)localObject);
        if (((b)localObject).exists())
          ((b)localObject).delete();
      }
      AppMethodBeat.o(62770);
    }
  }

  public final boolean duR()
  {
    AppMethodBeat.i(62771);
    boolean bool;
    if ((this.field_catalog == yah) || (this.field_catalog == yak) || (this.field_catalog == yaj))
    {
      bool = true;
      AppMethodBeat.o(62771);
    }
    while (true)
    {
      return bool;
      String str = dve();
      if (bo.isNullOrNil(str))
      {
        bool = false;
        AppMethodBeat.o(62771);
      }
      else
      {
        bool = new b(str).exists();
        AppMethodBeat.o(62771);
      }
    }
  }

  public final boolean duS()
  {
    if ((this.field_catalog == yah) || (this.field_catalog == yak) || (this.field_catalog == yaj));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean duT()
  {
    AppMethodBeat.i(62776);
    boolean bool = this.field_groupId.equalsIgnoreCase("com.tencent.xin.emoticon.tuzki2");
    AppMethodBeat.o(62776);
    return bool;
  }

  public final boolean duU()
  {
    AppMethodBeat.i(62777);
    boolean bool;
    if ((bo.isNullOrNil(this.field_app_id)) && (!bo.isNullOrNil(this.field_groupId)) && (!this.field_groupId.equals(String.valueOf(EmojiGroupInfo.yad))) && (!this.field_groupId.equals(String.valueOf(EmojiGroupInfo.yac))) && (!this.field_groupId.equals(String.valueOf(EmojiGroupInfo.yae))) && (!this.field_groupId.equals(String.valueOf(yaf))) && (!this.field_groupId.equals("capture")))
    {
      bool = true;
      AppMethodBeat.o(62777);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62777);
    }
  }

  public final boolean duV()
  {
    AppMethodBeat.i(62778);
    boolean bool;
    if (!bo.isNullOrNil(this.field_wxamMd5))
    {
      bool = true;
      AppMethodBeat.o(62778);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62778);
    }
  }

  public final String duW()
  {
    if (this.field_svrid == null);
    for (String str = ""; ; str = this.field_svrid)
      return str;
  }

  public final int duX()
  {
    return this.field_reserved4;
  }

  public final void duY()
  {
    this.field_temp = 1;
  }

  public final EmojiInfo.a duZ()
  {
    EmojiInfo.a locala;
    switch (this.field_captureStatus)
    {
    default:
      locala = EmojiInfo.a.yaC;
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return locala;
      locala = EmojiInfo.a.yaC;
      continue;
      locala = EmojiInfo.a.yaD;
      continue;
      locala = EmojiInfo.a.yaE;
      continue;
      locala = EmojiInfo.a.yaF;
      continue;
      locala = EmojiInfo.a.yaG;
    }
  }

  public final int dva()
  {
    return this.field_captureUploadCounter;
  }

  public final void dvb()
  {
    this.field_captureUploadCounter += 1;
  }

  public final EmojiInfo.b dvc()
  {
    EmojiInfo.b localb;
    switch (this.field_captureUploadErrCode)
    {
    default:
      localb = EmojiInfo.b.yaO;
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    }
    while (true)
    {
      return localb;
      localb = EmojiInfo.b.yaI;
      continue;
      localb = EmojiInfo.b.yaJ;
      continue;
      localb = EmojiInfo.b.yaK;
      continue;
      localb = EmojiInfo.b.yaL;
      continue;
      localb = EmojiInfo.b.yaM;
      continue;
      localb = EmojiInfo.b.yaN;
      continue;
      localb = EmojiInfo.b.yaO;
      continue;
      localb = EmojiInfo.b.yaP;
      continue;
      localb = EmojiInfo.b.yaQ;
      continue;
      localb = EmojiInfo.b.yaR;
      continue;
      localb = EmojiInfo.b.yaS;
    }
  }

  // ERROR //
  public final java.util.ArrayList<String> dvd()
  {
    // Byte code:
    //   0: ldc_w 795
    //   3: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 797	java/io/ByteArrayInputStream
    //   9: astore_1
    //   10: aload_1
    //   11: aload_0
    //   12: getfield 527	com/tencent/mm/storage/emotion/EmojiInfo:field_attachedEmojiMD5	[B
    //   15: invokespecial 799	java/io/ByteArrayInputStream:<init>	([B)V
    //   18: new 801	java/io/ObjectInputStream
    //   21: astore_2
    //   22: aload_2
    //   23: aload_1
    //   24: invokespecial 804	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   27: aload_2
    //   28: astore_3
    //   29: aload_1
    //   30: astore 4
    //   32: aload_2
    //   33: invokevirtual 808	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   36: checkcast 810	java/util/ArrayList
    //   39: astore 5
    //   41: aload_1
    //   42: invokevirtual 811	java/io/ByteArrayInputStream:close	()V
    //   45: aload_2
    //   46: invokevirtual 812	java/io/ObjectInputStream:close	()V
    //   49: aload 5
    //   51: astore_2
    //   52: ldc_w 795
    //   55: invokestatic 352	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   58: aload_2
    //   59: areturn
    //   60: astore_1
    //   61: ldc_w 575
    //   64: new 123	java/lang/StringBuilder
    //   67: dup
    //   68: ldc_w 814
    //   71: invokespecial 658	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   74: aload_1
    //   75: invokevirtual 611	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   78: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   84: invokestatic 662	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   87: goto -42 -> 45
    //   90: astore_2
    //   91: ldc_w 575
    //   94: new 123	java/lang/StringBuilder
    //   97: dup
    //   98: ldc_w 816
    //   101: invokespecial 658	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   104: aload_2
    //   105: invokevirtual 611	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   108: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: invokestatic 662	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   117: aload 5
    //   119: astore_2
    //   120: goto -68 -> 52
    //   123: astore 5
    //   125: aconst_null
    //   126: astore_2
    //   127: aconst_null
    //   128: astore_1
    //   129: aload_2
    //   130: astore_3
    //   131: aload_1
    //   132: astore 4
    //   134: new 123	java/lang/StringBuilder
    //   137: astore 6
    //   139: aload_2
    //   140: astore_3
    //   141: aload_1
    //   142: astore 4
    //   144: aload 6
    //   146: ldc_w 818
    //   149: invokespecial 658	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   152: aload_2
    //   153: astore_3
    //   154: aload_1
    //   155: astore 4
    //   157: ldc_w 575
    //   160: aload 6
    //   162: aload 5
    //   164: invokevirtual 611	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   167: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   173: invokestatic 662	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   176: aload_1
    //   177: ifnull +7 -> 184
    //   180: aload_1
    //   181: invokevirtual 811	java/io/ByteArrayInputStream:close	()V
    //   184: aload_2
    //   185: ifnull +7 -> 192
    //   188: aload_2
    //   189: invokevirtual 812	java/io/ObjectInputStream:close	()V
    //   192: aconst_null
    //   193: astore_2
    //   194: goto -142 -> 52
    //   197: astore_1
    //   198: ldc_w 575
    //   201: new 123	java/lang/StringBuilder
    //   204: dup
    //   205: ldc_w 814
    //   208: invokespecial 658	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   211: aload_1
    //   212: invokevirtual 611	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   215: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   221: invokestatic 662	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   224: goto -40 -> 184
    //   227: astore_2
    //   228: ldc_w 575
    //   231: new 123	java/lang/StringBuilder
    //   234: dup
    //   235: ldc_w 816
    //   238: invokespecial 658	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   241: aload_2
    //   242: invokevirtual 611	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   245: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   251: invokestatic 662	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   254: aconst_null
    //   255: astore_2
    //   256: goto -204 -> 52
    //   259: astore_2
    //   260: aconst_null
    //   261: astore_3
    //   262: aconst_null
    //   263: astore_1
    //   264: aload_1
    //   265: ifnull +7 -> 272
    //   268: aload_1
    //   269: invokevirtual 811	java/io/ByteArrayInputStream:close	()V
    //   272: aload_3
    //   273: ifnull +7 -> 280
    //   276: aload_3
    //   277: invokevirtual 812	java/io/ObjectInputStream:close	()V
    //   280: ldc_w 795
    //   283: invokestatic 352	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   286: aload_2
    //   287: athrow
    //   288: astore_1
    //   289: ldc_w 575
    //   292: new 123	java/lang/StringBuilder
    //   295: dup
    //   296: ldc_w 814
    //   299: invokespecial 658	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   302: aload_1
    //   303: invokevirtual 611	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   306: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   312: invokestatic 662	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   315: goto -43 -> 272
    //   318: astore_1
    //   319: ldc_w 575
    //   322: new 123	java/lang/StringBuilder
    //   325: dup
    //   326: ldc_w 816
    //   329: invokespecial 658	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   332: aload_1
    //   333: invokevirtual 611	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   336: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   339: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   342: invokestatic 662	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   345: goto -65 -> 280
    //   348: astore_2
    //   349: aconst_null
    //   350: astore_3
    //   351: goto -87 -> 264
    //   354: astore_2
    //   355: aload 4
    //   357: astore_1
    //   358: goto -94 -> 264
    //   361: astore 5
    //   363: aconst_null
    //   364: astore_2
    //   365: goto -236 -> 129
    //   368: astore 5
    //   370: goto -241 -> 129
    //
    // Exception table:
    //   from	to	target	type
    //   41	45	60	java/lang/Exception
    //   45	49	90	java/lang/Exception
    //   6	18	123	java/lang/Exception
    //   180	184	197	java/lang/Exception
    //   188	192	227	java/lang/Exception
    //   6	18	259	finally
    //   268	272	288	java/lang/Exception
    //   276	280	318	java/lang/Exception
    //   18	27	348	finally
    //   32	41	354	finally
    //   134	139	354	finally
    //   144	152	354	finally
    //   157	176	354	finally
    //   18	27	361	java/lang/Exception
    //   32	41	368	java/lang/Exception
  }

  public final String dve()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(62784);
    if ((bo.isNullOrNil(this.field_groupId)) && (bo.isNullOrNil(this.field_md5)))
    {
      ab.w("MicroMsg.emoji.EmojiInfo", "[cpan] get icon path failed. product id and md5 are null.");
      AppMethodBeat.o(62784);
      return localObject2;
    }
    localObject2 = localObject1;
    if (!bo.isNullOrNil(this.field_md5))
      if ((!bo.isNullOrNil(this.field_groupId)) && (!bo.isEqual(this.field_groupId, "capture")))
        break label116;
    label116: for (localObject2 = this.ptQ + this.field_md5; ; localObject2 = this.ptQ + this.field_groupId + "/" + this.field_md5)
    {
      AppMethodBeat.o(62784);
      break;
    }
  }

  public final String dvf()
  {
    AppMethodBeat.i(62785);
    String str = dve();
    if (str == null)
    {
      str = null;
      AppMethodBeat.o(62785);
    }
    while (true)
    {
      return str;
      str = str + "_cover";
      AppMethodBeat.o(62785);
    }
  }

  public boolean equals(Object paramObject)
  {
    AppMethodBeat.i(62787);
    boolean bool = cJ(paramObject);
    AppMethodBeat.o(62787);
    return bool;
  }

  // ERROR //
  public final byte[] gZ(int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc_w 842
    //   5: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: iload_1
    //   9: iflt +7 -> 16
    //   12: iload_2
    //   13: ifge +11 -> 24
    //   16: ldc_w 842
    //   19: invokestatic 352	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   22: aload_3
    //   23: areturn
    //   24: aload_0
    //   25: getfield 428	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   28: getstatic 60	com/tencent/mm/storage/emotion/EmojiInfo:yah	I
    //   31: if_icmpeq +23 -> 54
    //   34: aload_0
    //   35: getfield 428	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   38: getstatic 66	com/tencent/mm/storage/emotion/EmojiInfo:yak	I
    //   41: if_icmpeq +13 -> 54
    //   44: aload_0
    //   45: getfield 428	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   48: getstatic 64	com/tencent/mm/storage/emotion/EmojiInfo:yaj	I
    //   51: if_icmpne +156 -> 207
    //   54: ldc_w 575
    //   57: ldc_w 844
    //   60: iconst_1
    //   61: anewarray 579	java/lang/Object
    //   64: dup
    //   65: iconst_0
    //   66: aload_0
    //   67: invokevirtual 847	com/tencent/mm/storage/emotion/EmojiInfo:getName	()Ljava/lang/String;
    //   70: aastore
    //   71: invokestatic 585	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   74: invokestatic 853	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   77: aload_0
    //   78: invokevirtual 847	com/tencent/mm/storage/emotion/EmojiInfo:getName	()Ljava/lang/String;
    //   81: invokestatic 855	com/tencent/mm/storage/emotion/EmojiInfo:bJ	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   84: astore 4
    //   86: iload_1
    //   87: i2l
    //   88: lstore 5
    //   90: aload 4
    //   92: astore_3
    //   93: aload 4
    //   95: lload 5
    //   97: invokevirtual 861	java/io/InputStream:skip	(J)J
    //   100: pop2
    //   101: aload 4
    //   103: astore_3
    //   104: iload_2
    //   105: newarray byte
    //   107: astore 7
    //   109: aload 4
    //   111: astore_3
    //   112: aload 4
    //   114: aload 7
    //   116: iconst_0
    //   117: iload_2
    //   118: invokevirtual 865	java/io/InputStream:read	([BII)I
    //   121: pop
    //   122: aload 4
    //   124: ifnull +8 -> 132
    //   127: aload 4
    //   129: invokevirtual 866	java/io/InputStream:close	()V
    //   132: ldc_w 842
    //   135: invokestatic 352	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   138: aload 7
    //   140: astore_3
    //   141: goto -119 -> 22
    //   144: astore_3
    //   145: ldc_w 575
    //   148: ldc_w 868
    //   151: iconst_1
    //   152: anewarray 579	java/lang/Object
    //   155: dup
    //   156: iconst_0
    //   157: aload_3
    //   158: invokestatic 872	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   161: aastore
    //   162: invokestatic 874	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: goto -33 -> 132
    //   168: astore 7
    //   170: aconst_null
    //   171: astore 4
    //   173: aload 4
    //   175: astore_3
    //   176: ldc_w 575
    //   179: ldc_w 868
    //   182: iconst_1
    //   183: anewarray 579	java/lang/Object
    //   186: dup
    //   187: iconst_0
    //   188: aload 7
    //   190: invokestatic 872	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   193: aastore
    //   194: invokestatic 874	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   197: aload 4
    //   199: ifnull +8 -> 207
    //   202: aload 4
    //   204: invokevirtual 866	java/io/InputStream:close	()V
    //   207: aload_0
    //   208: invokevirtual 694	com/tencent/mm/storage/emotion/EmojiInfo:dve	()Ljava/lang/String;
    //   211: aload_0
    //   212: getfield 437	com/tencent/mm/storage/emotion/EmojiInfo:field_start	I
    //   215: iload_2
    //   216: invokestatic 879	com/tencent/mm/vfs/e:e	(Ljava/lang/String;II)[B
    //   219: astore_3
    //   220: ldc_w 842
    //   223: invokestatic 352	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   226: goto -204 -> 22
    //   229: astore_3
    //   230: ldc_w 575
    //   233: ldc_w 868
    //   236: iconst_1
    //   237: anewarray 579	java/lang/Object
    //   240: dup
    //   241: iconst_0
    //   242: aload_3
    //   243: invokestatic 872	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   246: aastore
    //   247: invokestatic 874	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   250: goto -43 -> 207
    //   253: astore 4
    //   255: aconst_null
    //   256: astore_3
    //   257: aload_3
    //   258: ifnull +7 -> 265
    //   261: aload_3
    //   262: invokevirtual 866	java/io/InputStream:close	()V
    //   265: ldc_w 842
    //   268: invokestatic 352	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   271: aload 4
    //   273: athrow
    //   274: astore_3
    //   275: ldc_w 575
    //   278: ldc_w 868
    //   281: iconst_1
    //   282: anewarray 579	java/lang/Object
    //   285: dup
    //   286: iconst_0
    //   287: aload_3
    //   288: invokestatic 872	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   291: aastore
    //   292: invokestatic 874	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   295: goto -30 -> 265
    //   298: astore 4
    //   300: goto -43 -> 257
    //   303: astore 7
    //   305: goto -132 -> 173
    //
    // Exception table:
    //   from	to	target	type
    //   127	132	144	java/io/IOException
    //   54	86	168	java/io/IOException
    //   202	207	229	java/io/IOException
    //   54	86	253	finally
    //   261	265	274	java/io/IOException
    //   93	101	298	finally
    //   104	109	298	finally
    //   112	122	298	finally
    //   176	197	298	finally
    //   93	101	303	java/io/IOException
    //   104	109	303	java/io/IOException
    //   112	122	303	java/io/IOException
  }

  public final String getContent()
  {
    if (this.field_content == null);
    for (String str = ""; ; str = this.field_content)
      return str;
  }

  public final int getGroup()
  {
    return this.field_catalog;
  }

  public final String getName()
  {
    if (this.field_name == null);
    for (String str = ""; ; str = this.field_name)
      return str;
  }

  public final int getSize()
  {
    return this.field_size;
  }

  public final int getState()
  {
    return this.field_state;
  }

  public final Bitmap hk(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(62773);
      paramContext = hl(paramContext);
      AppMethodBeat.o(62773);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
    }
    throw paramContext;
  }

  // ERROR //
  public final Bitmap hl(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc_w 892
    //   7: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_1
    //   11: bipush 120
    //   13: invokestatic 898	com/tencent/mm/bz/a:fromDPToPix	(Landroid/content/Context;I)I
    //   16: pop
    //   17: aload_0
    //   18: getfield 428	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   21: getstatic 60	com/tencent/mm/storage/emotion/EmojiInfo:yah	I
    //   24: if_icmpeq +39 -> 63
    //   27: aload_0
    //   28: getfield 428	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   31: getstatic 691	com/tencent/mm/storage/emotion/EmojiGroupInfo:yad	I
    //   34: if_icmpeq +29 -> 63
    //   37: aload_0
    //   38: getfield 428	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   41: getstatic 66	com/tencent/mm/storage/emotion/EmojiInfo:yak	I
    //   44: if_icmpeq +19 -> 63
    //   47: aload_0
    //   48: getfield 428	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   51: istore_3
    //   52: getstatic 64	com/tencent/mm/storage/emotion/EmojiInfo:yaj	I
    //   55: istore 4
    //   57: iload_3
    //   58: iload 4
    //   60: if_icmpne +232 -> 292
    //   63: aload_0
    //   64: invokevirtual 847	com/tencent/mm/storage/emotion/EmojiInfo:getName	()Ljava/lang/String;
    //   67: astore 5
    //   69: aload_0
    //   70: getfield 431	com/tencent/mm/storage/emotion/EmojiInfo:field_type	I
    //   73: getstatic 76	com/tencent/mm/storage/emotion/EmojiInfo:yan	I
    //   76: if_icmpne +19 -> 95
    //   79: aload_0
    //   80: invokevirtual 900	com/tencent/mm/storage/emotion/EmojiInfo:getContent	()Ljava/lang/String;
    //   83: invokestatic 567	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   86: ifeq +50 -> 136
    //   89: aload_0
    //   90: invokevirtual 847	com/tencent/mm/storage/emotion/EmojiInfo:getName	()Ljava/lang/String;
    //   93: astore 5
    //   95: aload_1
    //   96: aload 5
    //   98: invokestatic 855	com/tencent/mm/storage/emotion/EmojiInfo:bJ	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   101: astore 5
    //   103: aload 5
    //   105: astore_1
    //   106: aload 5
    //   108: invokestatic 906	com/tencent/mm/sdk/platformtools/d:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   111: astore_2
    //   112: aload_2
    //   113: astore_1
    //   114: aload 5
    //   116: ifnull +10 -> 126
    //   119: aload 5
    //   121: invokevirtual 866	java/io/InputStream:close	()V
    //   124: aload_2
    //   125: astore_1
    //   126: ldc_w 892
    //   129: invokestatic 352	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   132: aload_0
    //   133: monitorexit
    //   134: aload_1
    //   135: areturn
    //   136: aload_0
    //   137: invokevirtual 900	com/tencent/mm/storage/emotion/EmojiInfo:getContent	()Ljava/lang/String;
    //   140: astore 5
    //   142: goto -47 -> 95
    //   145: astore_1
    //   146: ldc_w 575
    //   149: ldc_w 868
    //   152: iconst_1
    //   153: anewarray 579	java/lang/Object
    //   156: dup
    //   157: iconst_0
    //   158: aload_1
    //   159: invokestatic 872	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   162: aastore
    //   163: invokestatic 874	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   166: aload_2
    //   167: astore_1
    //   168: goto -42 -> 126
    //   171: astore_1
    //   172: aload_0
    //   173: monitorexit
    //   174: aload_1
    //   175: athrow
    //   176: astore_2
    //   177: aconst_null
    //   178: astore 5
    //   180: aload 5
    //   182: astore_1
    //   183: ldc_w 575
    //   186: ldc_w 868
    //   189: iconst_1
    //   190: anewarray 579	java/lang/Object
    //   193: dup
    //   194: iconst_0
    //   195: aload_2
    //   196: invokestatic 872	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   199: aastore
    //   200: invokestatic 874	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   203: aload 5
    //   205: ifnull +82 -> 287
    //   208: aload 5
    //   210: invokevirtual 866	java/io/InputStream:close	()V
    //   213: aconst_null
    //   214: astore_1
    //   215: goto -89 -> 126
    //   218: astore_1
    //   219: ldc_w 575
    //   222: ldc_w 868
    //   225: iconst_1
    //   226: anewarray 579	java/lang/Object
    //   229: dup
    //   230: iconst_0
    //   231: aload_1
    //   232: invokestatic 872	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   235: aastore
    //   236: invokestatic 874	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   239: aconst_null
    //   240: astore_1
    //   241: goto -115 -> 126
    //   244: astore_1
    //   245: aload_2
    //   246: ifnull +7 -> 253
    //   249: aload_2
    //   250: invokevirtual 866	java/io/InputStream:close	()V
    //   253: ldc_w 892
    //   256: invokestatic 352	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   259: aload_1
    //   260: athrow
    //   261: astore 5
    //   263: ldc_w 575
    //   266: ldc_w 868
    //   269: iconst_1
    //   270: anewarray 579	java/lang/Object
    //   273: dup
    //   274: iconst_0
    //   275: aload 5
    //   277: invokestatic 872	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   280: aastore
    //   281: invokestatic 874	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   284: goto -31 -> 253
    //   287: aconst_null
    //   288: astore_1
    //   289: goto -163 -> 126
    //   292: aload_0
    //   293: invokevirtual 908	com/tencent/mm/storage/emotion/EmojiInfo:duU	()Z
    //   296: ifeq +156 -> 452
    //   299: aload_0
    //   300: invokevirtual 694	com/tencent/mm/storage/emotion/EmojiInfo:dve	()Ljava/lang/String;
    //   303: astore_1
    //   304: aload_1
    //   305: ifnonnull +887 -> 1192
    //   308: new 123	java/lang/StringBuilder
    //   311: astore_1
    //   312: aload_1
    //   313: invokespecial 124	java/lang/StringBuilder:<init>	()V
    //   316: aload_1
    //   317: aload_0
    //   318: getfield 390	com/tencent/mm/storage/emotion/EmojiInfo:ptQ	Ljava/lang/String;
    //   321: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   324: aload_0
    //   325: getfield 464	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
    //   328: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   331: ldc_w 830
    //   334: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   337: aload_0
    //   338: invokevirtual 675	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
    //   341: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: ldc_w 910
    //   347: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   353: astore_1
    //   354: new 696	com/tencent/mm/vfs/b
    //   357: astore 5
    //   359: aload 5
    //   361: aload_1
    //   362: invokespecial 697	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   365: aload 5
    //   367: astore_1
    //   368: aload_1
    //   369: invokevirtual 700	com/tencent/mm/vfs/b:exists	()Z
    //   372: ifeq +211 -> 583
    //   375: aload_1
    //   376: invokestatic 914	com/tencent/mm/vfs/e:p	(Lcom/tencent/mm/vfs/b;)Ljava/io/InputStream;
    //   379: astore 5
    //   381: aload 5
    //   383: astore_1
    //   384: aload 5
    //   386: astore 6
    //   388: aload 5
    //   390: astore_2
    //   391: aload 5
    //   393: invokestatic 906	com/tencent/mm/sdk/platformtools/d:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   396: astore 7
    //   398: aload 7
    //   400: astore 6
    //   402: aload 5
    //   404: astore 7
    //   406: aload 6
    //   408: astore_1
    //   409: aload 7
    //   411: ifnull -285 -> 126
    //   414: aload 7
    //   416: invokevirtual 866	java/io/InputStream:close	()V
    //   419: aload 6
    //   421: astore_1
    //   422: goto -296 -> 126
    //   425: astore_1
    //   426: ldc_w 575
    //   429: ldc_w 868
    //   432: iconst_1
    //   433: anewarray 579	java/lang/Object
    //   436: dup
    //   437: iconst_0
    //   438: aload_1
    //   439: invokestatic 872	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   442: aastore
    //   443: invokestatic 874	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   446: aload 6
    //   448: astore_1
    //   449: goto -323 -> 126
    //   452: new 123	java/lang/StringBuilder
    //   455: astore_1
    //   456: aload_1
    //   457: invokespecial 124	java/lang/StringBuilder:<init>	()V
    //   460: new 696	com/tencent/mm/vfs/b
    //   463: dup
    //   464: aload_1
    //   465: aload_0
    //   466: getfield 390	com/tencent/mm/storage/emotion/EmojiInfo:ptQ	Ljava/lang/String;
    //   469: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   472: aload_0
    //   473: invokevirtual 675	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
    //   476: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   479: ldc_w 916
    //   482: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   485: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   488: invokespecial 697	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   491: astore_1
    //   492: goto -124 -> 368
    //   495: astore 6
    //   497: aconst_null
    //   498: astore 5
    //   500: aconst_null
    //   501: astore_2
    //   502: aload 5
    //   504: astore_1
    //   505: ldc_w 575
    //   508: ldc_w 868
    //   511: iconst_1
    //   512: anewarray 579	java/lang/Object
    //   515: dup
    //   516: iconst_0
    //   517: aload 6
    //   519: invokestatic 872	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   522: aastore
    //   523: invokestatic 874	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   526: aload 5
    //   528: astore_1
    //   529: ldc_w 575
    //   532: aload 6
    //   534: invokevirtual 917	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   537: invokestatic 662	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   540: aload_2
    //   541: astore_1
    //   542: aload 5
    //   544: ifnull -418 -> 126
    //   547: aload 5
    //   549: invokevirtual 866	java/io/InputStream:close	()V
    //   552: aload_2
    //   553: astore_1
    //   554: goto -428 -> 126
    //   557: astore_1
    //   558: ldc_w 575
    //   561: ldc_w 868
    //   564: iconst_1
    //   565: anewarray 579	java/lang/Object
    //   568: dup
    //   569: iconst_0
    //   570: aload_1
    //   571: invokestatic 872	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   574: aastore
    //   575: invokestatic 874	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   578: aload_2
    //   579: astore_1
    //   580: goto -454 -> 126
    //   583: aload_0
    //   584: invokevirtual 908	com/tencent/mm/storage/emotion/EmojiInfo:duU	()Z
    //   587: ifeq +292 -> 879
    //   590: getstatic 922	android/os/Build$VERSION:SDK_INT	I
    //   593: bipush 19
    //   595: if_icmpge +589 -> 1184
    //   598: new 123	java/lang/StringBuilder
    //   601: astore_1
    //   602: aload_1
    //   603: invokespecial 124	java/lang/StringBuilder:<init>	()V
    //   606: aload_1
    //   607: aload_0
    //   608: getfield 390	com/tencent/mm/storage/emotion/EmojiInfo:ptQ	Ljava/lang/String;
    //   611: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   614: aload_0
    //   615: getfield 464	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
    //   618: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   621: ldc_w 830
    //   624: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   627: aload_0
    //   628: invokevirtual 675	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
    //   631: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   634: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   637: invokestatic 926	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   640: astore 5
    //   642: aload 5
    //   644: astore_1
    //   645: aload 5
    //   647: astore 6
    //   649: aload 5
    //   651: astore_2
    //   652: aload 5
    //   654: invokestatic 906	com/tencent/mm/sdk/platformtools/d:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   657: astore 7
    //   659: aload 7
    //   661: astore_2
    //   662: aload 5
    //   664: astore_1
    //   665: aload_0
    //   666: invokevirtual 908	com/tencent/mm/storage/emotion/EmojiInfo:duU	()Z
    //   669: ifeq +264 -> 933
    //   672: aload 5
    //   674: astore_1
    //   675: ldc_w 575
    //   678: ldc_w 928
    //   681: invokestatic 930	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   684: aload 5
    //   686: astore_1
    //   687: new 696	com/tencent/mm/vfs/b
    //   690: astore 8
    //   692: aload 5
    //   694: astore_1
    //   695: new 123	java/lang/StringBuilder
    //   698: astore 6
    //   700: aload 5
    //   702: astore_1
    //   703: aload 6
    //   705: invokespecial 124	java/lang/StringBuilder:<init>	()V
    //   708: aload 5
    //   710: astore_1
    //   711: aload 8
    //   713: aload 6
    //   715: aload_0
    //   716: getfield 390	com/tencent/mm/storage/emotion/EmojiInfo:ptQ	Ljava/lang/String;
    //   719: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   722: aload_0
    //   723: getfield 464	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
    //   726: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   729: ldc_w 830
    //   732: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   735: aload_0
    //   736: invokevirtual 675	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
    //   739: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   742: ldc_w 834
    //   745: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   748: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   751: invokespecial 697	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   754: aload 5
    //   756: astore 7
    //   758: aload_2
    //   759: astore 6
    //   761: aload 5
    //   763: astore_1
    //   764: aload 8
    //   766: invokevirtual 700	com/tencent/mm/vfs/b:exists	()Z
    //   769: ifne -363 -> 406
    //   772: aload 5
    //   774: astore 7
    //   776: aload_2
    //   777: astore 6
    //   779: aload 5
    //   781: astore_1
    //   782: getstatic 922	android/os/Build$VERSION:SDK_INT	I
    //   785: bipush 19
    //   787: if_icmpge -381 -> 406
    //   790: aload 5
    //   792: astore_1
    //   793: getstatic 936	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   796: astore 7
    //   798: aload 5
    //   800: astore_1
    //   801: new 123	java/lang/StringBuilder
    //   804: astore 6
    //   806: aload 5
    //   808: astore_1
    //   809: aload 6
    //   811: invokespecial 124	java/lang/StringBuilder:<init>	()V
    //   814: aload 5
    //   816: astore_1
    //   817: aload_2
    //   818: bipush 100
    //   820: aload 7
    //   822: aload 6
    //   824: aload_0
    //   825: getfield 390	com/tencent/mm/storage/emotion/EmojiInfo:ptQ	Ljava/lang/String;
    //   828: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   831: aload_0
    //   832: getfield 464	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
    //   835: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   838: ldc_w 830
    //   841: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   844: aload_0
    //   845: invokevirtual 675	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
    //   848: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   851: ldc_w 834
    //   854: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   857: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   860: iconst_0
    //   861: invokestatic 939	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   864: aload 5
    //   866: astore 7
    //   868: aload_2
    //   869: astore 6
    //   871: goto -465 -> 406
    //   874: astore 6
    //   876: goto -374 -> 502
    //   879: new 123	java/lang/StringBuilder
    //   882: astore_1
    //   883: aload_1
    //   884: invokespecial 124	java/lang/StringBuilder:<init>	()V
    //   887: aload_1
    //   888: aload_0
    //   889: getfield 390	com/tencent/mm/storage/emotion/EmojiInfo:ptQ	Ljava/lang/String;
    //   892: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   895: aload_0
    //   896: invokevirtual 675	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
    //   899: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   902: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   905: invokestatic 926	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   908: astore 5
    //   910: aload 5
    //   912: astore_1
    //   913: aload 5
    //   915: astore 6
    //   917: aload 5
    //   919: astore_2
    //   920: aload 5
    //   922: invokestatic 906	com/tencent/mm/sdk/platformtools/d:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   925: astore 7
    //   927: aload 7
    //   929: astore_2
    //   930: goto -268 -> 662
    //   933: aload 5
    //   935: astore_1
    //   936: getstatic 936	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   939: astore 6
    //   941: aload 5
    //   943: astore_1
    //   944: new 123	java/lang/StringBuilder
    //   947: astore 7
    //   949: aload 5
    //   951: astore_1
    //   952: aload 7
    //   954: invokespecial 124	java/lang/StringBuilder:<init>	()V
    //   957: aload 5
    //   959: astore_1
    //   960: aload_2
    //   961: bipush 100
    //   963: aload 6
    //   965: aload 7
    //   967: aload_0
    //   968: getfield 390	com/tencent/mm/storage/emotion/EmojiInfo:ptQ	Ljava/lang/String;
    //   971: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   974: aload_0
    //   975: invokevirtual 675	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
    //   978: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   981: ldc_w 916
    //   984: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   987: invokevirtual 339	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   990: iconst_0
    //   991: invokestatic 939	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   994: aload 5
    //   996: astore 7
    //   998: aload_2
    //   999: astore 6
    //   1001: goto -595 -> 406
    //   1004: astore 7
    //   1006: aload 5
    //   1008: astore_1
    //   1009: ldc_w 575
    //   1012: ldc_w 868
    //   1015: iconst_1
    //   1016: anewarray 579	java/lang/Object
    //   1019: dup
    //   1020: iconst_0
    //   1021: aload 7
    //   1023: invokestatic 872	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1026: aastore
    //   1027: invokestatic 874	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1030: aload 5
    //   1032: astore_1
    //   1033: ldc_w 575
    //   1036: aload 7
    //   1038: invokevirtual 611	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1041: invokestatic 662	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1044: aload_2
    //   1045: astore_1
    //   1046: aload 5
    //   1048: ifnull -922 -> 126
    //   1051: aload 5
    //   1053: invokevirtual 866	java/io/InputStream:close	()V
    //   1056: aload_2
    //   1057: astore_1
    //   1058: goto -932 -> 126
    //   1061: astore_1
    //   1062: ldc_w 575
    //   1065: ldc_w 868
    //   1068: iconst_1
    //   1069: anewarray 579	java/lang/Object
    //   1072: dup
    //   1073: iconst_0
    //   1074: aload_1
    //   1075: invokestatic 872	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1078: aastore
    //   1079: invokestatic 874	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1082: aload_2
    //   1083: astore_1
    //   1084: goto -958 -> 126
    //   1087: astore 5
    //   1089: aconst_null
    //   1090: astore_1
    //   1091: aload_1
    //   1092: ifnull +7 -> 1099
    //   1095: aload_1
    //   1096: invokevirtual 866	java/io/InputStream:close	()V
    //   1099: ldc_w 892
    //   1102: invokestatic 352	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1105: aload 5
    //   1107: athrow
    //   1108: astore_1
    //   1109: ldc_w 575
    //   1112: ldc_w 868
    //   1115: iconst_1
    //   1116: anewarray 579	java/lang/Object
    //   1119: dup
    //   1120: iconst_0
    //   1121: aload_1
    //   1122: invokestatic 872	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1125: aastore
    //   1126: invokestatic 874	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1129: goto -30 -> 1099
    //   1132: astore 5
    //   1134: goto -43 -> 1091
    //   1137: astore 7
    //   1139: aconst_null
    //   1140: astore 5
    //   1142: aconst_null
    //   1143: astore_2
    //   1144: goto -138 -> 1006
    //   1147: astore 7
    //   1149: aconst_null
    //   1150: astore_2
    //   1151: aload 6
    //   1153: astore 5
    //   1155: goto -149 -> 1006
    //   1158: astore 6
    //   1160: aconst_null
    //   1161: astore_1
    //   1162: aload_2
    //   1163: astore 5
    //   1165: aload_1
    //   1166: astore_2
    //   1167: goto -665 -> 502
    //   1170: astore 5
    //   1172: aload_1
    //   1173: astore_2
    //   1174: aload 5
    //   1176: astore_1
    //   1177: goto -932 -> 245
    //   1180: astore_2
    //   1181: goto -1001 -> 180
    //   1184: aconst_null
    //   1185: astore 5
    //   1187: aconst_null
    //   1188: astore_2
    //   1189: goto -527 -> 662
    //   1192: goto -838 -> 354
    //
    // Exception table:
    //   from	to	target	type
    //   119	124	145	java/io/IOException
    //   4	57	171	finally
    //   119	124	171	finally
    //   126	132	171	finally
    //   146	166	171	finally
    //   208	213	171	finally
    //   219	239	171	finally
    //   249	253	171	finally
    //   253	261	171	finally
    //   263	284	171	finally
    //   414	419	171	finally
    //   426	446	171	finally
    //   547	552	171	finally
    //   558	578	171	finally
    //   1051	1056	171	finally
    //   1062	1082	171	finally
    //   1095	1099	171	finally
    //   1099	1108	171	finally
    //   1109	1129	171	finally
    //   63	69	176	java/lang/Exception
    //   69	95	176	java/lang/Exception
    //   95	103	176	java/lang/Exception
    //   136	142	176	java/lang/Exception
    //   208	213	218	java/io/IOException
    //   63	69	244	finally
    //   69	95	244	finally
    //   95	103	244	finally
    //   136	142	244	finally
    //   249	253	261	java/io/IOException
    //   414	419	425	java/io/IOException
    //   292	304	495	java/io/FileNotFoundException
    //   308	354	495	java/io/FileNotFoundException
    //   354	365	495	java/io/FileNotFoundException
    //   368	381	495	java/io/FileNotFoundException
    //   452	492	495	java/io/FileNotFoundException
    //   583	642	495	java/io/FileNotFoundException
    //   879	910	495	java/io/FileNotFoundException
    //   547	552	557	java/io/IOException
    //   665	672	874	java/io/FileNotFoundException
    //   675	684	874	java/io/FileNotFoundException
    //   687	692	874	java/io/FileNotFoundException
    //   695	700	874	java/io/FileNotFoundException
    //   703	708	874	java/io/FileNotFoundException
    //   711	754	874	java/io/FileNotFoundException
    //   764	772	874	java/io/FileNotFoundException
    //   782	790	874	java/io/FileNotFoundException
    //   793	798	874	java/io/FileNotFoundException
    //   801	806	874	java/io/FileNotFoundException
    //   809	814	874	java/io/FileNotFoundException
    //   817	864	874	java/io/FileNotFoundException
    //   936	941	874	java/io/FileNotFoundException
    //   944	949	874	java/io/FileNotFoundException
    //   952	957	874	java/io/FileNotFoundException
    //   960	994	874	java/io/FileNotFoundException
    //   665	672	1004	java/lang/Exception
    //   675	684	1004	java/lang/Exception
    //   687	692	1004	java/lang/Exception
    //   695	700	1004	java/lang/Exception
    //   703	708	1004	java/lang/Exception
    //   711	754	1004	java/lang/Exception
    //   764	772	1004	java/lang/Exception
    //   782	790	1004	java/lang/Exception
    //   793	798	1004	java/lang/Exception
    //   801	806	1004	java/lang/Exception
    //   809	814	1004	java/lang/Exception
    //   817	864	1004	java/lang/Exception
    //   936	941	1004	java/lang/Exception
    //   944	949	1004	java/lang/Exception
    //   952	957	1004	java/lang/Exception
    //   960	994	1004	java/lang/Exception
    //   1051	1056	1061	java/io/IOException
    //   292	304	1087	finally
    //   308	354	1087	finally
    //   354	365	1087	finally
    //   368	381	1087	finally
    //   452	492	1087	finally
    //   583	642	1087	finally
    //   879	910	1087	finally
    //   1095	1099	1108	java/io/IOException
    //   391	398	1132	finally
    //   505	526	1132	finally
    //   529	540	1132	finally
    //   652	659	1132	finally
    //   665	672	1132	finally
    //   675	684	1132	finally
    //   687	692	1132	finally
    //   695	700	1132	finally
    //   703	708	1132	finally
    //   711	754	1132	finally
    //   764	772	1132	finally
    //   782	790	1132	finally
    //   793	798	1132	finally
    //   801	806	1132	finally
    //   809	814	1132	finally
    //   817	864	1132	finally
    //   920	927	1132	finally
    //   936	941	1132	finally
    //   944	949	1132	finally
    //   952	957	1132	finally
    //   960	994	1132	finally
    //   1009	1030	1132	finally
    //   1033	1044	1132	finally
    //   292	304	1137	java/lang/Exception
    //   308	354	1137	java/lang/Exception
    //   354	365	1137	java/lang/Exception
    //   368	381	1137	java/lang/Exception
    //   452	492	1137	java/lang/Exception
    //   583	642	1137	java/lang/Exception
    //   879	910	1137	java/lang/Exception
    //   391	398	1147	java/lang/Exception
    //   652	659	1147	java/lang/Exception
    //   920	927	1147	java/lang/Exception
    //   391	398	1158	java/io/FileNotFoundException
    //   652	659	1158	java/io/FileNotFoundException
    //   920	927	1158	java/io/FileNotFoundException
    //   106	112	1170	finally
    //   183	203	1170	finally
    //   106	112	1180	java/lang/Exception
  }

  public final boolean isGif()
  {
    if ((this.field_type == yan) || (this.field_type == yap));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void reset()
  {
    AppMethodBeat.i(62767);
    this.field_md5 = "";
    this.field_svrid = "";
    this.field_catalog = yah;
    this.field_type = yam;
    this.field_size = 0;
    this.field_start = 0;
    this.field_state = yar;
    this.field_name = "";
    this.field_content = "";
    this.field_reserved1 = "";
    this.field_reserved2 = "";
    this.field_reserved3 = 0;
    this.field_reserved4 = 0;
    this.field_app_id = "";
    this.field_temp = 0;
    this.field_captureStatus = EmojiInfo.a.yaC.ordinal();
    this.field_captureUploadErrCode = EmojiInfo.b.yaI.ordinal();
    this.field_captureUploadCounter = 0;
    this.field_imitateMd5 = "";
    this.field_attachedEmojiMD5 = new byte[0];
    AppMethodBeat.o(62767);
  }

  public final void setSize(int paramInt)
  {
    this.field_size = paramInt;
  }

  public final void setState(int paramInt)
  {
    this.field_state = paramInt;
  }

  public final void setType(int paramInt)
  {
    this.field_type = paramInt;
  }

  public String toString()
  {
    AppMethodBeat.i(62789);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("field_md5:").append(this.field_md5).append("\n");
    ((StringBuilder)localObject).append("field_svrid:").append(this.field_svrid).append("\n");
    ((StringBuilder)localObject).append("field_catalog:").append(this.field_catalog).append("\n");
    ((StringBuilder)localObject).append("field_type:").append(this.field_type).append("\n");
    ((StringBuilder)localObject).append("field_size:").append(this.field_size).append("\n");
    ((StringBuilder)localObject).append("field_start:").append(this.field_start).append("\n");
    ((StringBuilder)localObject).append("field_state:").append(this.field_state).append("\n");
    ((StringBuilder)localObject).append("field_name:").append(this.field_name).append("\n");
    ((StringBuilder)localObject).append("field_content:").append(this.field_content).append("\n");
    ((StringBuilder)localObject).append("field_reserved1:").append(this.field_reserved1).append("\n");
    ((StringBuilder)localObject).append("field_reserved2:").append(this.field_reserved2).append("\n");
    ((StringBuilder)localObject).append("field_reserved3:").append(this.field_reserved3).append("\n");
    ((StringBuilder)localObject).append("field_reserved4:").append(this.field_reserved4).append("\n");
    ((StringBuilder)localObject).append("field_app_id:").append(this.field_app_id).append("\n");
    ((StringBuilder)localObject).append("field_groupId:").append(this.field_groupId).append("\n");
    ((StringBuilder)localObject).append("field_lastUseTime:").append(this.field_lastUseTime).append("\n");
    ((StringBuilder)localObject).append("field_framesInfo:").append(this.field_framesInfo).append("\n");
    ((StringBuilder)localObject).append("field_idx:").append(this.field_idx).append("\n");
    ((StringBuilder)localObject).append("field_temp:").append(this.field_temp).append("\n");
    ((StringBuilder)localObject).append("field_source:").append(this.field_source).append("\n");
    ((StringBuilder)localObject).append("field_needupload:").append(this.field_needupload).append("\n");
    ((StringBuilder)localObject).append("field_designerID:").append(this.field_designerID).append("\n");
    ((StringBuilder)localObject).append("field_thumbUrl:").append(this.field_thumbUrl).append("\n");
    ((StringBuilder)localObject).append("field_captureStatus:").append(this.field_captureStatus).append("\n");
    ((StringBuilder)localObject).append("field_captureUploadErrCode").append(this.field_captureUploadErrCode).append("\n");
    ((StringBuilder)localObject).append("field_captureUploadCounter").append(this.field_captureUploadCounter).append("\n");
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(62789);
    return localObject;
  }

  public final void vS(String paramString)
  {
    this.field_md5 = paramString;
  }

  public final Bitmap w(Context paramContext, int paramInt)
  {
    int i = 0;
    while (true)
    {
      try
      {
        AppMethodBeat.i(62774);
        if ((this.field_catalog == EmojiGroupInfo.yad) || (this.field_catalog == yak) || (this.field_catalog == yaj))
        {
          localObject = getName();
          if (!bo.isNullOrNil((String)localObject))
          {
            if (((String)localObject).startsWith("jsb"))
            {
              localObject = "jsb";
              paramInt = paramContext.getResources().getIdentifier((String)localObject, "drawable", ah.getPackageName());
              paramContext = com.tencent.mm.sdk.platformtools.d.v(paramContext.getResources().getDrawable(paramInt));
              ab.i("MicroMsg.emoji.EmojiInfo", "id:%s width:%s height:%s", new Object[] { Integer.valueOf(this.field_catalog), Integer.valueOf(paramContext.getWidth()), Integer.valueOf(paramContext.getHeight()) });
              AppMethodBeat.o(62774);
              return paramContext;
            }
            if (((String)localObject).startsWith("dice"))
            {
              localObject = "dice";
              continue;
            }
            localObject = ((String)localObject).replaceAll(".png", "");
            continue;
          }
          ab.i("MicroMsg.emoji.EmojiInfo", "name is null");
          ab.i("MicroMsg.emoji.EmojiInfo", "emoji:%s", new Object[] { this });
          paramContext = null;
          AppMethodBeat.o(62774);
          continue;
        }
      }
      finally
      {
      }
      if (this.field_catalog == EmojiGroupInfo.yac)
      {
        localObject = getName();
        if (!bo.isNullOrNil((String)localObject))
          if (bo.isNullOrNil(getContent()))
          {
            localObject = getName();
            label268: localObject = ((String)localObject).replaceAll(".png", "");
          }
        while (true)
        {
          ab.i("MicroMsg.emoji.EmojiInfo", "[addEmoji] drawable name:%s", new Object[] { localObject });
          paramInt = paramContext.getResources().getIdentifier((String)localObject, "drawable", ah.getPackageName());
          paramContext = com.tencent.mm.sdk.platformtools.d.v(paramContext.getResources().getDrawable(paramInt));
          ab.i("MicroMsg.emoji.EmojiInfo", "id:%s width:%s height:%s", new Object[] { Integer.valueOf(this.field_catalog), Integer.valueOf(paramContext.getWidth()), Integer.valueOf(paramContext.getHeight()) });
          AppMethodBeat.o(62774);
          break;
          localObject = getContent();
          break label268;
          ab.i("MicroMsg.emoji.EmojiInfo", "name is null");
        }
      }
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>();
      paramContext = dve() + "_cover";
      boolean bool = com.tencent.mm.vfs.e.ct(paramContext);
      ab.i("MicroMsg.emoji.EmojiInfo", "[addEmoji] thumbPath:%s isExist:%s", new Object[] { paramContext, Boolean.valueOf(bool) });
      if (bool)
        break;
      paramContext = dve();
      bool = com.tencent.mm.vfs.e.ct(paramContext);
      if (bool)
      {
        paramContext = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().l(this);
        if (paramContext == null)
        {
          ab.e("MicroMsg.emoji.EmojiInfo", "bytes is null!");
          paramContext = null;
          AppMethodBeat.o(62774);
        }
        else
        {
          ab.i("MicroMsg.emoji.EmojiInfo", "bytes size:%s", new Object[] { Integer.valueOf(paramContext.length) });
          if (r.bU(paramContext));
          for (paramContext = i.aW(paramContext); ; paramContext = com.tencent.mm.sdk.platformtools.d.decodeByteArray(paramContext, paramInt, paramInt))
          {
            if (paramContext != null)
              ab.i("MicroMsg.emoji.EmojiInfo", "emoji:%s width:%s height:%s", new Object[] { this, Integer.valueOf(paramContext.getWidth()), Integer.valueOf(paramContext.getHeight()) });
            AppMethodBeat.o(62774);
            break;
          }
        }
      }
      else
      {
        ab.w("MicroMsg.emoji.EmojiInfo", "[addEmoji] Path:%s isExist:%s", new Object[] { paramContext, Boolean.valueOf(bool) });
      }
    }
    Object localObject = new android/graphics/BitmapFactory$Options;
    ((BitmapFactory.Options)localObject).<init>();
    ((BitmapFactory.Options)localObject).inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramContext, (BitmapFactory.Options)localObject);
    label700: int j;
    if ((((BitmapFactory.Options)localObject).outHeight < paramInt) && (((BitmapFactory.Options)localObject).outWidth < paramInt))
    {
      paramContext = com.tencent.mm.sdk.platformtools.d.ao(paramContext, ((BitmapFactory.Options)localObject).outHeight, ((BitmapFactory.Options)localObject).outWidth);
      j = this.field_catalog;
      if (paramContext != null)
        break label770;
      paramInt = 0;
      label712: if (paramContext != null)
        break label778;
    }
    while (true)
    {
      ab.i("MicroMsg.emoji.EmojiInfo", "id:%s width:%s height:%s", new Object[] { Integer.valueOf(j), Integer.valueOf(paramInt), Integer.valueOf(i) });
      AppMethodBeat.o(62774);
      break;
      paramContext = com.tencent.mm.sdk.platformtools.d.ao(paramContext, paramInt, paramInt);
      break label700;
      label770: paramInt = paramContext.getWidth();
      break label712;
      label778: i = paramContext.getHeight();
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(62790);
    paramParcel.writeString(this.ptQ);
    paramParcel.writeString(this.field_md5);
    paramParcel.writeString(this.field_svrid);
    paramParcel.writeInt(this.field_catalog);
    paramParcel.writeInt(this.field_type);
    paramParcel.writeInt(this.field_size);
    paramParcel.writeInt(this.field_start);
    paramParcel.writeInt(this.field_state);
    paramParcel.writeString(this.field_name);
    paramParcel.writeString(this.field_content);
    paramParcel.writeString(this.field_reserved1);
    paramParcel.writeString(this.field_reserved2);
    paramParcel.writeInt(this.field_reserved3);
    paramParcel.writeInt(this.field_reserved4);
    paramParcel.writeString(this.field_app_id);
    paramParcel.writeString(this.field_groupId);
    paramParcel.writeLong(this.field_lastUseTime);
    paramParcel.writeString(this.field_framesInfo);
    paramParcel.writeInt(this.field_idx);
    paramParcel.writeInt(this.field_temp);
    paramParcel.writeInt(this.field_source);
    paramParcel.writeInt(this.field_needupload);
    paramParcel.writeString(this.field_designerID);
    paramParcel.writeString(this.field_thumbUrl);
    paramParcel.writeString(this.field_cdnUrl);
    paramParcel.writeString(this.field_encrypturl);
    paramParcel.writeString(this.field_aeskey);
    paramParcel.writeInt(this.field_width);
    paramParcel.writeInt(this.field_height);
    paramParcel.writeString(this.field_activityid);
    paramParcel.writeLong(this.xDa);
    paramParcel.writeString(this.field_wxamMd5);
    paramParcel.writeString(this.field_attachedText);
    paramParcel.writeInt(this.field_captureStatus);
    if ((this.field_attachedEmojiMD5 != null) && (this.field_attachedEmojiMD5.length > 0))
    {
      paramParcel.writeInt(this.field_attachedEmojiMD5.length);
      paramParcel.writeByteArray(this.field_attachedEmojiMD5);
    }
    while (true)
    {
      paramParcel.writeString(this.field_imitateMd5);
      paramParcel.writeInt(this.field_captureUploadErrCode);
      paramParcel.writeInt(this.field_captureUploadCounter);
      paramParcel.writeLong(this.field_captureEnterTime);
      paramParcel.writeString(this.field_lensId);
      paramParcel.writeString(this.field_attachTextColor);
      paramParcel.writeInt(this.field_captureScene);
      AppMethodBeat.o(62790);
      return;
      paramParcel.writeInt(0);
    }
  }

  public final boolean xy()
  {
    if ((this.field_catalog == yak) || (this.field_catalog == yaj));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.EmojiInfo
 * JD-Core Version:    0.6.2
 */