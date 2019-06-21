package com.tencent.mm.plugin.pwdgroup;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.i.a;

public final class b$a
{
  static i.a pqK;

  public static void b(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(23974);
    Object localObject = paramImageView.getDrawable();
    if ((localObject != null) && ((localObject instanceof b)));
    for (localObject = (b)localObject; ; localObject = new b(paramString, (byte)0))
    {
      ((b)localObject).setTag(paramString);
      paramImageView.setImageDrawable((Drawable)localObject);
      AppMethodBeat.o(23974);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.pwdgroup.b.a
 * JD-Core Version:    0.6.2
 */