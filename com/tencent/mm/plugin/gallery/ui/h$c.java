package com.tencent.mm.plugin.gallery.ui;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class h$c
  implements d.b
{
  final ImageView mSh;

  h$c(ImageView paramImageView)
  {
    this.mSh = paramImageView;
  }

  private Drawable bCO()
  {
    AppMethodBeat.i(138613);
    Object localObject = this.mSh;
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(138613);
    }
    while (true)
    {
      return localObject;
      localObject = ((ImageView)localObject).getDrawable();
      AppMethodBeat.o(138613);
    }
  }

  public final void NA(String paramString)
  {
    AppMethodBeat.i(21608);
    ImageView localImageView = this.mSh;
    if (localImageView == null)
    {
      ab.w("MicroMsg.ThumbDrawable", "[tomys] ownerView is recycled, ignore this event.");
      AppMethodBeat.o(21608);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramString))
      {
        ab.d("MicroMsg.ThumbDrawable", "filepath is null or nill");
        AppMethodBeat.o(21608);
      }
      else
      {
        Object localObject = localImageView.getDrawable();
        if (localObject == null)
        {
          ab.w("MicroMsg.ThumbDrawable", "drawable in ownerView [%s] is null, ignore.", new Object[] { localImageView });
          AppMethodBeat.o(21608);
        }
        else if ((localObject instanceof h))
        {
          localObject = (h)localObject;
          if (!((h)localObject).mFilePath.equals(paramString))
          {
            ab.d("MicroMsg.ThumbDrawable", "not current filepath, drawableFilePath: [%s], cbFilePath: [%s]", new Object[] { ((h)localObject).mFilePath, paramString });
            AppMethodBeat.o(21608);
          }
          else
          {
            ab.d("MicroMsg.ThumbDrawable", "notify thumb get ".concat(String.valueOf(paramString)));
            localImageView.post(new h.b(localImageView));
            AppMethodBeat.o(21608);
          }
        }
        else
        {
          ab.w("MicroMsg.ThumbDrawable", "drawable [%s] in ownerView [%s] is not a ThumbDrawable, ignore.", new Object[] { localObject, localImageView });
          AppMethodBeat.o(21608);
        }
      }
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(138169);
    if (paramObject == null)
      AppMethodBeat.o(138169);
    while (true)
    {
      return bool;
      Drawable localDrawable = bCO();
      if ((paramObject instanceof c))
        paramObject = ((c)paramObject).bCO();
      while (true)
        if ((localDrawable == null) && (paramObject == null))
        {
          bool = true;
          AppMethodBeat.o(138169);
          break;
          if ((paramObject instanceof h))
          {
            paramObject = (Drawable)paramObject;
          }
          else
          {
            AppMethodBeat.o(138169);
            break;
          }
        }
      if ((localDrawable != null) && (paramObject != null))
      {
        bool = localDrawable.equals(paramObject);
        AppMethodBeat.o(138169);
      }
      else
      {
        AppMethodBeat.o(138169);
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(21609);
    Drawable localDrawable = bCO();
    int i;
    if (localDrawable != null)
    {
      i = localDrawable.hashCode();
      AppMethodBeat.o(21609);
    }
    while (true)
    {
      return i;
      i = super.hashCode();
      AppMethodBeat.o(21609);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.h.c
 * JD-Core Version:    0.6.2
 */