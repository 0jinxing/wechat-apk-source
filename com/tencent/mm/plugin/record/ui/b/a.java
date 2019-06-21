package com.tencent.mm.plugin.record.ui.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.record.ui.a.b;
import com.tencent.mm.plugin.record.ui.h.a;
import com.tencent.mm.plugin.record.ui.h.a.b;
import com.tencent.mm.plugin.record.ui.h.b;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.n;
import com.tencent.mm.ui.tools.j;
import java.util.HashMap;
import java.util.Map;

public final class a
  implements h.b
{
  j hPs;
  private ListView mListView;
  Map<String, nr> mim;
  private com.tencent.mm.sdk.b.c mip;
  private View.OnClickListener mjE;
  View.OnLongClickListener mlV;
  int pKT;
  h.a pKt;

  public a(h.a parama, ListView paramListView)
  {
    AppMethodBeat.i(24345);
    this.mim = new HashMap();
    this.mjE = new a.1(this);
    this.mlV = new a.2(this);
    this.mip = new a.4(this);
    this.pKt = parama;
    this.mListView = paramListView;
    com.tencent.mm.sdk.b.a.xxA.c(this.mip);
    AppMethodBeat.o(24345);
  }

  public final void a(View paramView, int paramInt, b paramb)
  {
    AppMethodBeat.i(24347);
    ImageView localImageView = (ImageView)paramView.findViewById(2131826907);
    localImageView.setTag(paramb);
    localImageView.setOnClickListener(this.mjE);
    if (paramb.dataType == 1)
      localImageView.setOnLongClickListener(this.mlV);
    h.a.b localb = new h.a.b();
    if (paramb.dataType == 0)
      localb.pKv = paramb.cvx;
    label212: 
    while (true)
    {
      localb.cAv = paramb.cAv;
      localb.cAy = true;
      localb.maxWidth = this.pKT;
      paramView = this.pKt.a(localb);
      if (paramView != null)
      {
        ab.d("MicroMsg.ImageViewWrapper", "get from dataId %s, cache %s", new Object[] { localb.cAv.mnd, paramView });
        a(localImageView, paramView, 2131231262, paramb.cAv.mnd);
        AppMethodBeat.o(24347);
      }
      while (true)
      {
        return;
        if (paramb.dataType != 1)
          break label212;
        localb.pKv = paramb.mnW.field_localId;
        break;
        d.xDH.ak(new a.3(this, paramb, localImageView));
        AppMethodBeat.o(24347);
      }
    }
  }

  final void a(ImageView paramImageView, Bitmap paramBitmap, int paramInt, String paramString)
  {
    AppMethodBeat.i(24348);
    if (!((b)paramImageView.getTag()).cAv.mnd.equals(paramString))
    {
      ab.d("MicroMsg.ImageViewWrapper", "scroll over to next img. old tag %s, now tag %s", new Object[] { paramString, paramImageView.getTag() });
      AppMethodBeat.o(24348);
    }
    while (true)
    {
      return;
      if (paramBitmap != null)
        break;
      paramBitmap = paramImageView.getLayoutParams();
      paramBitmap.height = 200;
      paramBitmap.width = 280;
      paramImageView.setImageResource(paramInt);
      paramImageView.setBackgroundResource(2131690201);
      AppMethodBeat.o(24348);
    }
    ab.d("MicroMsg.ImageViewWrapper", "update view bmp[%d, %d], iv[%d, %d]", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()), Integer.valueOf(paramImageView.getWidth()), Integer.valueOf(paramImageView.getHeight()) });
    paramString = paramImageView.getLayoutParams();
    int i = paramBitmap.getWidth();
    paramInt = paramBitmap.getHeight();
    float f;
    if (paramInt >= i)
    {
      f = paramInt / i;
      if (f <= 2.5D)
        break label453;
      paramBitmap = Bitmap.createBitmap(paramBitmap, 0, (paramBitmap.getHeight() - (int)(paramBitmap.getWidth() * 2.5F)) / 2, paramBitmap.getWidth(), (int)(paramBitmap.getWidth() * 2.5F));
      f = 2.5F;
    }
    label453: 
    while (true)
    {
      if (f <= 2.0F)
      {
        paramInt = com.tencent.mm.bz.a.am(paramImageView.getContext(), 2131427524);
        i = (int)(paramInt / f);
      }
      while (true)
      {
        paramString.width = i;
        paramString.height = paramInt;
        paramImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        n.w(paramImageView, i, paramInt);
        if (paramImageView.getLayerType() == 1)
          this.mListView.setLayerType(1, null);
        paramImageView.setImageBitmap(paramBitmap);
        paramImageView.setBackgroundResource(0);
        AppMethodBeat.o(24348);
        break;
        i = com.tencent.mm.bz.a.am(paramImageView.getContext(), 2131427526);
        paramInt = (int)(i * f);
      }
      f = i / paramInt;
      if (f > 2.5D)
      {
        paramBitmap = Bitmap.createBitmap(paramBitmap, (paramBitmap.getWidth() - (int)(paramBitmap.getHeight() * 2.5F)) / 2, 0, (int)(paramBitmap.getHeight() * 2.5F), paramBitmap.getHeight());
        f = 2.5F;
      }
      while (true)
      {
        if (f <= 2.0F)
        {
          i = com.tencent.mm.bz.a.am(paramImageView.getContext(), 2131427524);
          paramInt = (int)(i / f);
          break;
        }
        paramInt = com.tencent.mm.bz.a.am(paramImageView.getContext(), 2131427526);
        i = (int)(paramInt * f);
        break;
      }
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(24349);
    com.tencent.mm.sdk.b.a.xxA.d(this.mip);
    AppMethodBeat.o(24349);
  }

  public final View eK(Context paramContext)
  {
    AppMethodBeat.i(24346);
    View localView = View.inflate(paramContext, 2130970481, null);
    this.pKT = com.tencent.mm.bz.a.fromDPToPix(paramContext, 200);
    AppMethodBeat.o(24346);
    return localView;
  }

  public final void pause()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.b.a
 * JD-Core Version:    0.6.2
 */