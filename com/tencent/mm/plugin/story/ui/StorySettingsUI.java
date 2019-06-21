package com.tencent.mm.plugin.story.ui;

import a.f.b.j;
import a.l;
import a.v;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.h;
import com.tencent.mm.plugin.story.proxy.StoryCaptureProxy;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.base.p;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/StorySettingsUI;", "Lcom/tencent/mm/ui/MMActivity;", "()V", "adapter", "Lcom/tencent/mm/plugin/story/ui/StorySettingsUI$ChoiceAdapter;", "listview", "Landroid/widget/ListView;", "mDialog", "Lcom/tencent/mm/ui/base/MMProgressDialog;", "proxy", "Lcom/tencent/mm/plugin/story/proxy/StoryCaptureProxy;", "selectsList", "Ljava/util/LinkedList;", "Lcom/tencent/mm/plugin/story/ui/StorySettingsUI$ITestMenu;", "serverProxy", "Lcom/tencent/mm/remoteservice/RemoteServiceProxy;", "getLayoutId", "", "initOnCreate", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "ChoiceAdapter", "ChoiceItem", "ClickItem", "Companion", "ITestMenu", "plugin-story_release"})
@com.tencent.mm.ui.base.a(3)
public final class StorySettingsUI extends MMActivity
{
  private static final String TAG = "MicroMsg.StorySettingUI";
  public static final StorySettingsUI.d sfb;
  private d ext;
  private ListView gKd;
  private final LinkedList<StorySettingsUI.e> oDp;
  private a seY;
  private StoryCaptureProxy seZ;
  private p sfa;

  static
  {
    AppMethodBeat.i(110084);
    sfb = new StorySettingsUI.d((byte)0);
    TAG = "MicroMsg.StorySettingUI";
    AppMethodBeat.o(110084);
  }

  public StorySettingsUI()
  {
    AppMethodBeat.i(110083);
    this.ext = new d(ah.getContext());
    this.oDp = new LinkedList();
    AppMethodBeat.o(110083);
  }

  public final int getLayoutId()
  {
    return 2130970902;
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(110079);
    super.onCreate(paramBundle);
    this.seZ = new StoryCaptureProxy(this.ext);
    this.ext.connect((Runnable)new StorySettingsUI.x(this));
    setBackBtn((MenuItem.OnMenuItemClickListener)new StorySettingsUI.y(this));
    AppMethodBeat.o(110079);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(110080);
    super.onDestroy();
    this.ext.release();
    AppMethodBeat.o(110080);
  }

  public final void onPause()
  {
    AppMethodBeat.i(110082);
    super.onPause();
    AppMethodBeat.o(110082);
  }

  public final void onResume()
  {
    AppMethodBeat.i(110081);
    super.onResume();
    AppMethodBeat.o(110081);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/StorySettingsUI$ChoiceAdapter;", "Landroid/widget/BaseAdapter;", "(Lcom/tencent/mm/plugin/story/ui/StorySettingsUI;)V", "getCount", "", "getItem", "", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "plugin-story_release"})
  public final class a extends BaseAdapter
  {
    public final int getCount()
    {
      AppMethodBeat.i(110041);
      int i = StorySettingsUI.c(this.sfc).size();
      AppMethodBeat.o(110041);
      return i;
    }

    public final Object getItem(int paramInt)
    {
      AppMethodBeat.i(110042);
      Object localObject = StorySettingsUI.c(this.sfc).get(paramInt);
      j.o(localObject, "selectsList[position]");
      AppMethodBeat.o(110042);
      return localObject;
    }

    public final long getItemId(int paramInt)
    {
      return 0L;
    }

    @SuppressLint({"SetTextI18n"})
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(110043);
      j.p(paramViewGroup, "parent");
      paramView = new TextView((Context)this.sfc);
      paramViewGroup = getItem(paramInt);
      if (paramViewGroup == null)
      {
        paramView = new v("null cannot be cast to non-null type com.tencent.mm.plugin.story.ui.StorySettingsUI.ITestMenu");
        AppMethodBeat.o(110043);
        throw paramView;
      }
      paramViewGroup = (StorySettingsUI.e)paramViewGroup;
      paramView.setText((CharSequence)(paramViewGroup.Op() + "->:" + paramViewGroup.Oq()));
      paramView.setGravity(17);
      paramView.setTextSize(1, 20.0F);
      paramView.setHeight(com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 50));
      if (paramInt % 2 == 1)
        paramView.setBackgroundColor(Color.parseColor("#e2efda"));
      paramView.setOnClickListener((View.OnClickListener)new StorySettingsUI.a.a(paramViewGroup, paramView));
      paramView = (View)paramView;
      AppMethodBeat.o(110043);
      return paramView;
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "whichButton", "", "<anonymous parameter 1>", "onClick"})
  static final class b$a
    implements h.d
  {
    b$a(StorySettingsUI.b paramb)
    {
    }

    public final void bV(int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(110044);
      Object localObject1;
      Object localObject2;
      try
      {
        localObject1 = this.sfg.sff;
        if (!(localObject1 instanceof long[]))
          break label145;
        StoryCaptureProxy localStoryCaptureProxy1 = StorySettingsUI.a(this.sfg.sfc);
        if (localStoryCaptureProxy1 == null)
          j.dWJ();
        localObject1 = this.sfg.oDw;
        localObject2 = this.sfg.sff;
        if (localObject2 != null)
          break label108;
        localObject1 = new a/v;
        ((v)localObject1).<init>("null cannot be cast to non-null type kotlin.LongArray");
        AppMethodBeat.o(110044);
        throw ((Throwable)localObject1);
      }
      catch (Exception localException)
      {
        localObject1 = StorySettingsUI.sfb;
        ab.printErrStackTrace(StorySettingsUI.access$getTAG$cp(), (Throwable)localException, "", new Object[0]);
        AppMethodBeat.o(110044);
      }
      return;
      label108: localException.set((ac.a)localObject1, Long.valueOf(((long[])localObject2)[paramInt1]));
      while (true)
      {
        StorySettingsUI.b(this.sfg.sfc).notifyDataSetChanged();
        AppMethodBeat.o(110044);
        break;
        label145: if ((localObject1 instanceof int[]))
        {
          StoryCaptureProxy localStoryCaptureProxy2 = StorySettingsUI.a(this.sfg.sfc);
          if (localStoryCaptureProxy2 == null)
            j.dWJ();
          localObject1 = this.sfg.oDw;
          localObject2 = this.sfg.sff;
          if (localObject2 == null)
          {
            localObject1 = new a/v;
            ((v)localObject1).<init>("null cannot be cast to non-null type kotlin.IntArray");
            AppMethodBeat.o(110044);
            throw ((Throwable)localObject1);
          }
          localStoryCaptureProxy2.set((ac.a)localObject1, Integer.valueOf(((int[])localObject2)[paramInt1]));
        }
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/StorySettingsUI$initOnCreate$1", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "plugin-story_release"})
  public static final class f
    implements View.OnClickListener
  {
    public final void onClick(View paramView)
    {
      AppMethodBeat.i(110051);
      new h();
      h.cxI();
      AppMethodBeat.o(110051);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StorySettingsUI
 * JD-Core Version:    0.6.2
 */