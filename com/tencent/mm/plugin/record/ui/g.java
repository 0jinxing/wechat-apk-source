package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.record.b.l;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.protocal.protobuf.aap;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abo;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;

public final class g extends l
  implements h.a
{
  public final Bitmap a(h.a.b paramb)
  {
    AppMethodBeat.i(24226);
    aar localaar = paramb.cAv;
    long l = paramb.pKv;
    boolean bool = paramb.cAy;
    int i = paramb.maxWidth;
    if (!com.tencent.mm.compatible.util.f.Mn())
      paramb = BitmapFactory.decodeResource(ah.getContext().getResources(), 2130839707);
    String str;
    while (true)
    {
      if ((paramb == null) && (!bool))
      {
        bool = super.a(localaar, l);
        ab.d("MicroMsg.RecordMsgImgService", "get image fail, try download, can retry:%B", new Object[] { Boolean.valueOf(bool) });
        n.b(localaar, l, bool);
      }
      AppMethodBeat.o(24226);
      return paramb;
      str = n.c(localaar, l);
      if ((bo.isNullOrNil(str)) || (!e.ct(str)))
      {
        ab.d("MicroMsg.RecordMsgImgService", "getBitmap file not exist, thumb[%B] path[%s]", new Object[] { Boolean.FALSE, str });
        paramb = null;
      }
      else
      {
        paramb = (Bitmap)this.mkq.get(str);
        if (paramb != null)
        {
          ab.d("MicroMsg.RecordMsgImgService", "get bm from cache %s", new Object[] { str });
        }
        else
        {
          if (!bool)
            break;
          paramb = null;
        }
      }
    }
    ab.d("MicroMsg.RecordMsgImgService", "get from cache fail, try to decode from file, path %s", new Object[] { str });
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    paramb = BitmapFactory.decodeFile(str, localOptions);
    if (paramb != null)
    {
      ab.i("MicroMsg.RecordMsgImgService", "bitmap recycle %s", new Object[] { paramb });
      paramb.recycle();
    }
    int j = localOptions.outHeight;
    int k = localOptions.outWidth;
    ab.d("MicroMsg.RecordMsgImgService", "width: %s, height: %s", new Object[] { Integer.valueOf(k), Integer.valueOf(j) });
    int m = k;
    if (k > i)
    {
      j = localOptions.outHeight * i / localOptions.outWidth;
      m = i;
    }
    m = Math.max(1, m);
    j = Math.max(1, j);
    if (m > i)
      j = localOptions.outHeight * i / localOptions.outWidth;
    while (true)
    {
      k = BackwardSupportUtil.ExifHelper.bJ(str);
      if ((k == 90) || (k == 270))
        m = i;
      while (true)
      {
        paramb = d.d(str, m, j, false);
        if (paramb == null)
        {
          ab.e("MicroMsg.RecordMsgImgService", "extractThumbNail fail, temBmp is null, filePath = ".concat(String.valueOf(str)));
          paramb = null;
          break;
        }
        paramb = d.b(paramb, k);
        this.mkq.put(str, paramb);
        break;
        m = j;
        j = i;
      }
      i = m;
    }
  }

  public final Bitmap a(h.a.c paramc)
  {
    AppMethodBeat.i(24225);
    paramc = super.b(paramc.cAv, paramc.pKv);
    AppMethodBeat.o(24225);
    return paramc;
  }

  public final void a(h.a.a parama)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(24224);
    ImageView localImageView = parama.cAw;
    aar localaar = parama.cAv;
    long l = parama.pKv;
    int i = parama.cAx;
    int j = parama.width;
    int k = parama.height;
    if (localImageView == null)
      AppMethodBeat.o(24224);
    while (true)
    {
      return;
      if (!com.tencent.mm.compatible.util.f.Mn())
      {
        localImageView.setImageResource(2130839707);
        AppMethodBeat.o(24224);
      }
      else if (localaar == null)
      {
        localImageView.setImageResource(i);
        AppMethodBeat.o(24224);
      }
      else
      {
        switch (localaar.dataType)
        {
        case 6:
        case 8:
        case 9:
        case 12:
        case 13:
        case 16:
        case 17:
        case 18:
        default:
          ab.w("MicroMsg.RecordMsgImgService", "attach thumb, pass data type is %d", new Object[] { Integer.valueOf(localaar.dataType) });
          AppMethodBeat.o(24224);
          break;
        case 7:
          super.a(localImageView, localaar, l, localaar.cvq, i, j, k);
          AppMethodBeat.o(24224);
          break;
        case 4:
        case 15:
          label206: super.a(localImageView, localaar, l, localaar.cvq, i, j, k);
          AppMethodBeat.o(24224);
        case 5:
        case 10:
        case 14:
        case 11:
        case 19:
        }
      }
    }
    if (localaar.wgT != null)
    {
      parama = localaar.wgT.whA;
      label292: if (parama != null)
        break label362;
      parama = localObject2;
      label298: if (!bo.isNullOrNil(parama))
        break label705;
      parama = localaar.cvq;
    }
    label694: label702: label705: 
    while (true)
    {
      super.a(localImageView, localaar, l, parama, i, j, k);
      AppMethodBeat.o(24224);
      break;
      ab.w("MicroMsg.RecordMsgImgService", "webpage: get data proto item null, dataid[%s]", new Object[] { localaar.mnd });
      parama = null;
      break label292;
      label362: parama = parama.thumbUrl;
      break label298;
      if (localaar.wgT == null)
      {
        ab.w("MicroMsg.RecordMsgImgService", "good: get data proto item null, dataid[%s]", new Object[] { localaar.mnd });
        AppMethodBeat.o(24224);
        break;
      }
      parama = localaar.wgT.whC;
      if (parama == null)
        break label206;
      this.pJN.a(localImageView, null, parama.thumbUrl, i, j, k);
      AppMethodBeat.o(24224);
      break;
      if (localaar.wgT == null)
      {
        ab.w("MicroMsg.RecordMsgImgService", "tv: get data proto item null, dataid[%s]", new Object[] { localaar.mnd });
        AppMethodBeat.o(24224);
        break;
      }
      parama = localaar.wgT.whE;
      if (parama == null)
        break label206;
      this.pJN.a(localImageView, null, parama.thumbUrl, i, j, k);
      AppMethodBeat.o(24224);
      break;
      if (localaar.wgT == null)
      {
        ab.w("MicroMsg.RecordMsgImgService", "product: get data proto item null, dataid[%s]", new Object[] { localaar.mnd });
        AppMethodBeat.o(24224);
        break;
      }
      parama = localaar.wgT.whC;
      if (parama == null)
        break label206;
      this.pJN.a(localImageView, null, parama.thumbUrl, i, j, k);
      AppMethodBeat.o(24224);
      break;
      if (localaar.wgT != null)
      {
        parama = localaar.wgT.whN;
        label624: if (parama != null)
          break label694;
        parama = localObject1;
        label630: if (!bo.isNullOrNil(parama))
          break label702;
        parama = localaar.cvq;
      }
      while (true)
      {
        super.a(localImageView, localaar, l, parama, i, j, k);
        AppMethodBeat.o(24224);
        break;
        ab.w("MicroMsg.RecordMsgImgService", "appbrand: get data proto item null, dataid[%s]", new Object[] { localaar.mnd });
        parama = null;
        break label624;
        parama = parama.iconUrl;
        break label630;
      }
    }
  }

  public final void ceH()
  {
    AppMethodBeat.i(24227);
    super.destory();
    AppMethodBeat.o(24227);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.g
 * JD-Core Version:    0.6.2
 */