package com.tencent.mm.ui.chatting.view;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.ui.e.a;
import com.tencent.mm.plugin.story.api.e;
import com.tencent.mm.plugin.story.api.i;
import com.tencent.mm.plugin.story.api.i.a;
import com.tencent.mm.plugin.story.api.l;
import com.tencent.mm.plugin.story.api.m;

public class AvatarImageView extends AppCompatImageView
  implements l
{
  private final String TAG;
  private int pageType;
  private i rDe;
  private String rMJ;
  private boolean zaL;

  public AvatarImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public AvatarImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(32748);
    this.TAG = "MicroMsg.AvatarImageView";
    this.pageType = -1;
    this.rDe = null;
    this.rMJ = "";
    this.zaL = true;
    this.rDe = ((e)g.M(e.class)).getStoryUIFactory().eW(paramContext);
    this.rDe.aR(this);
    setLayerType(1, null);
    AppMethodBeat.o(32748);
  }

  public final void br(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(32755);
    if ((TextUtils.isEmpty(paramString)) || (getContext() == null))
    {
      AppMethodBeat.o(32755);
      return;
    }
    if (paramString.equals(this.rMJ))
      if (paramBoolean)
        break label58;
    label58: for (paramBoolean = true; ; paramBoolean = false)
    {
      setShowStoryHint(paramBoolean);
      AppMethodBeat.o(32755);
      break;
    }
  }

  public final void dk(String paramString, int paramInt)
  {
    AppMethodBeat.i(32754);
    this.rDe.dk(paramString, paramInt);
    this.rMJ = paramString;
    AppMethodBeat.o(32754);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(32756);
    super.onDetachedFromWindow();
    if (this.pageType != -1)
      a.b(this.pageType, this.rMJ, this);
    AppMethodBeat.o(32756);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(32749);
    super.onDraw(paramCanvas);
    if (this.zaL)
    {
      this.rDe.a(paramCanvas, true, 0);
      AppMethodBeat.o(32749);
    }
    while (true)
    {
      return;
      this.rDe.a(paramCanvas, false, 0);
      AppMethodBeat.o(32749);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(32750);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(32750);
  }

  public void setChattingBG(boolean paramBoolean)
  {
    this.zaL = paramBoolean;
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(32751);
    super.setOnClickListener(this.rDe.cwV());
    this.rDe.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(32751);
  }

  public void setOnDoubleClickListener(i.a parama)
  {
    AppMethodBeat.i(32752);
    this.rDe.setOnDoubleClickListener(parama);
    AppMethodBeat.o(32752);
  }

  public void setShowStoryHint(boolean paramBoolean)
  {
    AppMethodBeat.i(32753);
    this.rDe.setShowStoryHint(paramBoolean);
    AppMethodBeat.o(32753);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.view.AvatarImageView
 * JD-Core Version:    0.6.2
 */