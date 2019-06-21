package com.tencent.mm.ui.chatting.i;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView.v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.a.va;
import com.tencent.mm.g.a.va.b;
import com.tencent.mm.g.a.vb;
import com.tencent.mm.g.a.vb.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.chatting.a.c.a;
import com.tencent.mm.ui.chatting.a.c.c;
import com.tencent.mm.ui.chatting.a.c.e;
import com.tencent.mm.ui.chatting.e.b.b;
import com.tencent.mm.ui.chatting.f;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public final class g extends b
{
  int eot = -1;

  public g(Context paramContext)
  {
    super(paramContext);
  }

  public static boolean pY(int paramInt)
  {
    AppMethodBeat.i(32632);
    boolean bool;
    if ((bo.ank("1001") == paramInt) || (bo.ank("1002") == paramInt) || (419430449 == paramInt))
    {
      bool = true;
      AppMethodBeat.o(32632);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(32632);
    }
  }

  public final void a(c.a parama, int paramInt)
  {
    AppMethodBeat.i(32638);
    g.b localb = (g.b)parama;
    parama = (g.a)Oy(paramInt);
    if (bo.isNullOrNil(parama.desc))
      localb.gnC.setVisibility(8);
    while (true)
    {
      paramInt = com.tencent.mm.bz.a.fromDPToPix(this.mContext, 6);
      localb.iqT.setPadding(paramInt, paramInt, paramInt, paramInt);
      localb.iqT.setImageResource(parama.iconRes);
      localb.iqT.setBackgroundColor(parama.yZz);
      AppMethodBeat.o(32638);
      return;
      localb.gnC.setVisibility(0);
      localb.gnC.setText(bo.bc(parama.desc, ""));
    }
  }

  public final String aoy()
  {
    AppMethodBeat.i(32634);
    String str = this.mContext.getString(2131302811);
    AppMethodBeat.o(32634);
    return str;
  }

  public final void dFH()
  {
    AppMethodBeat.i(32633);
    this.yYY.dFL();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RS().aa(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(32627);
        LinkedList localLinkedList = new LinkedList();
        aw.ZK();
        Cursor localCursor = com.tencent.mm.model.c.XO().cD(g.this.emo, g.this.eot);
        if (localCursor == null)
        {
          ab.e("MicroMsg.PayHistoryListPresenter", "[loadData] cursor is null!");
          AppMethodBeat.o(32627);
          label58: return;
        }
        if (t.kH(g.this.emo))
          aw.ZK();
        label1044: label1050: for (u localu = com.tencent.mm.model.c.XV().oa(g.this.emo); ; localu = null)
        {
          long l1 = 0L;
          label95: bi localbi;
          Object localObject3;
          ad localad;
          Object localObject4;
          boolean bool;
          while (true)
          {
            try
            {
              if (!localCursor.moveToNext())
                break label1304;
              localbi = new com/tencent/mm/storage/bi;
              localbi.<init>();
              localbi.d(localCursor);
              Object localObject1 = localbi.field_content;
              if (localObject1 == null)
                break label1360;
              localObject3 = j.b.X((String)localObject1, localbi.field_reserved);
              if ((!g.pY(bo.ank(((j.b)localObject3).fhY))) && (!g.pY(localbi.getType())))
                break label1360;
              localObject1 = g.b(localbi, t.kH(g.this.emo));
              localad = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO((String)localObject1);
              localObject4 = "";
              if (localu != null)
                localObject4 = localu.mJ((String)localObject1);
              if (!g.pY(localbi.getType()))
                break label852;
              localObject1 = new com/tencent/mm/ui/chatting/i/g$a;
              ((g.a)localObject1).<init>(g.this, localbi.field_createTime, localbi.getType(), ((j.b)localObject3).fhw, localbi.field_msgId, localad.field_username, localad.Oi(), localad.field_conRemark, (String)localObject4);
              localObject4 = new com/tencent/mm/g/a/vb;
              ((vb)localObject4).<init>();
              ((vb)localObject4).cRW.cEa = ((j.b)localObject3).fhy;
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject4);
              if (localbi.field_isSend == 1)
              {
                bool = ((vb)localObject4).cRX.cRY;
                if (((vb)localObject4).cRX.status == -2)
                  bool = false;
                if (bool)
                  break;
                ab.i("MicroMsg.PayHistoryListPresenter", "[loadData] it's not payer! isSend:%s, status:%s pass this msg:%s date:%s item:%s", new Object[] { Boolean.valueOf(((vb)localObject4).cRX.cRY), Integer.valueOf(((vb)localObject4).cRX.status), Long.valueOf(localbi.field_msgId), g.this.yYZ.ha(((g.a)localObject1).timestamp), ((g.a)localObject1).toString() });
                continue;
              }
            }
            finally
            {
              localCursor.close();
              AppMethodBeat.o(32627);
            }
            if (!((vb)localObject4).cRX.cRY)
              bool = true;
            else
              bool = false;
          }
          int i = ((vb)localObject4).cRX.status;
          int j = i;
          if (i <= 0)
            j = ((j.b)localObject3).fhv;
          localObject2.nickname = g.this.mContext.getResources().getString(2131303905, new Object[] { localObject2.nickname });
          switch (j)
          {
          case 2:
          default:
            i = -352966;
            label585: localObject2.yZz = i;
            localObject2.desc = g.a(g.this, g.this.mContext, localbi, (j.b)localObject3, bool, j);
            localObject4 = g.this.mContext;
            if ((localObject3 == null) || (localObject4 == null))
            {
              i = 2131231040;
              localObject2.iconRes = i;
              localObject4 = new java/util/Date;
              ((Date)localObject4).<init>(localbi.field_createTime);
              long l2 = com.tencent.mm.ui.gridviewheaders.a.dJg().b((Date)localObject4);
              if (l1 != l2)
              {
                localObject4 = new com/tencent/mm/ui/chatting/a/c$c;
                ((c.c)localObject4).<init>(localbi.field_createTime);
                localLinkedList.add(localObject4);
              }
              localLinkedList.add(localObject2);
              l1 = l2;
            }
            break;
          case 1:
          case 7:
          case 3:
          case 4:
          case 5:
          case 6:
          }
          label975: label1360: 
          while (true)
          {
            break label95;
            i = -352966;
            break label585;
            i = -470621;
            break label585;
            i = -470621;
            break label585;
            i = -470621;
            break label585;
            i = -470621;
            break label585;
            switch (j)
            {
            case 2:
            default:
              i = 2131231040;
              break;
            case 1:
            case 7:
              i = 2131231040;
              break;
            case 3:
              i = 2131231041;
              break;
            case 4:
              i = 2131231042;
              break;
            case 5:
              i = 2131231041;
              break;
            case 6:
              i = 2131231039;
              break;
              label852: g.a locala = new com/tencent/mm/ui/chatting/i/g$a;
              locala.<init>(g.this, localbi.field_createTime, localbi.getType(), ((j.b)localObject3).fhT, localbi.field_msgId, localad.field_username, localad.Oi(), localad.field_conRemark, (String)localObject4);
              locala.yZy = bo.ank(((j.b)localObject3).fhY);
              if (locala.yZy == bo.ank("1001"))
              {
                locala.nickname = g.this.mContext.getResources().getString(2131303903, new Object[] { locala.nickname });
                if (localbi.field_isSend == 1)
                {
                  bool = true;
                  locala.desc = f.b((j.b)localObject3, bool);
                  if (localbi.field_isSend != 1)
                    break label1044;
                  bool = true;
                  label999: locala.yZz = f.d((j.b)localObject3, bool);
                  if (localbi.field_isSend != 1)
                    break label1050;
                }
                for (bool = true; ; bool = false)
                {
                  locala.iconRes = f.a((j.b)localObject3, bool);
                  break;
                  bool = false;
                  break label975;
                  bool = false;
                  break label999;
                }
              }
              localObject4 = new com/tencent/mm/g/a/va;
              ((va)localObject4).<init>();
              ((va)localObject4).cRQ.cRS = ((j.b)localObject3).fhZ;
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject4);
              locala.nickname = g.this.mContext.getResources().getString(2131303904, new Object[] { locala.nickname });
              i = ((va)localObject4).cRR.cRT;
              int k = ((va)localObject4).cRR.cRU;
              j = ((va)localObject4).cRR.cRV;
              if (localbi.field_isSend == 1)
              {
                bool = true;
                locala.desc = f.a(i, k, j, bool, t.kH(g.this.emo));
                localObject3 = (com.tencent.mm.af.c)((j.b)localObject3).X(com.tencent.mm.af.c.class);
                i = g.this.mContext.getResources().getIdentifier(((com.tencent.mm.af.c)localObject3).ffN, "drawable", ah.getPackageName());
                j = ((va)localObject4).cRR.cRU;
                k = ((va)localObject4).cRR.cRV;
                if (localbi.field_isSend != 1)
                  break label1298;
              }
              for (bool = true; ; bool = false)
              {
                locala.iconRes = f.w(j, k, bool);
                if (locala.iconRes <= 0)
                  locala.iconRes = i;
                break;
                bool = false;
                break label1163;
              }
              localCursor.close();
              g.this.iPr.addAll(localLinkedList);
              g.this.yZa = g.this.iPr;
              localLinkedList.clear();
              al.d(new g.1.1(this));
              AppMethodBeat.o(32627);
              break label58;
            }
          }
        }
      }
    });
    AppMethodBeat.o(32633);
  }

  public final c.e dFI()
  {
    AppMethodBeat.i(32636);
    g.2 local2 = new g.2(this);
    AppMethodBeat.o(32636);
    return local2;
  }

  public final String dFK()
  {
    AppMethodBeat.i(32635);
    String str = this.mContext.getString(2131302811);
    AppMethodBeat.o(32635);
    return str;
  }

  public final int getType()
  {
    return 5;
  }

  public final RecyclerView.v v(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(32637);
    paramViewGroup = new g.b(this, LayoutInflater.from(paramViewGroup.getContext()).inflate(2130969547, paramViewGroup, false));
    AppMethodBeat.o(32637);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.g
 * JD-Core Version:    0.6.2
 */