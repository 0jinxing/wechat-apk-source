package com.tencent.mm.loader.e.b;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends e<ImageView>
{
  public b(f<ImageView> paramf)
  {
    super(paramf);
  }

  protected final void a(Bitmap paramBitmap, f<?> paramf)
  {
    paramf = (ImageView)paramf.getView();
    ab.i("MicroMsg.Loader.ImageViewShowTarget", "onResourceReadyUI %s imageView %s", new Object[] { paramBitmap, paramf });
    if (paramf != null)
      paramf.setImageBitmap(paramBitmap);
    paramBitmap = d.eQA;
    d.a.TN().a(this);
  }

  public final void a(f<?> paramf, com.tencent.mm.loader.f<?, ?> paramf1)
  {
    if (paramf == null)
      ab.w("MicroMsg.Loader.ImageViewShowTarget", "[ViewShowTarget] should show default view or options is null.");
    while (true)
    {
      return;
      paramf = (ImageView)paramf.getView();
      if (paramf != null)
      {
        int i;
        if ((paramf1.eOW > 0) || (paramf1.eOX != null))
          i = 1;
        while (true)
          if (i != 0)
          {
            if (paramf1.eOW == 0)
            {
              paramf.setImageDrawable(paramf1.eOX);
              break;
              i = 0;
              continue;
            }
            paramf.setImageResource(paramf1.eOW);
            break;
          }
        paramf.setImageBitmap(null);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.e.b.b
 * JD-Core Version:    0.6.2
 */