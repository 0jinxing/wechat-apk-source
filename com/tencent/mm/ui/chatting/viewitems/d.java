package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.a.c.g;
import com.tencent.mm.at.a.d.b;
import com.tencent.mm.at.p.a;
import com.tencent.mm.modelappbrand.a.b.i;
import com.tencent.mm.plugin.appbrand.r.n;
import com.tencent.mm.plugin.websearch.api.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;

public final class d
{
  protected static void a(TextView paramTextView, j.b paramb)
  {
    AppMethodBeat.i(32859);
    switch (paramb.fiZ)
    {
    default:
      paramTextView.setText(2131296613);
    case 1:
    case 2:
    }
    while (true)
    {
      paramTextView.setVisibility(0);
      AppMethodBeat.o(32859);
      return;
      paramTextView.setText(2131296837);
      continue;
      paramTextView.setText(2131296836);
    }
  }

  static boolean h(j.b paramb)
  {
    AppMethodBeat.i(32860);
    paramb = (ab)paramb.X(ab.class);
    boolean bool;
    if ((paramb != null) && (!bo.isNullOrNil(paramb.uaa)))
    {
      bool = true;
      AppMethodBeat.o(32860);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(32860);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d
 * JD-Core Version:    0.6.2
 */