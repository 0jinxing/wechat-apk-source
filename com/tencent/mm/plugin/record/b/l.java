package com.tencent.mm.plugin.record.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.SystemClock;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.memory.a.b;
import com.tencent.mm.platformtools.v;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;

public class l
{
  private HashMap<String, String[]> mko;
  protected com.tencent.mm.a.f<String, Bitmap> mkq;
  protected com.tencent.mm.pluginsdk.ui.tools.f pJN;
  private HashSet<String> pJO;
  private HashMap<String, g.a> pJP;

  public l()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 23	java/lang/Object:<init>	()V
    //   4: sipush 24169
    //   7: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: new 6	com/tencent/mm/plugin/record/b/l$1
    //   14: dup
    //   15: aload_0
    //   16: invokespecial 32	com/tencent/mm/plugin/record/b/l$1:<init>	(Lcom/tencent/mm/plugin/record/b/l;)V
    //   19: putfield 34	com/tencent/mm/plugin/record/b/l:pJN	Lcom/tencent/mm/pluginsdk/ui/tools/f;
    //   22: aload_0
    //   23: new 36	java/util/HashMap
    //   26: dup
    //   27: invokespecial 37	java/util/HashMap:<init>	()V
    //   30: putfield 39	com/tencent/mm/plugin/record/b/l:mko	Ljava/util/HashMap;
    //   33: aload_0
    //   34: new 41	java/util/HashSet
    //   37: dup
    //   38: invokespecial 42	java/util/HashSet:<init>	()V
    //   41: putfield 44	com/tencent/mm/plugin/record/b/l:pJO	Ljava/util/HashSet;
    //   44: aload_0
    //   45: new 36	java/util/HashMap
    //   48: dup
    //   49: invokespecial 37	java/util/HashMap:<init>	()V
    //   52: putfield 46	com/tencent/mm/plugin/record/b/l:pJP	Ljava/util/HashMap;
    //   55: aload_0
    //   56: new 48	com/tencent/mm/memory/a/b
    //   59: dup
    //   60: bipush 10
    //   62: aload_0
    //   63: invokevirtual 52	java/lang/Object:getClass	()Ljava/lang/Class;
    //   66: invokespecial 55	com/tencent/mm/memory/a/b:<init>	(ILjava/lang/Class;)V
    //   69: putfield 57	com/tencent/mm/plugin/record/b/l:mkq	Lcom/tencent/mm/a/f;
    //   72: sipush 24169
    //   75: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   78: return
  }

  public final Bitmap a(aar paramaar, long paramLong, boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(24172);
    if (!com.tencent.mm.compatible.util.f.Mn())
    {
      paramaar = BitmapFactory.decodeResource(ah.getContext().getResources(), 2130839707);
      AppMethodBeat.o(24172);
    }
    while (true)
    {
      return paramaar;
      if (paramBoolean);
      for (paramaar = n.f(paramaar, paramLong); ; paramaar = n.c(paramaar, paramLong))
      {
        if ((!bo.isNullOrNil(paramaar)) && (e.ct(paramaar)))
          break label103;
        ab.d("MicroMsg.RecordMsgImgService", "getBitmap file not exist, thumb[%B] path[%s]", new Object[] { Boolean.valueOf(paramBoolean), paramaar });
        paramaar = null;
        AppMethodBeat.o(24172);
        break;
      }
      label103: localObject = (Bitmap)this.mkq.get(paramaar);
      if (localObject == null)
        break;
      AppMethodBeat.o(24172);
      paramaar = (aar)localObject;
    }
    ab.d("MicroMsg.RecordMsgImgService", "get from cache fail, try to decode from file, path %s", new Object[] { paramaar });
    Object localObject = new BitmapFactory.Options();
    ((BitmapFactory.Options)localObject).inJustDecodeBounds = true;
    Bitmap localBitmap = BitmapFactory.decodeFile(paramaar, (BitmapFactory.Options)localObject);
    if (localBitmap != null)
    {
      ab.i("MicroMsg.RecordMsgImgService", "bitmap recycled %s", new Object[] { localBitmap });
      localBitmap.recycle();
    }
    int j;
    if ((ad.cJ(((BitmapFactory.Options)localObject).outWidth, ((BitmapFactory.Options)localObject).outHeight)) && (((BitmapFactory.Options)localObject).outWidth > 480))
    {
      j = 1;
      label229: if ((!ad.cI(((BitmapFactory.Options)localObject).outWidth, ((BitmapFactory.Options)localObject).outHeight)) || (((BitmapFactory.Options)localObject).outHeight <= 480))
        break label352;
      label256: if ((j == 0) && (i == 0))
        break label404;
      j = ((BitmapFactory.Options)localObject).outHeight;
    }
    for (i = ((BitmapFactory.Options)localObject).outWidth; ; i = 960)
    {
      int k = BackwardSupportUtil.ExifHelper.bJ(paramaar);
      int m;
      if ((k == 90) || (k == 270))
        m = i;
      while (true)
      {
        localObject = d.d(paramaar, m, j, false);
        if (localObject == null)
        {
          ab.e("MicroMsg.RecordMsgImgService", "extractThumbNail fail, temBmp is null, filePath = ".concat(String.valueOf(paramaar)));
          paramaar = null;
          AppMethodBeat.o(24172);
          break;
          j = 0;
          break label229;
          label352: i = 0;
          break label256;
        }
        localObject = d.b((Bitmap)localObject, k);
        this.mkq.put(paramaar, localObject);
        AppMethodBeat.o(24172);
        paramaar = (aar)localObject;
        break;
        m = j;
        j = i;
      }
      label404: j = 960;
    }
  }

  protected final void a(ImageView paramImageView, aar paramaar, long paramLong, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(24174);
    String str = n.LA(paramaar.mnd) + "@" + String.valueOf(paramLong);
    String[] arrayOfString;
    if (paramaar.mnd != null)
    {
      arrayOfString = (String[])this.mko.get(str);
      if ((arrayOfString != null) && (arrayOfString.length > 0))
        break label213;
      arrayOfString = new String[1];
      arrayOfString[0] = n.f(paramaar, paramLong);
      this.mko.put(str, arrayOfString);
    }
    label213: 
    while (true)
    {
      this.pJN.a(paramImageView, arrayOfString, paramString, paramInt1, paramInt2, paramInt3);
      if (this.pJO.contains(str))
        AppMethodBeat.o(24174);
      while (true)
      {
        return;
        AppMethodBeat.o(24174);
        continue;
        this.pJO.add(str);
        if ((!new File(arrayOfString[0]).exists()) && ((!bo.isNullOrNil(paramaar.fgE)) || (!bo.isNullOrNil(paramaar.fgv))))
          n.c(paramaar, paramLong, a(paramaar, paramLong));
        AppMethodBeat.o(24174);
      }
    }
  }

  public final boolean a(aar paramaar, long paramLong)
  {
    AppMethodBeat.i(24171);
    paramaar = n.h(paramaar.mnd, paramLong, true);
    g.a locala = (g.a)this.pJP.get(paramaar);
    boolean bool;
    if (locala == null)
    {
      locala = new g.a();
      this.pJP.put(paramaar, locala);
      AppMethodBeat.o(24171);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (locala.Mr() > 30000L)
      {
        locala.evE = SystemClock.elapsedRealtime();
        AppMethodBeat.o(24171);
        bool = true;
      }
      else
      {
        bool = false;
        AppMethodBeat.o(24171);
      }
    }
  }

  public final Bitmap b(aar paramaar, long paramLong)
  {
    AppMethodBeat.i(24173);
    Bitmap localBitmap = a(paramaar, paramLong, true);
    if (localBitmap == null)
    {
      boolean bool = a(paramaar, paramLong);
      ab.d("MicroMsg.RecordMsgImgService", "get thumb fail, try download, can retry:%B", new Object[] { Boolean.valueOf(bool) });
      n.c(paramaar, paramLong, bool);
    }
    AppMethodBeat.o(24173);
    return localBitmap;
  }

  public final void destory()
  {
    AppMethodBeat.i(24170);
    this.pJN.destroy();
    this.mko.clear();
    this.pJO.clear();
    this.pJN = null;
    this.mko = null;
    this.pJO = null;
    AppMethodBeat.o(24170);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.l
 * JD-Core Version:    0.6.2
 */