package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.story.api.b;
import com.tencent.mm.plugin.story.api.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

public class CategoryTipView extends RelativeLayout
  implements c
{
  private int mStatus;
  private String osR;
  private long qBy;
  private TextView zlk;

  public CategoryTipView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(33551);
    this.zlk = null;
    this.mStatus = 0;
    this.qBy = 0L;
    this.osR = "";
    init();
    AppMethodBeat.o(33551);
  }

  public CategoryTipView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(33552);
    this.zlk = null;
    this.mStatus = 0;
    this.qBy = 0L;
    this.osR = "";
    init();
    AppMethodBeat.o(33552);
  }

  private boolean dHD()
  {
    AppMethodBeat.i(33556);
    Object localObject = getTag();
    if ((localObject != null) && ((localObject instanceof Integer)) && (((Integer)localObject).intValue() == 32));
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.CategoryTipView", "%s isFavourHeader=%s", new Object[] { this, Boolean.valueOf(bool) });
      AppMethodBeat.o(33556);
      return bool;
    }
  }

  private void init()
  {
    AppMethodBeat.i(33554);
    LayoutInflater.from(getContext()).inflate(2130968639, this, true);
    this.zlk = ((TextView)findViewById(2131821063));
    setOnClickListener(new CategoryTipView.1(this));
    ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getFavourUserChecker().b(new WeakReference(this));
    AppMethodBeat.o(33554);
  }

  public final void EH(int paramInt)
  {
    AppMethodBeat.i(33557);
    ab.d("MicroMsg.CategoryTipView", "%s mStatus=%s newStatus=%s", new Object[] { this, Integer.valueOf(this.mStatus), Integer.valueOf(paramInt) });
    if ((getVisibility() == 0) && (dHD()) && (this.mStatus != paramInt))
      post(new CategoryTipView.2(this, paramInt));
    AppMethodBeat.o(33557);
  }

  public final void Pm(int paramInt)
  {
    AppMethodBeat.i(33555);
    this.mStatus = paramInt;
    int i;
    Drawable localDrawable;
    if (dHD())
    {
      i = com.tencent.mm.m.g.Nu().getInt("StoryShouldShowEntraceInFavorFriend", 1);
      if ((i == 1) && ((paramInt & 0x1) != 0))
      {
        ab.i("MicroMsg.CategoryTipView", "%s showStoryCategory has new story %s", new Object[] { this, Integer.valueOf(i) });
        setVisibility(0);
        this.zlk.setVisibility(0);
        localDrawable = getContext().getResources().getDrawable(2131231389);
        localDrawable.setBounds(0, 0, a.fromDPToPix(getContext(), 20), a.fromDPToPix(getContext(), 20));
        this.zlk.setCompoundDrawables(null, null, localDrawable, null);
        this.zlk.invalidate();
        AppMethodBeat.o(33555);
      }
    }
    while (true)
    {
      return;
      if ((i == 1) && ((paramInt & 0x2) != 0))
      {
        ab.i("MicroMsg.CategoryTipView", "%s showStoryCategory has story %s", new Object[] { this, Integer.valueOf(i) });
        setVisibility(0);
        this.zlk.setVisibility(0);
        localDrawable = getContext().getResources().getDrawable(2131231478);
        localDrawable.setBounds(0, 0, a.fromDPToPix(getContext(), 20), a.fromDPToPix(getContext(), 20));
        this.zlk.setCompoundDrawables(null, null, localDrawable, null);
        this.zlk.invalidate();
        AppMethodBeat.o(33555);
      }
      else
      {
        setVisibility(8);
        this.zlk.setVisibility(8);
        AppMethodBeat.o(33555);
        continue;
        setVisibility(8);
        this.zlk.setVisibility(8);
        AppMethodBeat.o(33555);
      }
    }
  }

  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(33553);
    super.onVisibilityChanged(paramView, paramInt);
    if (paramInt == 0);
    while (true)
    {
      ab.d("MicroMsg.CategoryTipView", "visibility == View.VISIBLE : %s", new Object[] { Boolean.valueOf(bool) });
      if (paramInt == 0)
        this.osR = com.tencent.mm.ui.e.aqC("6");
      AppMethodBeat.o(33553);
      return;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.CategoryTipView
 * JD-Core Version:    0.6.2
 */