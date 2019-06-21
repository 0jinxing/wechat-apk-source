package com.tencent.mm.plugin.shake.d.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.platformtools.v;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.shake.d.a.i;
import com.tencent.mm.plugin.shake.d.a.k;
import com.tencent.mm.plugin.shake.e.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.io.IOException;

public final class a extends BitmapDrawable
  implements x.a
{
  private static final Paint feO;
  private static Bitmap quf;
  private ImageView mok;
  private int nnS;
  private String qud;
  private v que;
  private int type;
  private String username;

  static
  {
    AppMethodBeat.i(24688);
    Paint localPaint = new Paint();
    feO = localPaint;
    localPaint.setAntiAlias(true);
    feO.setFilterBitmap(true);
    AppMethodBeat.o(24688);
  }

  public static String UK(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(24687);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.ShakeAvatarDrawable", "getStoragePath: but url is null");
      AppMethodBeat.o(24687);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      String str = i.ckx();
      if (bo.isNullOrNil(str))
      {
        ab.w("MicroMsg.ShakeAvatarDrawable", "getStoragePath, but save dir is null");
        AppMethodBeat.o(24687);
        paramString = localObject;
      }
      else
      {
        paramString = String.format("%s/%s", new Object[] { str, g.x(paramString.getBytes()) });
        AppMethodBeat.o(24687);
      }
    }
  }

  private static Bitmap ab(View paramView, int paramInt)
  {
    AppMethodBeat.i(24685);
    if (paramView == null)
    {
      paramView = quf;
      AppMethodBeat.o(24685);
    }
    while (true)
    {
      return paramView;
      int i = paramView.getMeasuredWidth();
      int j = paramView.getMeasuredHeight();
      if (((quf != null) && (quf.getWidth() == i)) || (paramInt > 0));
      try
      {
        for (quf = d.v(paramView.getResources().getDrawable(paramInt)); ; quf = BackwardSupportUtil.b.b(ah.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.bz.a.getDensity(null)))
        {
          if ((quf.getWidth() != i) && (i > 0) && (j > 0))
            quf = Bitmap.createScaledBitmap(quf, i, j, true);
          paramView = quf;
          AppMethodBeat.o(24685);
          break;
        }
      }
      catch (IOException paramView)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.ShakeAvatarDrawable", paramView, "", new Object[0]);
      }
    }
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(24684);
    ab.i("MicroMsg.ShakeAvatarDrawable", "album username[%s], url[%s], type[%d], attr[%s]", new Object[] { this.username, this.qud, Integer.valueOf(this.type), toString() });
    if ((4 != this.type) && ((!k.Cz(this.type)) || (6 == this.type)))
    {
      AppMethodBeat.o(24684);
      return;
    }
    Object localObject1 = null;
    Object localObject2;
    if (4 == this.type)
    {
      this.que = new a.a(this.qud);
      localObject2 = x.a(this.que);
    }
    while (true)
    {
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (!((Bitmap)localObject2).isRecycled());
      }
      else
      {
        ab.i("MicroMsg.ShakeAvatarDrawable", "bm is null or recycled, album url[%s]", new Object[] { this.qud });
        localObject1 = ab(this.mok, this.nnS);
      }
      if (localObject1 != null)
        paramCanvas.drawBitmap((Bitmap)localObject1, null, getBounds(), feO);
      AppMethodBeat.o(24684);
      break;
      localObject2 = localObject1;
      if (k.Cz(this.type))
      {
        localObject2 = localObject1;
        if (6 != this.type)
        {
          this.que = new b(this.qud);
          localObject2 = x.a(this.que);
        }
      }
    }
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(24686);
    ab.i("MicroMsg.ShakeAvatarDrawable", "type[%d] notifyKey[%s] albumUrl[%s]", new Object[] { Integer.valueOf(this.type), paramString, this.qud });
    if ((this.que != null) && (paramString.equals(this.que.anL())) && ((4 == this.type) || ((k.Cz(this.type)) && (6 != this.type))))
      this.mok.post(new a.1(this, paramBitmap));
    AppMethodBeat.o(24686);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.b.a
 * JD-Core Version:    0.6.2
 */