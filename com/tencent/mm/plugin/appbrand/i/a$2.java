package com.tencent.mm.plugin.appbrand.i;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.i;
import com.tencent.mm.plugin.appbrand.r.o;
import com.tencent.mm.plugin.appbrand.widget.h.b;
import com.tencent.neattextview.textview.view.NeatTextView;
import java.lang.ref.WeakReference;

final class a$2
  implements b.i
{
  a$2(a parama, WeakReference paramWeakReference1, WeakReference paramWeakReference2, SpannableString paramSpannableString)
  {
  }

  public final void abU()
  {
  }

  public final void mr()
  {
  }

  public final String wP()
  {
    AppMethodBeat.i(132267);
    String str = a.class.getSimpleName();
    AppMethodBeat.o(132267);
    return str;
  }

  public final void x(Bitmap paramBitmap)
  {
    AppMethodBeat.i(132266);
    NeatTextView localNeatTextView = (NeatTextView)this.inp.get();
    Object localObject = (Context)this.inq.get();
    if ((localObject != null) && (localNeatTextView != null))
    {
      paramBitmap = new BitmapDrawable(((Context)localObject).getResources(), paramBitmap);
      paramBitmap.setBounds(0, 0, o.aNT(), o.aNT());
      localObject = new b(paramBitmap);
      paramBitmap = new SpannableString("@ ");
      paramBitmap.setSpan(localObject, 0, 1, 33);
      localNeatTextView.ah(TextUtils.concat(new CharSequence[] { paramBitmap, this.inr }));
      localNeatTextView.invalidate();
    }
    AppMethodBeat.o(132266);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.a.2
 * JD-Core Version:    0.6.2
 */