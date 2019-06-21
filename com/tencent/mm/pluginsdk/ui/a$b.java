package com.tencent.mm.pluginsdk.ui;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import junit.framework.Assert;

public final class a$b
{
  public static i.a pqK;

  public static void a(ImageView paramImageView, String paramString, float paramFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(79661);
    if (paramImageView == null)
    {
      ab.e("MicroMsg.AvatarDrawable", "imageView is null");
      AppMethodBeat.o(79661);
      return;
    }
    Object localObject = paramImageView.getDrawable();
    if ((localObject != null) && ((localObject instanceof b)))
      localObject = (b)localObject;
    while (true)
    {
      ((b)localObject).setTag(paramString);
      paramImageView.setImageDrawable((Drawable)localObject);
      paramImageView.invalidate();
      AppMethodBeat.o(79661);
      break;
      localObject = new b(paramString, paramFloat);
      ((b)localObject).ox(paramBoolean);
    }
  }

  public static void b(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(79657);
    if (paramImageView == null)
    {
      ab.e("MicroMsg.AvatarDrawable", "imageView is null");
      AppMethodBeat.o(79657);
    }
    while (true)
    {
      return;
      a(paramImageView, paramString, a.Iz(), false);
      AppMethodBeat.o(79657);
    }
  }

  public static void b(ImageView paramImageView, String paramString, float paramFloat)
  {
    AppMethodBeat.i(138583);
    a(paramImageView, paramString, paramFloat, false);
    AppMethodBeat.o(138583);
  }

  public static i.a diS()
  {
    AppMethodBeat.i(79656);
    if (pqK != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      i.a locala = pqK;
      AppMethodBeat.o(79656);
      return locala;
    }
  }

  public static void f(ImageView paramImageView, String paramString, int paramInt)
  {
    AppMethodBeat.i(79663);
    if (paramImageView == null)
    {
      AppMethodBeat.o(79663);
      return;
    }
    Object localObject = paramImageView.getDrawable();
    if ((localObject != null) && ((localObject instanceof c)));
    for (localObject = (c)localObject; ; localObject = new c(paramString))
    {
      ((c)localObject).KL(paramInt);
      ((c)localObject).setTag(paramString);
      paramImageView.setImageDrawable((Drawable)localObject);
      paramImageView.invalidate();
      AppMethodBeat.o(79663);
      break;
    }
  }

  public static void r(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(79658);
    a(paramImageView, paramString, 0.5F, false);
    AppMethodBeat.o(79658);
  }

  public static void s(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(79660);
    a(paramImageView, paramString, 0.5F, true);
    AppMethodBeat.o(79660);
  }

  public static void t(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(79662);
    if (paramImageView == null)
    {
      ab.e("MicroMsg.AvatarDrawable", "imageView is null");
      AppMethodBeat.o(79662);
    }
    while (true)
    {
      return;
      a(paramImageView, paramString, a.Iz(), false);
      AppMethodBeat.o(79662);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.a.b
 * JD-Core Version:    0.6.2
 */