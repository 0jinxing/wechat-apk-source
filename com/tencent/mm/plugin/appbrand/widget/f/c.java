package com.tencent.mm.plugin.appbrand.widget.f;

import a.f.b.j;
import a.l;
import a.v;
import android.app.Activity;
import android.content.Context;
import android.text.Spannable.Factory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.base.o;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast;", "Lcom/tencent/mm/ui/base/MMPopupWindow;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mIconImage", "Landroid/widget/ImageView;", "mMessageText", "Landroid/widget/TextView;", "setIconDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "setMessage", "message", "", "show", "", "plugin-appbrand-integration_release"})
public final class c extends o
{
  private final TextView jmD;
  private final ImageView jmE;

  public c(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(135265);
    Object localObject = LayoutInflater.from(paramContext);
    View localView = getContentView();
    if (localView == null)
    {
      paramContext = new v("null cannot be cast to non-null type android.view.ViewGroup");
      AppMethodBeat.o(135265);
      throw paramContext;
    }
    setContentView(((LayoutInflater)localObject).inflate(2130968735, (ViewGroup)localView, false));
    localObject = getContentView().findViewById(2131821370);
    j.o(localObject, "contentView.findViewById<View>(R.id.progress)");
    ((View)localObject).setVisibility(8);
    localObject = getContentView().findViewById(2131821371);
    j.o(localObject, "contentView.findViewById(R.id.iv_icon)");
    this.jmE = ((ImageView)localObject);
    localObject = getContentView().findViewById(2131820678);
    j.o(localObject, "contentView.findViewById(R.id.title)");
    this.jmD = ((TextView)localObject);
    paramContext = com.tencent.mm.svg.a.a.f(paramContext.getResources(), 2131230878);
    this.jmE.setVisibility(0);
    this.jmE.setScaleType(ImageView.ScaleType.FIT_CENTER);
    this.jmE.setImageDrawable(paramContext);
    AppMethodBeat.o(135265);
  }

  public final c F(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(135263);
    int i;
    if ((paramCharSequence == null) || (paramCharSequence.length() == 0))
    {
      i = 1;
      if (i != 0)
        break label143;
      this.jmD.setLineSpacing(0.0F, 1.0F);
      TextView localTextView = this.jmD;
      View localView = getContentView();
      j.o(localView, "contentView");
      localTextView.setSpannableFactory((Spannable.Factory)new e(com.tencent.mm.bz.a.fromDPToPix(localView.getContext(), 18)));
      this.jmD.setText(paramCharSequence, TextView.BufferType.SPANNABLE);
      this.jmD.setVisibility(0);
      paramCharSequence = getContentView();
      j.o(paramCharSequence, "contentView");
      i = com.tencent.mm.bz.a.fromDPToPix(paramCharSequence.getContext(), 27);
      getContentView().findViewById(2131821369).setPadding(0, i, 0, 0);
    }
    while (true)
    {
      AppMethodBeat.o(135263);
      return this;
      i = 0;
      break;
      label143: this.jmD.setVisibility(4);
    }
  }

  public final void show()
  {
    AppMethodBeat.i(135264);
    Object localObject = getContentView();
    j.o(localObject, "contentView");
    localObject = com.tencent.mm.ui.statusbar.d.cY(((View)localObject).getContext());
    if (localObject != null)
    {
      super.showAtLocation(((Activity)localObject).findViewById(16908290), 17, 0, 0);
      al.n((Runnable)new d(this), 1500L);
      AppMethodBeat.o(135264);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135264);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.f.c
 * JD-Core Version:    0.6.2
 */