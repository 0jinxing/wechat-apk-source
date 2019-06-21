package com.tencent.mm.plugin.story.ui.sns;

import a.f.a.m;
import a.l;
import a.v;
import a.y;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ru;
import com.tencent.mm.g.b.a.ao;
import com.tencent.mm.g.b.a.ap;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.story.f.h.a;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.ui.view.gallery.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/plugin/story/ui/sns/DialogLifeStyle;", "context", "Landroid/content/Context;", "click", "Landroid/view/View$OnClickListener;", "(Landroid/content/Context;Landroid/view/View$OnClickListener;)V", "clearTxt", "Landroid/widget/TextView;", "entranceAdapter", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView$EntranceAdapter;", "entranceRecycler", "Landroid/support/v7/widget/RecyclerView;", "noDataView", "Landroid/view/View;", "replyToIndexMap", "Ljava/util/LinkedHashMap;", "", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "shouldClear", "", "storyClearReport", "Lcom/tencent/mm/autogen/mmdata/rpt/StoryEntranceExposeCleanStruct;", "storyTypeNewIndex", "", "storyTypeOlderIndex", "storyTypeReplyCount", "userNameList", "", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView$DataObject;", "kotlin.jvm.PlatformType", "", "finish", "", "hideContent", "showContent", "Companion", "DataObject", "EntranceAdapter", "plugin-story_release"})
public final class c extends LinearLayout
  implements a
{
  public static final c.a shK;
  private c.c shB;
  private int shC;
  private int shD;
  private int shE;
  private View shF;
  private TextView shG;
  private boolean shH;
  private ao shI;
  private LinkedHashMap<String, ArrayList<Long>> shJ;
  private RecyclerView shq;
  private List<c.b> sht;

  static
  {
    AppMethodBeat.i(110282);
    shK = new c.a((byte)0);
    AppMethodBeat.o(110282);
  }

  public c(Context arg1, View.OnClickListener arg2)
  {
    super(???);
    AppMethodBeat.i(110281);
    this.shC = -1;
    this.shD = -1;
    this.shE = -1;
    this.sht = Collections.synchronizedList((List)new LinkedList());
    this.shI = new ao();
    this.shJ = new LinkedHashMap();
    Object localObject1 = LayoutInflater.from(???).inflate(2130970883, (ViewGroup)this, true);
    ((View)localObject1).findViewById(2131828144).setOnClickListener(???);
    Object localObject2 = ((View)localObject1).findViewById(2131828146);
    a.f.b.j.o(localObject2, "parent.findViewById<View>(R.id.no_data)");
    this.shF = ((View)localObject2);
    localObject2 = ((View)localObject1).findViewById(2131828145);
    a.f.b.j.o(localObject2, "parent.findViewById<TextView>(R.id.clear_txt)");
    this.shG = ((TextView)localObject2);
    this.shG.setOnClickListener((View.OnClickListener)new c.1(this));
    localObject1 = ((View)localObject1).findViewById(2131828147);
    a.f.b.j.o(localObject1, "parent.findViewById(R.id.story_entrance_recycler)");
    this.shq = ((RecyclerView)localObject1);
    this.shq.setLayoutManager((RecyclerView.i)new LinearLayoutManager());
    this.shB = new c.c(this);
    this.shq.setItemViewCacheSize(0);
    this.shq.setAdapter((RecyclerView.a)this.shB);
    this.shB.seN = ((m)new c.2(this, ???, ???));
    ??? = com.tencent.mm.plugin.story.model.f.a.rWL.cwY();
    localObject1 = com.tencent.mm.plugin.story.model.f.a.rWL.cwZ();
    this.shJ = com.tencent.mm.plugin.story.model.f.a.rWL.cxa();
    if (((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lGe, 1) == 1)
    {
      if (((Collection)???).isEmpty())
        break label568;
      i = 1;
      if (i == 0)
        break label574;
      ??? = com.tencent.mm.plugin.story.f.h.rZx;
      ??? = h.a.bt((String)???.get(0), false);
      if (??? != null)
      {
        localObject2 = n.sqi;
        n.q(a.a.j.listOf(???.rVZ), 5);
      }
    }
    label354: ab.i("MicroMsg.StoryEntranceView", "userNames " + ???.size() + " lastUserNames " + ((List)localObject1).size());
    if (!((Map)this.shJ).isEmpty());
    Object localObject3;
    Object localObject4;
    Object localObject5;
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        this.sht.add(new c.b("", 4));
        this.shE = (this.shJ.size() + 1);
      }
      ??? = this.shJ.entrySet();
      a.f.b.j.o(???, "replyToIndexMap.entries");
      synchronized ((Iterable)???)
      {
        localObject3 = ???.iterator();
        if (!((Iterator)localObject3).hasNext())
          break label648;
        localObject4 = (Map.Entry)((Iterator)localObject3).next();
        localObject5 = this.sht;
        localObject2 = new com/tencent/mm/plugin/story/ui/sns/c$b;
        localObject4 = ((Map.Entry)localObject4).getKey();
        a.f.b.j.o(localObject4, "it.key");
        ((c.b)localObject2).<init>((String)localObject4, 5);
        ((List)localObject5).add(localObject2);
      }
      label568: i = 0;
      break;
      label574: if (!((Collection)localObject1).isEmpty());
      for (i = 1; ; i = 0)
      {
        if (i == 0)
          break label640;
        ??? = com.tencent.mm.plugin.story.f.h.rZx;
        ??? = h.a.bt((String)((List)localObject1).get(0), false);
        if (??? == null)
          break;
        localObject2 = n.sqi;
        n.q(a.a.j.listOf(???.rVZ), 5);
        break;
      }
      label640: break label354;
    }
    label648: localObject2 = y.AUy;
    if (!???.isEmpty())
    {
      this.shC = this.sht.size();
      this.sht.add(new c.b("", 3));
    }
    ??? = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAM().gL(???.size());
    ??? = "";
    while (true)
    {
      synchronized ((Iterable)???)
      {
        localObject2 = ???.iterator();
        if (((Iterator)localObject2).hasNext())
        {
          localObject3 = (String)((Iterator)localObject2).next();
          localObject4 = this.sht;
          localObject5 = new com/tencent/mm/plugin/story/ui/sns/c$b;
          ((c.b)localObject5).<init>((String)localObject3, 1);
          ((List)localObject4).add(localObject5);
          localObject5 = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
          a.f.b.j.o(localObject5, "MMKernel.service(IMessengerStorage::class.java)");
          localObject5 = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject5).XM().aoO((String)localObject3);
          a.f.b.j.o(localObject5, "contact");
          if (((ad)localObject5).Oc())
          {
            localObject5 = com.tencent.mm.plugin.story.g.h.scu;
            localObject5 = com.tencent.mm.plugin.story.g.h.cAM();
            ((ap)localObject5).gM(((ap)localObject5).FC() + 1);
          }
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          ??? = ??? + '|' + (String)localObject3;
          continue;
        }
        localObject2 = y.AUy;
        if (((CharSequence)???).length() > 0)
        {
          i = 1;
          ??? = ???;
          if (i == 0)
            break label972;
          if (??? != null)
            break;
          ??? = new v("null cannot be cast to non-null type java.lang.String");
          AppMethodBeat.o(110281);
          throw ???;
        }
      }
      i = 0;
    }
    ??? = ???.substring(1);
    a.f.b.j.o(???, "(this as java.lang.String).substring(startIndex)");
    label972: ??? = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAM().fx(???);
    ??? = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAM().gN(((List)localObject1).size());
    this.shD = this.sht.size();
    if (!((Collection)localObject1).isEmpty())
    {
      i = 1;
      if (i != 0)
        this.sht.add(new c.b("", 2));
      ??? = "";
    }
    while (true)
    {
      synchronized ((Iterable)localObject1)
      {
        localObject1 = ???.iterator();
        if (((Iterator)localObject1).hasNext())
        {
          localObject2 = (String)((Iterator)localObject1).next();
          localObject3 = this.sht;
          localObject5 = new com/tencent/mm/plugin/story/ui/sns/c$b;
          ((c.b)localObject5).<init>((String)localObject2, 1);
          ((List)localObject3).add(localObject5);
          localObject3 = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
          a.f.b.j.o(localObject3, "MMKernel.service(IMessengerStorage::class.java)");
          localObject3 = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject3).XM().aoO((String)localObject2);
          a.f.b.j.o(localObject3, "contact");
          if (((ad)localObject3).Oc())
          {
            localObject3 = com.tencent.mm.plugin.story.g.h.scu;
            localObject3 = com.tencent.mm.plugin.story.g.h.cAM();
            ((ap)localObject3).gO(((ap)localObject3).FD() + 1);
          }
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ??? = ??? + '|' + (String)localObject2;
          continue;
          i = 0;
          break;
        }
        localObject1 = y.AUy;
        if (((CharSequence)???).length() > 0)
        {
          i = 1;
          ??? = ???;
          if (i == 0)
            break label1314;
          if (??? != null)
            break label1301;
          ??? = new v("null cannot be cast to non-null type java.lang.String");
          AppMethodBeat.o(110281);
          throw ???;
        }
      }
      i = 0;
    }
    label1301: ??? = ???.substring(1);
    a.f.b.j.o(???, "(this as java.lang.String).substring(startIndex)");
    label1314: ??? = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAM().fy(???);
    ??? = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAM().bD(this.shJ.size());
    ??? = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAN();
    ??? = this.shB;
    ??? = this.sht;
    a.f.b.j.o(???, "userNameList");
    a.f.b.j.p(???, "extInfoList");
    ???.shw.clear();
    ???.shw.addAll((Collection)???);
    ???.notifyDataSetChanged();
    ??? = this.shI;
    ??? = com.tencent.mm.plugin.story.g.h.scu;
    ???.bz(com.tencent.mm.plugin.story.g.h.cAL());
    AppMethodBeat.o(110281);
  }

  public final void finish()
  {
    AppMethodBeat.i(110280);
    Object localObject1 = this.shI;
    if (this.shH);
    for (long l = 1L; ; l = 0L)
    {
      ((ao)localObject1).bC(l);
      this.shI.ajK();
      if (!this.shH)
        break label228;
      localObject1 = com.tencent.mm.plugin.story.model.j.rST;
      com.tencent.mm.plugin.story.model.j.kZ(cb.aaE() + 10L);
      localObject1 = ((Map)this.shJ).entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        ((Map.Entry)localObject2).getKey();
        localObject3 = ((Iterable)((Map.Entry)localObject2).getValue()).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          l = ((Number)((Iterator)localObject3).next()).longValue();
          localObject2 = com.tencent.mm.plugin.story.model.b.b.rVw;
          com.tencent.mm.plugin.story.model.b.b.lc(l);
        }
      }
    }
    localObject1 = com.tencent.mm.kernel.g.RP();
    a.f.b.j.o(localObject1, "MMKernel.storage()");
    Object localObject3 = ((e)localObject1).Ry();
    Object localObject2 = ac.a.xWT;
    localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    ((z)localObject3).set((ac.a)localObject2, Long.valueOf(j.a.cyh()));
    localObject1 = new ru();
    ((ru)localObject1).cNM.cNN = false;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
    label228: ab.i("MicroMsg.StoryEntranceView", "finish");
    if (this.sht.size() > 0)
    {
      localObject1 = com.tencent.mm.kernel.g.RP();
      a.f.b.j.o(localObject1, "MMKernel.storage()");
      ((e)localObject1).Ry().set(ac.a.xWS, Long.valueOf(cb.aaE()));
    }
    localObject1 = com.tencent.mm.plugin.story.model.f.a.rWL;
    com.tencent.mm.plugin.story.model.f.a.czh();
    AppMethodBeat.o(110280);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.sns.c
 * JD-Core Version:    0.6.2
 */