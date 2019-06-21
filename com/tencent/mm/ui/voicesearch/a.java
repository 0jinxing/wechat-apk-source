package com.tencent.mm.ui.voicesearch;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.database.MergeCursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bg.g;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.g.a.sz.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.br;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.applet.b.b;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SuppressLint({"DefaultLocale"})
public final class a extends p<ak>
{
  protected List<String> elZ;
  private String gtX;
  private com.tencent.mm.ui.applet.b gvm;
  private b.b gvn;
  private ColorStateList[] yDX;
  private HashMap<String, a.a> yDY;
  private a.b zLp;
  private boolean zrm;

  public a(Context paramContext, p.a parama)
  {
    super(paramContext, new ak());
    AppMethodBeat.i(35307);
    this.elZ = null;
    this.yDX = new ColorStateList[2];
    this.zrm = true;
    this.gvn = null;
    this.gvm = new com.tencent.mm.ui.applet.b(new a.1(this));
    super.a(parama);
    this.yDX[0] = com.tencent.mm.bz.a.h(paramContext, 2131690754);
    this.yDX[1] = com.tencent.mm.bz.a.h(paramContext, 2131690755);
    this.yDY = new HashMap();
    AppMethodBeat.o(35307);
  }

  private static int FB(String paramString)
  {
    int i = 1;
    AppMethodBeat.i(35312);
    int j = i;
    if (paramString != null)
    {
      j = i;
      if (paramString.length() <= 0);
    }
    try
    {
      j = Integer.valueOf(paramString).intValue();
      AppMethodBeat.o(35312);
      return j;
    }
    catch (NumberFormatException paramString)
    {
      while (true)
        j = i;
    }
  }

  public final void KC()
  {
    AppMethodBeat.i(35310);
    Cursor[] arrayOfCursor = new Cursor[2];
    arrayOfCursor[0] = aw.ZK().fkd.b(t.fkP, this.elZ, this.gtX);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    if ((this.elZ != null) && (this.elZ.size() > 0))
      localArrayList1.addAll(this.elZ);
    try
    {
      while (arrayOfCursor[0].moveToNext())
      {
        String str = arrayOfCursor[0].getString(arrayOfCursor[0].getColumnIndex("username"));
        localArrayList1.add(str);
        if (!t.kH(str))
          localArrayList2.add(str);
        ab.d("MicroMsg.SearchConversationAdapter", "block user ".concat(String.valueOf(str)));
      }
    }
    catch (Exception localException)
    {
      ab.printErrStackTrace("MicroMsg.SearchConversationAdapter", localException, "", new Object[0]);
      arrayOfCursor[1] = aw.ZK().fke.a(this.gtX, "@micromsg.with.all.biz.qq.com", localArrayList1, localArrayList2);
      setCursor(new MergeCursor(arrayOfCursor));
      if ((this.zLp != null) && (this.gtX != null))
        getCursor().getCount();
      super.notifyDataSetChanged();
      AppMethodBeat.o(35310);
    }
  }

  public final void KD()
  {
    AppMethodBeat.i(35309);
    KC();
    AppMethodBeat.o(35309);
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(35313);
    if ((paramString != null) && (!paramString.equals("")) && (this.yDY != null))
      this.yDY.remove(paramString);
    while (true)
    {
      super.a(paramString, paramm);
      AppMethodBeat.o(35313);
      return;
      if (this.yDY != null)
        this.yDY.clear();
    }
  }

  public final void fl(List<String> paramList)
  {
    AppMethodBeat.i(35308);
    this.elZ = paramList;
    a(null, null);
    AppMethodBeat.o(35308);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(35311);
    if (this.gvn == null)
      this.gvn = new b.b()
      {
        public final int apO()
        {
          AppMethodBeat.i(35306);
          int i = a.this.getCount();
          AppMethodBeat.o(35306);
          return i;
        }

        public final String mW(int paramAnonymousInt)
        {
          AppMethodBeat.i(35305);
          Object localObject;
          if ((paramAnonymousInt < 0) || (paramAnonymousInt >= a.this.getCount()))
          {
            ab.e("MicroMsg.SearchConversationAdapter", "pos is invalid");
            AppMethodBeat.o(35305);
            localObject = null;
          }
          while (true)
          {
            return localObject;
            localObject = (ak)a.this.getItem(paramAnonymousInt);
            if (localObject == null)
            {
              AppMethodBeat.o(35305);
              localObject = null;
            }
            else
            {
              localObject = ((at)localObject).field_username;
              AppMethodBeat.o(35305);
            }
          }
        }
      };
    if (this.gvm != null)
      this.gvm.a(paramInt, this.gvn);
    ak localak = (ak)getItem(paramInt);
    Object localObject1;
    Object localObject2;
    if ((FB(localak.field_msgType) == 34) && (localak.field_isSend == 0) && (!ah.isNullOrNil(localak.field_content)))
    {
      localObject1 = localak.field_content;
      if (!localak.field_username.equals("qmessage"))
      {
        paramViewGroup = (ViewGroup)localObject1;
        if (!localak.field_username.equals("floatbottle"));
      }
      else
      {
        localObject2 = ((String)localObject1).split(":");
        paramViewGroup = (ViewGroup)localObject1;
        if (localObject2 != null)
        {
          paramViewGroup = (ViewGroup)localObject1;
          if (localObject2.length > 3)
            paramViewGroup = localObject2[1] + ":" + localObject2[2] + ":" + localObject2[3];
        }
      }
      if (new com.tencent.mm.modelvoice.n(paramViewGroup).fWX);
    }
    for (int i = 1; ; i = 0)
    {
      label469: int j;
      int k;
      if (paramView == null)
      {
        localObject1 = new a.c();
        paramViewGroup = View.inflate(this.context, 2130970567, null);
        ((a.c)localObject1).ejo = ((ImageView)paramViewGroup.findViewById(2131821183));
        ((a.c)localObject1).ejp = ((TextView)paramViewGroup.findViewById(2131823149));
        ((a.c)localObject1).jJT = ((TextView)paramViewGroup.findViewById(2131823150));
        ((a.c)localObject1).jJU = ((TextView)paramViewGroup.findViewById(2131823151));
        ((a.c)localObject1).jJV = ((TextView)paramViewGroup.findViewById(2131821067));
        ((a.c)localObject1).jJV.setBackgroundResource(com.tencent.mm.ui.tools.r.ik(this.context));
        ((a.c)localObject1).yEf = ((ImageView)paramViewGroup.findViewById(2131823153));
        ((a.c)localObject1).yEg = ((ImageView)paramViewGroup.findViewById(2131823154));
        paramViewGroup.setTag(localObject1);
        localObject2 = (a.a)this.yDY.get(localak.field_username + localak.field_content);
        paramView = (View)localObject2;
        if (localObject2 == null)
        {
          localObject2 = new a.a(this, (byte)0);
          ((a.a)localObject2).nickName = j.b(this.context, s.mJ(localak.field_username), ((a.c)localObject1).ejp.getTextSize());
          if (localak.field_status != 1)
            break label1101;
          paramView = this.context.getString(2131301306);
          ((a.a)localObject2).zrH = paramView;
          j = (int)((a.c)localObject1).jJU.getTextSize();
          k = com.tencent.mm.model.r.YD();
          paramView = localak.field_username;
          aw.ZK();
          if (ah.h((Integer)c.Ry().get(17, null)) != 1)
            break label1136;
          paramInt = 1;
          label522: if ((!paramView.equals("qqmail")) || (paramInt != 0))
            break label1141;
          paramView = this.context.getString(2131303207);
          label547: ((a.a)localObject2).zrI = paramView;
          if ((t.kH(localak.field_username)) && (com.tencent.mm.model.n.mA(localak.field_username) == 0))
            ((a.a)localObject2).nickName = this.context.getString(2131298223);
        }
        switch (localak.field_status)
        {
        case 3:
        case 4:
        default:
          paramInt = -1;
          label634: ((a.a)localObject2).zrJ = paramInt;
          this.yDY.put(localak.field_username + localak.field_content, localObject2);
          paramView = (View)localObject2;
          ((a.c)localObject1).jJU.setTextColor(this.yDX[i]);
          ((a.c)localObject1).ejp.setText(paramView.nickName);
          ((a.c)localObject1).jJT.setText(paramView.zrH);
          ((a.c)localObject1).jJU.setText(j.b(this.context, paramView.zrI.toString(), ((a.c)localObject1).jJU.getTextSize()));
          if (localak.field_conversationTime == 0L)
          {
            ((a.c)localObject1).jJT.setVisibility(8);
            label770: ((a.c)localObject1).yEf.setVisibility(8);
            if (t.kH(localak.field_username))
            {
              aw.ZK();
              paramView = c.XM().aoO(localak.field_username);
              if ((paramView != null) && (paramView.dua == 0))
                ((a.c)localObject1).yEf.setVisibility(0);
            }
            com.tencent.mm.pluginsdk.ui.a.b.b(((a.c)localObject1).ejo, localak.field_username);
            if (this.zrm)
            {
              if (localak.field_unReadCount <= 100)
                break label1328;
              ((a.c)localObject1).jJV.setText("...");
              ((a.c)localObject1).jJV.setVisibility(0);
            }
            label879: if (aw.RK())
            {
              if (!t.a(localak))
              {
                aw.ZK();
                if (c.XR().g(localak))
                {
                  aw.ZK();
                  c.XR().f(localak);
                }
              }
              aw.ZK();
              if (c.XR().g(localak))
                break label1386;
              paramViewGroup.findViewById(2131823147).setBackgroundResource(2130838396);
            }
            label955: paramView = new sz();
            paramView.cPf.cPh = true;
            com.tencent.mm.sdk.b.a.xxA.m(paramView);
            if ((0L != com.tencent.mm.plugin.messenger.foundation.a.a.a.a(localak, 7, 0L)) && (!localak.field_username.equals(paramView.cPg.cPj)))
            {
              localak.eE(com.tencent.mm.plugin.messenger.foundation.a.a.a.a(localak, 6, localak.field_conversationTime));
              aw.ZK();
              c.XR().a(localak, localak.field_username);
            }
            if ((g.fUs != null) && (g.fUs.tN(localak.field_username)))
              break label1402;
            ((a.c)localObject1).yEg.setVisibility(8);
          }
          break;
        case 0:
        case 1:
        case 2:
        case 5:
        }
      }
      while (true)
      {
        AppMethodBeat.o(35311);
        return paramViewGroup;
        localObject1 = (a.c)paramView.getTag();
        paramViewGroup = paramView;
        break;
        label1101: if (localak.field_conversationTime == 9223372036854775807L)
        {
          paramView = "";
          break label469;
        }
        paramView = com.tencent.mm.pluginsdk.f.h.c(this.context, localak.field_conversationTime, true);
        break label469;
        label1136: paramInt = 0;
        break label522;
        label1141: aw.ZK();
        com.tencent.mm.storage.bq localbq = c.XU().RA("@t.qq.com");
        if ((localbq != null) && (localbq.isEnable()));
        for (paramInt = 1; ; paramInt = 0)
        {
          if ((!paramView.equals("tmessage")) || (paramInt != 0))
            break label1206;
          paramView = this.context.getString(2131303207);
          break;
        }
        label1206: if ((k & 0x40) != 0);
        for (paramInt = 1; ; paramInt = 0)
        {
          if ((!paramView.equals("qmessage")) || (paramInt != 0))
            break label1249;
          paramView = this.context.getString(2131303207);
          break;
        }
        label1249: paramView = j.b(this.context, com.tencent.mm.booter.notification.a.h.a(localak.field_isSend, localak.field_username, localak.field_content, FB(localak.field_msgType), this.context), j);
        break label547;
        paramInt = -1;
        break label634;
        paramInt = 2131231663;
        break label634;
        paramInt = -1;
        break label634;
        paramInt = 2131231662;
        break label634;
        ((a.c)localObject1).jJT.setVisibility(0);
        break label770;
        label1328: if (localak.field_unReadCount > 0)
        {
          ((a.c)localObject1).jJV.setText(localak.field_unReadCount);
          ((a.c)localObject1).jJV.setVisibility(0);
          break label879;
        }
        ((a.c)localObject1).jJV.setVisibility(4);
        break label879;
        label1386: paramViewGroup.findViewById(2131823147).setBackgroundResource(2130838395);
        break label955;
        label1402: ((a.c)localObject1).yEg.setVisibility(0);
        if (localak.field_username.equals(paramView.cPg.cPj))
          ((a.c)localObject1).yEg.setImageResource(2131232016);
        else
          ((a.c)localObject1).yEg.setImageResource(2131232015);
      }
    }
  }

  public final void vM(String paramString)
  {
    AppMethodBeat.i(35314);
    this.gtX = paramString;
    bIf();
    KC();
    AppMethodBeat.o(35314);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.a
 * JD-Core Version:    0.6.2
 */