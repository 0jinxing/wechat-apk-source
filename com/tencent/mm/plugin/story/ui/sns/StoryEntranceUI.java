package com.tencent.mm.plugin.story.ui.sns;

import a.l;
import a.v;
import a.y;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.i;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.story.h.f;
import com.tencent.mm.plugin.story.model.f.a;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "()V", "TYPE_TIP", "", "getTYPE_TIP", "()I", "TYPE_USERNAME", "getTYPE_USERNAME", "entranceAdapter", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI$EntranceAdapter;", "entranceRecycler", "Landroid/support/v7/widget/RecyclerView;", "readNameList", "", "", "kotlin.jvm.PlatformType", "", "storyTypeIndex", "userNameList", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI$DataObject;", "finish", "", "getLayoutId", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNotifyChange", "event", "eventData", "Lcom/tencent/mm/sdk/storage/MStorageEventData;", "Companion", "DataObject", "EntranceAdapter", "plugin-story_release"})
public final class StoryEntranceUI extends MMActivity
  implements k.a
{
  private static final String TAG = "MicroMsg.StoryEntranceUI";
  public static final StoryEntranceUI.a shv;
  private final int sho;
  private final int shp;
  private RecyclerView shq;
  private StoryEntranceUI.c shr;
  private int shs;
  private List<StoryEntranceUI.b> sht;
  private List<String> shu;

  static
  {
    AppMethodBeat.i(110265);
    shv = new StoryEntranceUI.a((byte)0);
    TAG = "MicroMsg.StoryEntranceUI";
    AppMethodBeat.o(110265);
  }

  public StoryEntranceUI()
  {
    AppMethodBeat.i(110264);
    this.sho = 1;
    this.shp = 2;
    this.shs = -1;
    this.sht = Collections.synchronizedList((List)new LinkedList());
    this.shu = Collections.synchronizedList((List)new LinkedList());
    AppMethodBeat.o(110264);
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(110263);
    if ((paramString != null) && (paramm != null) && ((paramm.obj instanceof f)))
      switch (paramString.hashCode())
      {
      default:
      case 398324054:
      }
    while (true)
    {
      ab.i(TAG, "unknown event ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(110263);
      while (true)
      {
        return;
        if (!paramString.equals("notify_story_read"))
          break;
        paramString = paramm.obj;
        if (paramString == null)
        {
          paramString = new v("null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
          AppMethodBeat.o(110263);
          throw paramString;
        }
        paramString = ((f)paramString).getUserName();
        this.shu.add(paramString);
        paramString = this.shr;
        if (paramString == null)
          a.f.b.j.avw("entranceAdapter");
        paramString.notifyDataSetChanged();
        AppMethodBeat.o(110263);
      }
    }
  }

  public final void finish()
  {
    AppMethodBeat.i(110262);
    ab.i(TAG, "finish " + this.shu.size());
    if (this.sht.size() > 0)
    {
      Object localObject1 = ((StoryEntranceUI.b)this.sht.get(0)).userName;
      Object localObject2 = com.tencent.mm.plugin.story.model.j.rST;
      localObject2 = j.a.cxU().aap((String)localObject1);
      if (localObject2 != null)
      {
        long l1 = ((f)localObject2).field_updateTime;
        long l2 = l1;
        if (l1 == 0L)
          l2 = ((f)localObject2).field_storyPostTime * 1000L;
        ab.i(TAG, "finish updateTime user:" + (String)localObject1 + " updateTime: " + l2);
        if (l2 > 0L)
        {
          localObject1 = com.tencent.mm.kernel.g.RP();
          a.f.b.j.o(localObject1, "MMKernel.storage()");
          ((e)localObject1).Ry().set(ac.a.xWS, Long.valueOf(l2));
        }
      }
    }
    super.finish();
    AppMethodBeat.o(110262);
  }

  public final int getLayoutId()
  {
    return 2130970883;
  }

  public final void onCreate(Bundle arg1)
  {
    AppMethodBeat.i(110260);
    ab.i(TAG, "StoryEntranceUI create ".concat(String.valueOf(this)));
    supportRequestWindowFeature(1);
    getWindow().addFlags(1024);
    super.onCreate(???);
    ??? = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cxU().c((k.a)this);
    setMMTitle(2131303779);
    setBackBtn((MenuItem.OnMenuItemClickListener)new StoryEntranceUI.d(this), 2131230735);
    ??? = findViewById(2131828147);
    a.f.b.j.o(???, "findViewById(R.id.story_entrance_recycler)");
    this.shq = ((RecyclerView)???);
    ??? = this.shq;
    if (??? == null)
      a.f.b.j.avw("entranceRecycler");
    ???.setLayoutManager((RecyclerView.i)new LinearLayoutManager());
    this.shr = new StoryEntranceUI.c(this);
    ??? = this.shq;
    if (??? == null)
      a.f.b.j.avw("entranceRecycler");
    ???.setItemViewCacheSize(0);
    ??? = this.shq;
    if (??? == null)
      a.f.b.j.avw("entranceRecycler");
    ??? = this.shr;
    if (??? == null)
      a.f.b.j.avw("entranceAdapter");
    ((RecyclerView)???).setAdapter((RecyclerView.a)???);
    ??? = this.shr;
    if (??? == null)
      a.f.b.j.avw("entranceAdapter");
    ???.seN = ((a.f.a.m)new StoryEntranceUI.e(this));
    ??? = a.rWL.cwY();
    ??? = a.rWL.cwZ();
    ab.i(TAG, "userNames " + ((List)???).size() + " lastUserNames " + ???.size());
    Object localObject4;
    StoryEntranceUI.b localb;
    synchronized ((Iterable)???)
    {
      Iterator localIterator = ((Iterable)???).iterator();
      if (localIterator.hasNext())
      {
        localObject4 = (String)localIterator.next();
        localObject5 = this.sht;
        localb = new com/tencent/mm/plugin/story/ui/sns/StoryEntranceUI$b;
        localb.<init>((String)localObject4, 1);
        ((List)localObject5).add(localb);
      }
    }
    Object localObject5 = y.AUy;
    this.shs = this.sht.size();
    if (???.size() > 0)
      this.sht.add(new StoryEntranceUI.b("", 2));
    synchronized ((Iterable)???)
    {
      localObject4 = ???.iterator();
      if (((Iterator)localObject4).hasNext())
      {
        ??? = (String)((Iterator)localObject4).next();
        localObject5 = this.sht;
        localb = new com/tencent/mm/plugin/story/ui/sns/StoryEntranceUI$b;
        localb.<init>((String)???, 1);
        ((List)localObject5).add(localb);
      }
    }
    Object localObject3 = y.AUy;
    localObject3 = this.shr;
    if (localObject3 == null)
      a.f.b.j.avw("entranceAdapter");
    ??? = this.sht;
    a.f.b.j.o(???, "userNameList");
    a.f.b.j.p(???, "extinfoList");
    ((StoryEntranceUI.c)localObject3).shw.clear();
    ((StoryEntranceUI.c)localObject3).shw.addAll((Collection)???);
    ((StoryEntranceUI.c)localObject3).notifyDataSetChanged();
    AppMethodBeat.o(110260);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(110261);
    super.onDestroy();
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cxU().d((k.a)this);
    AppMethodBeat.o(110261);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI$EntranceAdapter$EntranceViewTipHolder;", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI$EntranceAdapter$EntranceViewHolder;", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI$EntranceAdapter;", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI$EntranceAdapter;Landroid/view/View;)V", "contentTv", "Landroid/widget/TextView;", "getContentTv", "()Landroid/widget/TextView;", "onBind", "", "position", "", "data", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI$DataObject;", "plugin-story_release"})
  public final class c$b extends StoryEntranceUI.c.a
  {
    private final TextView gKl;

    public c$b()
    {
      super(localObject);
      AppMethodBeat.i(110249);
      this$1 = localObject.findViewById(2131821051);
      a.f.b.j.o(StoryEntranceUI.this, "itemView.findViewById(R.id.tip_tv)");
      this.gKl = ((TextView)StoryEntranceUI.this);
      localObject.setOnClickListener((View.OnClickListener)StoryEntranceUI.c.b.1.shz);
      AppMethodBeat.o(110249);
    }

    public final void a(StoryEntranceUI.b paramb)
    {
      AppMethodBeat.i(110248);
      a.f.b.j.p(paramb, "data");
      this.gKl.setText(2131303781);
      AppMethodBeat.o(110248);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.sns.StoryEntranceUI
 * JD-Core Version:    0.6.2
 */