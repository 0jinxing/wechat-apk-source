package com.tencent.mm.plugin.story.ui.view;

import a.f.b.j;
import a.l;
import a.y;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/UserGuideView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clickListener", "Lkotlin/Function0;", "", "getClickListener", "()Lkotlin/jvm/functions/Function0;", "setClickListener", "(Lkotlin/jvm/functions/Function0;)V", "plugin-story_release"})
public final class g extends RelativeLayout
{
  private a.f.a.a<y> skn;

  public g(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(110471);
    View.inflate(paramContext, 2130970903, (ViewGroup)this);
    setBackgroundColor(-13421773);
    Object localObject = findViewById(2131828196);
    j.o(localObject, "findViewById(R.id.story_user_guide_content_2)");
    TextView localTextView = (TextView)localObject;
    localObject = paramContext.getString(2131303962);
    SpannableString localSpannableString = new SpannableString((CharSequence)localObject);
    Drawable localDrawable = getResources().getDrawable(2131231083);
    int i = com.tencent.mm.bz.a.fromDPToPix(paramContext, 10);
    localDrawable.setBounds(0, 0, i, i);
    localSpannableString.setSpan(new com.tencent.mm.ui.widget.a(localDrawable), ((String)localObject).length() - 3, ((String)localObject).length() - 2, 17);
    localTextView.setText((CharSequence)localSpannableString);
    setOnClickListener((View.OnClickListener)g.1.sko);
    findViewById(2131828197).setOnClickListener((View.OnClickListener)new g.2(this));
    AppMethodBeat.o(110471);
  }

  public final a.f.a.a<y> getClickListener()
  {
    return this.skn;
  }

  public final void setClickListener(a.f.a.a<y> parama)
  {
    this.skn = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.g
 * JD-Core Version:    0.6.2
 */