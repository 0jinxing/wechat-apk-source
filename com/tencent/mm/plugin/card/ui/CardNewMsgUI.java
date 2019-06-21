package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.b.k;
import com.tencent.mm.plugin.card.b.k.a;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.g;
import com.tencent.mm.plugin.card.model.g.a;
import com.tencent.mm.plugin.card.model.g.b;
import com.tencent.mm.protocal.protobuf.nm;
import com.tencent.mm.protocal.protobuf.nz;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.v;
import java.util.List;

public class CardNewMsgUI extends MMActivity
  implements k.a
{
  private View Ek;
  View.OnClickListener gKK;
  private a kmR;
  private View kmS;
  private View kmT;
  private boolean kmU;
  private ListView mListView;

  public CardNewMsgUI()
  {
    AppMethodBeat.i(88610);
    this.kmT = null;
    this.kmU = false;
    this.gKK = new CardNewMsgUI.9(this);
    AppMethodBeat.o(88610);
  }

  private void au(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(88615);
    Intent localIntent = new Intent(this, CardDetailUI.class);
    localIntent.putExtra("key_card_id", paramString);
    localIntent.putExtra("key_is_share_card", paramBoolean);
    localIntent.putExtra("key_from_scene", 4);
    startActivity(localIntent);
    AppMethodBeat.o(88615);
  }

  private void bbB()
  {
    AppMethodBeat.i(88614);
    if (am.bba().getCount() > 0)
    {
      this.mListView.setVisibility(0);
      this.Ek.setVisibility(8);
      enableOptionMenu(true);
    }
    while (true)
    {
      this.kmR.notifyDataSetChanged();
      AppMethodBeat.o(88614);
      return;
      this.mListView.setVisibility(8);
      this.Ek.setVisibility(0);
      enableOptionMenu(false);
    }
  }

  public final void a(g paramg)
  {
    AppMethodBeat.i(88616);
    if (((paramg.field_msg_type & 0x1) == 0) || ((paramg.field_msg_type & 0x3) == 0))
      AppMethodBeat.o(88616);
    while (true)
    {
      return;
      bbB();
      this.kmR.a(null, null);
      AppMethodBeat.o(88616);
    }
  }

  public final void aVU()
  {
  }

  public final int getLayoutId()
  {
    return 2130968958;
  }

  public final void initView()
  {
    AppMethodBeat.i(88613);
    setMMTitle(2131297930);
    setBackBtn(new CardNewMsgUI.1(this));
    this.mListView = ((ListView)findViewById(2131822244));
    this.kmR = new a();
    this.mListView.setAdapter(this.kmR);
    this.mListView.setOnItemClickListener(new CardNewMsgUI.2(this));
    this.mListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(88594);
        CardNewMsgUI.b(CardNewMsgUI.this, paramAnonymousInt);
        AppMethodBeat.o(88594);
        return true;
      }
    });
    this.mListView.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }

      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        AppMethodBeat.i(88595);
        if (!CardNewMsgUI.b(CardNewMsgUI.this))
          AppMethodBeat.o(88595);
        while (true)
        {
          return;
          if (paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1)
          {
            if (am.baY().baS() > 0)
              am.baY().baT();
            while (true)
            {
              CardNewMsgUI.a(CardNewMsgUI.this).a(null, null);
              AppMethodBeat.o(88595);
              break;
              CardNewMsgUI.a(CardNewMsgUI.this).bdo();
            }
          }
          AppMethodBeat.o(88595);
        }
      }
    });
    this.kmR.a(new CardNewMsgUI.5(this));
    addTextOptionMenu(0, getString(2131297812), new CardNewMsgUI.6(this));
    this.Ek = findViewById(2131821926);
    bbB();
    this.kmS = v.hu(this).inflate(2130968955, null);
    this.kmT = v.hu(this).inflate(2130970112, null);
    int i = am.baY().baS();
    if (i > 0)
    {
      this.mListView.addFooterView(this.kmS);
      AppMethodBeat.o(88613);
    }
    while (true)
    {
      return;
      if ((!this.kmR.bdn()) && (i == 0) && (am.baY().getCount() > 0))
      {
        this.mListView.addFooterView(this.kmT);
        this.kmU = true;
        AppMethodBeat.o(88613);
      }
      else
      {
        if ((this.kmR.bdn()) && (i == 0))
          am.baY().getCount();
        AppMethodBeat.o(88613);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88611);
    super.onCreate(paramBundle);
    initView();
    am.bba().a(this);
    am.bba().baJ();
    AppMethodBeat.o(88611);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(88612);
    this.kmR.bIf();
    am.bba().b(this);
    if (am.baY().baS() > 0)
      am.baY().baT();
    super.onDestroy();
    AppMethodBeat.o(88612);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a extends p<g>
  {
    private int enb;
    private int kmW;

    public a()
    {
      super(new g());
      AppMethodBeat.i(88603);
      this.kmW = 10;
      this.enb = this.kmW;
      pN(true);
      AppMethodBeat.o(88603);
    }

    private void a(List<g.a> paramList, List<g.b> paramList1, CardNewMsgUI.b paramb, g paramg)
    {
      AppMethodBeat.i(88608);
      paramb.knl.removeAllViews();
      if (((paramList == null) || (paramList.size() == 0)) && ((paramList1 == null) || (paramList1.size() == 0)))
      {
        paramb.knm.setVisibility(8);
        AppMethodBeat.o(88608);
      }
      while (true)
      {
        return;
        int i;
        Object localObject1;
        Object localObject2;
        if (!bo.ek(paramList))
        {
          i = 0;
          if (i < paramList.size())
          {
            g.a locala = (g.a)paramList.get(i);
            localObject1 = View.inflate(CardNewMsgUI.this.mController.ylL, 2130968889, null);
            if (i == 0)
              ((View)localObject1).findViewById(2131821908).setVisibility(8);
            ((TextView)((View)localObject1).findViewById(2131821909)).setText(locala.title);
            ((TextView)((View)localObject1).findViewById(2131821910)).setText(locala.jcF);
            localObject2 = (Button)((View)localObject1).findViewById(2131821911);
            ((Button)localObject2).setOnClickListener(new CardNewMsgUI.a.1(this, locala, paramg));
            if (locala.kdC == 0)
              ((Button)localObject2).setText(2131297788);
            while (true)
            {
              paramb.knl.addView((View)localObject1);
              i++;
              break;
              if (locala.kdC == 1)
                ((Button)localObject2).setText(2131297789);
            }
          }
        }
        if (!bo.ek(paramList1))
          for (i = 0; i < paramList1.size(); i++)
          {
            localObject2 = (g.b)paramList1.get(i);
            paramg = View.inflate(CardNewMsgUI.this.mController.ylL, 2130968889, null);
            if ((i == 0) && (bo.ek(paramList)))
              paramg.findViewById(2131821908).setVisibility(8);
            ((TextView)paramg.findViewById(2131821909)).setText(((g.b)localObject2).title);
            ((TextView)paramg.findViewById(2131821910)).setText(((g.b)localObject2).description);
            localObject1 = (Button)paramg.findViewById(2131821911);
            ((Button)localObject1).setOnClickListener(new CardNewMsgUI.a.2(this, (g.b)localObject2));
            ((Button)localObject1).setText(((g.b)localObject2).kdE);
            paramb.knl.addView(paramg);
          }
        paramb.knm.setVisibility(0);
        AppMethodBeat.o(88608);
      }
    }

    public final void KC()
    {
      AppMethodBeat.i(88604);
      if (am.baY().baS() > 0)
        setCursor(am.baY().bSd.rawQuery("select * from CardMsgInfo where read_state = ?  order by time desc", new String[] { "1" }));
      while (true)
      {
        notifyDataSetChanged();
        AppMethodBeat.o(88604);
        return;
        this.enb = am.baY().getCount();
        com.tencent.mm.plugin.card.model.h localh = am.baY();
        String str = "select * from CardMsgInfo order by time desc LIMIT ".concat(String.valueOf(this.kmW));
        setCursor(localh.bSd.rawQuery(str, null));
      }
    }

    public final void KD()
    {
      AppMethodBeat.i(88605);
      bIf();
      KC();
      AppMethodBeat.o(88605);
    }

    public final boolean bdn()
    {
      if (this.kmW >= this.enb);
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public final int bdo()
    {
      AppMethodBeat.i(88606);
      int i;
      if (bdn())
      {
        if (CardNewMsgUI.e(CardNewMsgUI.this).getParent() != null)
          CardNewMsgUI.d(CardNewMsgUI.this).removeFooterView(CardNewMsgUI.e(CardNewMsgUI.this));
        i = 0;
        AppMethodBeat.o(88606);
      }
      while (true)
      {
        return i;
        this.kmW += 10;
        if (this.kmW <= this.enb)
        {
          i = 10;
          AppMethodBeat.o(88606);
        }
        else
        {
          this.kmW = this.enb;
          i = this.enb % 10;
          AppMethodBeat.o(88606);
        }
      }
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(88607);
      g localg = (g)getItem(paramInt);
      int i;
      if (paramView == null)
      {
        paramView = View.inflate(CardNewMsgUI.this.mController.ylL, 2130968956, null);
        paramViewGroup = new CardNewMsgUI.b(CardNewMsgUI.this, (byte)0);
        paramViewGroup.knb = ((ImageView)paramView.findViewById(2131822233));
        paramViewGroup.knc = paramView.findViewById(2131822208);
        paramViewGroup.knd = ((ImageView)paramView.findViewById(2131822209));
        paramViewGroup.kne = ((TextView)paramView.findViewById(2131821185));
        paramViewGroup.knf = ((TextView)paramView.findViewById(2131820988));
        paramViewGroup.kng = ((TextView)paramView.findViewById(2131822234));
        paramViewGroup.knh = ((TextView)paramView.findViewById(2131822235));
        paramViewGroup.kni = ((TextView)paramView.findViewById(2131822238));
        paramViewGroup.knj = paramView.findViewById(2131822239);
        paramViewGroup.knk = ((TextView)paramView.findViewById(2131822240));
        paramViewGroup.knl = ((LinearLayout)paramView.findViewById(2131822237));
        paramViewGroup.knm = ((LinearLayout)paramView.findViewById(2131822236));
        paramView.setTag(paramViewGroup);
        paramViewGroup.kne.setText(localg.field_title);
        long l = localg.field_time;
        paramViewGroup.knf.setText(com.tencent.mm.pluginsdk.f.h.c(CardNewMsgUI.this, l * 1000L, true));
        paramViewGroup.kng.setText(localg.field_description);
        i = CardNewMsgUI.this.getResources().getDimensionPixelSize(2131428187);
        ab.d("MicroMsg.CardNewMsgUI", "CardNewMsgUI getView () position : " + paramInt + " logo_url :  " + localg.field_logo_url);
        if (!TextUtils.isEmpty(localg.field_logo_color))
          break label562;
        paramViewGroup.knc.setVisibility(8);
        paramViewGroup.knb.setVisibility(0);
        paramViewGroup.knb.setImageResource(2130839644);
        m.a(paramViewGroup.knb, localg.field_logo_url, i, 2130839644, true);
        label377: Object localObject = localg.baM();
        if ((localObject == null) || (TextUtils.isEmpty(((nm)localObject).text)))
          break label677;
        paramViewGroup.knh.setText(((nm)localObject).text);
        paramViewGroup.knh.setTag(localg);
        paramViewGroup.knh.setVisibility(0);
        paramViewGroup.knh.setOnClickListener(CardNewMsgUI.this.gKK);
        label443: localObject = localg.baN();
        if ((localObject == null) || (TextUtils.isEmpty(((nz)localObject).text)))
          break label689;
        paramViewGroup.knk.setText(((nz)localObject).text);
        paramViewGroup.knj.setVisibility(0);
        paramViewGroup.knj.setOnClickListener(CardNewMsgUI.this.gKK);
        paramViewGroup.knj.setTag(localg);
        paramViewGroup.kni.setVisibility(0);
      }
      while (true)
      {
        localg.baO();
        localg.baP();
        a(localg.kdv, localg.kdw, paramViewGroup, localg);
        AppMethodBeat.o(88607);
        return paramView;
        paramViewGroup = (CardNewMsgUI.b)paramView.getTag();
        break;
        label562: ab.d("MicroMsg.CardNewMsgUI", "CardNewMsgUI getView () position : " + paramInt + " field_logo_color :  " + localg.field_logo_color);
        paramViewGroup.knc.setVisibility(0);
        paramViewGroup.knb.setVisibility(8);
        if (!TextUtils.isEmpty(localg.field_logo_url))
        {
          m.a(CardNewMsgUI.this, paramViewGroup.knd, localg.field_logo_url, i, l.Hn(localg.field_logo_color));
          break label377;
        }
        m.a(paramViewGroup.knd, 2130838129, l.Hn(localg.field_logo_color));
        break label377;
        label677: paramViewGroup.knh.setVisibility(8);
        break label443;
        label689: paramViewGroup.knj.setVisibility(8);
        paramViewGroup.kni.setVisibility(8);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardNewMsgUI
 * JD-Core Version:    0.6.2
 */