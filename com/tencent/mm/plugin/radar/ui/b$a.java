package com.tencent.mm.plugin.radar.ui;

import a.f.b.j;
import a.l;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.i.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/ui/RadarAvatarDrawable$Factory;", "", "()V", "aLoader", "Lcom/tencent/mm/pluginsdk/ui/LazyBitmapDrawable$BitmapLoader;", "getALoader", "()Lcom/tencent/mm/pluginsdk/ui/LazyBitmapDrawable$BitmapLoader;", "setALoader", "(Lcom/tencent/mm/pluginsdk/ui/LazyBitmapDrawable$BitmapLoader;)V", "attach", "", "iv", "Landroid/widget/ImageView;", "tag", "", "setLoader", "loader", "plugin-radar_release"})
public final class b$a
{
  private static i.a pCc;
  public static final a pCd;

  static
  {
    AppMethodBeat.i(102943);
    pCd = new a();
    AppMethodBeat.o(102943);
  }

  public static void a(i.a parama)
  {
    AppMethodBeat.i(102941);
    j.p(parama, "loader");
    pCc = parama;
    AppMethodBeat.o(102941);
  }

  public static void b(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(102942);
    j.p(paramImageView, "iv");
    j.p(paramString, "tag");
    Object localObject = paramImageView.getDrawable();
    if ((localObject != null) && ((localObject instanceof b)));
    for (localObject = (b)localObject; ; localObject = new b(paramString, (byte)0))
    {
      ((b)localObject).setTag(paramString);
      paramImageView.setImageDrawable((Drawable)localObject);
      AppMethodBeat.o(102942);
      return;
    }
  }

  public static i.a cdE()
  {
    return pCc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.b.a
 * JD-Core Version:    0.6.2
 */