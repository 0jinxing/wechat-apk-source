package oicq.wlogin_sdk.request;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.SecureRandom;
import oicq.wlogin_sdk.sharemem.WloginSigInfo;
import oicq.wlogin_sdk.tools.util;

public final class b
{
  public i BTY;
  private j BTZ;
  private f BUa;
  private g BUb;
  private h BUc;
  private e BUd;
  public d BUe;
  private int BUf;
  private int BUg;
  private Context mContext;

  public b(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(96408);
    this.BTY = new i();
    this.BTZ = new j(this.BTY);
    this.BUa = new f(this.BTY);
    this.BUb = new g(this.BTY);
    this.BUc = new h(this.BTY);
    this.BUd = new e(this.BTY);
    this.BUe = null;
    this.mContext = null;
    this.BUf = 66560;
    this.BUg = 1404;
    this.mContext = paramContext;
    i locali = this.BTY;
    locali._context = paramContext;
    locali.BUM = paramInt;
    locali.BVg = new c(paramContext);
    paramContext = new byte[16];
    locali.BUD.nextBytes(paramContext);
    System.arraycopy(paramContext, 0, locali.BUG, 0, 16);
    emA();
    AppMethodBeat.o(96408);
  }

  private int emA()
  {
    AppMethodBeat.i(96413);
    while (true)
    {
      try
      {
        Object localObject1 = util.jQ(this.mContext);
        if ((localObject1 == null) || (localObject1.length <= 0))
        {
          localObject1 = util.jJ(this.mContext);
          if ((localObject1 == null) || (localObject1.length <= 0))
          {
            localObject1 = new java/lang/String;
            ((String)localObject1).<init>("%4;7t>;28<fc.5*6");
            localObject1 = ((String)localObject1).getBytes();
            this.BTY.BUZ = 0;
            util.b(this.mContext, (byte[])localObject1);
            this.BTY.BUY = 1;
            this.BTY.BVa = 1;
            this.BTY.BUN = new byte[localObject1.length];
            System.arraycopy(localObject1, 0, this.BTY.BUN, 0, localObject1.length);
            Object localObject3 = new byte[localObject1.length + 1];
            localObject3[0] = ((byte)35);
            System.arraycopy(localObject1, 0, localObject3, 1, localObject1.length);
            this.BTY.BUE = util.cN((byte[])localObject3);
            i.BUO = (byte[])this.BTY.BUN.clone();
            this.BTY.BUP = util.jK(this.mContext);
            i = util.jM(this.mContext);
            this.BTY.BUQ = util.jL(this.mContext);
            if (i != this.BTY.BUQ)
            {
              util.jN(this.mContext);
              util.aF(this.mContext, this.BTY.BUQ);
            }
            this.BTY.BUS = util.jO(this.mContext).getBytes();
            this.BTY.BVb = util.jP(this.mContext);
            this.BTY.BUR = util.jR(this.mContext);
            localObject3 = this.BTY;
            Context localContext = this.mContext;
            localObject1 = new java/lang/String;
            ((String)localObject1).<init>(this.BTY.BUR);
            ((i)localObject3).BUU = util.cl(localContext, (String)localObject1);
            localObject3 = this.BTY;
            localContext = this.mContext;
            localObject1 = new java/lang/String;
            ((String)localObject1).<init>(this.BTY.BUR);
            ((i)localObject3).BUV = util.cm(localContext, (String)localObject1);
            localObject1 = Build.MODEL;
            if (localObject1 != null)
              break label513;
            this.BTY.BUW = new byte[0];
            if ((util.isFileExist("/system/bin/su")) || (util.isFileExist("/system/xbin/su")) || (util.isFileExist("/sbin/su")))
              break label527;
            i = 0;
            localObject1 = this.BTY;
            if (i == 0)
              break label532;
            i = 1;
            ((i)localObject1).BUX = i;
            localObject3 = Build.VERSION.RELEASE;
            localObject1 = localObject3;
            if (localObject3 == null)
              localObject1 = "";
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>("WtloginHelper init ok: android version:");
            util.awF((String)localObject1 + " release time:" + util.emR());
            return 0;
          }
          this.BTY.BUZ = 1;
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(96413);
      }
      this.BTY.BUZ = 1;
      this.BTY.BUY = 0;
      this.BTY.BVa = 0;
      continue;
      label513: this.BTY.BUW = localObject2.getBytes();
      continue;
      label527: int i = 1;
      continue;
      label532: i = 0;
    }
  }

  public final byte[] a(long paramLong, a parama, String paramString)
  {
    AppMethodBeat.i(96409);
    util.awF("wtlogin login with GetStWithPasswd:user:" + paramLong + " appid:522017402 dwSigMap:8256 ...");
    Object localObject = paramString;
    if (paramString.length() > 16)
      localObject = paramString.substring(0, 16);
    try
    {
      int i;
      switch (emB()[parama.ordinal()])
      {
      default:
        AppMethodBeat.o(96409);
      case 1:
        for (parama = null; ; parama = null)
        {
          return parama;
          if ((localObject != null) && (((String)localObject).length() != 0))
            break;
          util.awF("USER_WITH_PWD userPasswd null");
          AppMethodBeat.o(96409);
        }
        parama = oicq.wlogin_sdk.tools.c.awD((String)localObject);
        i = 0;
        label145: this.BTY.BUQ = util.jL(this.mContext);
        this.BTY.BUS = util.jO(this.mContext).getBytes();
        this.BTY._uin = paramLong;
        this.BTY.BUJ = 522017402L;
        this.BTY.BUK = 8256;
        paramString = this.BTY;
        localObject = new oicq/wlogin_sdk/a/f;
        ((oicq.wlogin_sdk.a.f)localObject).<init>();
        paramString.BUH = ((oicq.wlogin_sdk.a.f)localObject);
        this.BUe = this.BTZ;
        if (i == 0)
          break;
      case 2:
      case 3:
      }
      for (parama = this.BTZ.a(paramLong, this.BTY.BVe, parama, this.BUg, this.BUf, this.BTY.BVb); ; parama = this.BTZ.a(paramLong, this.BTY.BVe, paramString, parama, this.BUg, this.BUf, this.BTY.BVb))
      {
        while (true)
        {
          util.awF("wtlogin login with GetStWithPasswd:user:" + paramLong + " appid:522017402 dwSigMap:8256 end");
          AppMethodBeat.o(96409);
          break;
          if ((localObject == null) || (((String)localObject).length() == 0))
          {
            util.awF("USER_WITH_MD5 userPasswd null");
            AppMethodBeat.o(96409);
            parama = null;
            break;
          }
          try
          {
            parama = (byte[])((String)localObject).getBytes("ISO-8859-1").clone();
            i = 0;
          }
          catch (Exception parama)
          {
            AppMethodBeat.o(96409);
            parama = null;
          }
        }
        break;
        parama = this.BTY.og(paramLong);
        if ((parama == null) || (parama._en_A1 == null) || (parama._en_A1.length <= 0))
        {
          parama = new java/lang/StringBuilder;
          parama.<init>("userAccount:");
          util.awF(paramLong + " appid:522017402 GetA1ByAccount return: null");
        }
        for (parama = null; ; parama = (byte[])parama._en_A1.clone())
        {
          if ((parama != null) && (parama.length >= 16))
            break label509;
          util.awF("USER_WITH_A1 tmp_pwd null");
          AppMethodBeat.o(96409);
          parama = null;
          break;
          paramString = new java/lang/StringBuilder;
          paramString.<init>("userAccount:");
          util.awF(paramLong + " appid:522017402 GetA1ByAccount return: not null");
        }
        label509: i = 1;
        break label145;
        paramString = new byte[4];
        util.d(paramString, 0, i.emE());
      }
    }
    finally
    {
      AppMethodBeat.o(96409);
    }
    throw parama;
  }

  public final byte[] f(long paramLong, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96410);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(96410);
    }
    while (true)
    {
      return paramArrayOfByte;
      util.awF("user:" + paramLong + " CheckPicture ...");
      try
      {
        this.BUe = this.BUb;
        paramArrayOfByte = this.BUb.cF(paramArrayOfByte);
        util.awF("user:" + paramLong + " CheckPicture end");
        AppMethodBeat.o(96410);
      }
      finally
      {
        AppMethodBeat.o(96410);
      }
    }
    throw paramArrayOfByte;
  }

  public final byte[] od(long paramLong)
  {
    AppMethodBeat.i(96411);
    try
    {
      oicq.wlogin_sdk.a.g localg = this.BTY.BUI;
      byte[] arrayOfByte = new byte[localg.BVt];
      if (localg.BVt <= 0);
      while (true)
      {
        util.awF("user:" + paramLong + " GetPicture data len:" + arrayOfByte.length);
        AppMethodBeat.o(96411);
        return arrayOfByte;
        System.arraycopy(localg.BUt, localg.BVv, arrayOfByte, 0, localg.BVt);
      }
    }
    finally
    {
      AppMethodBeat.o(96411);
    }
  }

  public final void oe(long paramLong)
  {
    AppMethodBeat.i(96412);
    util.awF("user:" + paramLong + " ClearUserSigInfo");
    this.BTY.i(Long.valueOf(paramLong));
    AppMethodBeat.o(96412);
  }

  public static enum a
  {
    static
    {
      AppMethodBeat.i(96405);
      BUi = new a("USER_WITH_PWD", 0);
      BUj = new a("USER_WITH_MD5", 1);
      BUk = new a("USER_WITH_A1", 2);
      BUl = new a[] { BUi, BUj, BUk };
      AppMethodBeat.o(96405);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.request.b
 * JD-Core Version:    0.6.2
 */