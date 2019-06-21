package com.tencent.mm.chatroom.ui.story;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.widget.StoryAvatarDotsView;
import java.util.ArrayList;

public class StoryLoadIconPreference extends Preference
{
  private StoryAvatarDotsView eon;
  private b.f eoo;
  private int eop;
  private int eoq;
  private int eor;
  private final int eos;
  private int eot;
  private ArrayList<String> eou;
  private Context mContext;
  private View mView;

  public StoryLoadIconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(104476);
    this.mView = null;
    this.eos = -1;
    this.eot = -1;
    this.eou = new ArrayList();
    bA(paramContext);
    AppMethodBeat.o(104476);
  }

  public StoryLoadIconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(104477);
    this.mView = null;
    this.eos = -1;
    this.eot = -1;
    this.eou = new ArrayList();
    bA(paramContext);
    AppMethodBeat.o(104477);
  }

  private void bA(Context paramContext)
  {
    AppMethodBeat.i(104478);
    setLayoutResource(2130970127);
    this.mContext = paramContext;
    AppMethodBeat.o(104478);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(104480);
    super.onBindView(paramView);
    this.eop = com.tencent.mm.bz.a.fromDPToPix(this.mContext, 21);
    this.eor = com.tencent.mm.bz.a.fromDPToPix(this.mContext, 2);
    this.eoq = com.tencent.mm.bz.a.fromDPToPix(this.mContext, this.eop);
    this.eon = ((StoryAvatarDotsView)paramView.findViewById(2131828175));
    this.eon.setIconSize(this.eop + this.eor * 2);
    this.eon.setIconGap(this.eoq / 2);
    if (this.eon != null)
      if (this.eou.size() > 0)
      {
        this.eon.setVisibility(0);
        this.eon.setIconLayerCount(Math.min(this.eou.size(), 3));
        if (this.eoo == null)
          this.eoo = new com.tencent.mm.plugin.appbrand.ui.widget.a(this.eop, this.eor);
        for (int i = 0; i < this.eon.getChildCount(); i++)
          a.b.a(this.eon.qf(i), (String)this.eou.get(i), 0.5F, false);
        AppMethodBeat.o(104480);
      }
    while (true)
    {
      return;
      this.eon.setVisibility(8);
      AppMethodBeat.o(104480);
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(104479);
    if (this.mView == null)
    {
      paramViewGroup = super.onCreateView(paramViewGroup);
      ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(2131821019);
      localViewGroup.removeAllViews();
      View.inflate(this.mContext, 2130970896, localViewGroup);
      this.mView = paramViewGroup;
    }
    paramViewGroup = this.mView;
    AppMethodBeat.o(104479);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.story.StoryLoadIconPreference
 * JD-Core Version:    0.6.2
 */