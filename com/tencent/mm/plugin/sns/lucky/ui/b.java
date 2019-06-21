package com.tencent.mm.plugin.sns.lucky.ui;

import android.content.Context;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.l.a.a;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ata;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.wallet_core.ui.e;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public final class b extends BaseAdapter
{
  private final String TAG;
  private Context mContext;
  private LayoutInflater mInflater;
  private int nSA;
  List<a.a> nSx;

  public b(Context paramContext)
  {
    AppMethodBeat.i(45190);
    this.TAG = "SnsLuckyMoneyReceivedRecordListAdapter";
    this.nSx = new ArrayList();
    this.nSA = 1;
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    AppMethodBeat.o(45190);
  }

  private a.a CO(int paramInt)
  {
    AppMethodBeat.i(45192);
    a.a locala = (a.a)this.nSx.get(paramInt);
    AppMethodBeat.o(45192);
    return locala;
  }

  public final int getCount()
  {
    AppMethodBeat.i(45191);
    int i = this.nSx.size();
    AppMethodBeat.o(45191);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(45193);
    b.a locala;
    if (paramView == null)
    {
      paramViewGroup = this.mInflater.inflate(2130970773, paramViewGroup, false);
      locala = new b.a(this);
      locala.kEn = ((ImageView)paramViewGroup.findViewById(2131825654));
      locala.niS = ((TextView)paramViewGroup.findViewById(2131825655));
      locala.nSC = ((TextView)paramViewGroup.findViewById(2131825659));
      locala.nSD = ((TextView)paramViewGroup.findViewById(2131825656));
      locala.nSH = ((TextView)paramViewGroup.findViewById(2131825661));
      paramViewGroup.setTag(locala);
    }
    while (true)
    {
      a.a locala1 = CO(paramInt);
      com.tencent.mm.kernel.g.RQ();
      ad localad = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(locala1.igi);
      label164: long l1;
      Object localObject;
      if (locala1.igi != null)
      {
        a.b.r(locala.kEn, locala1.igi);
        TextView localTextView = locala.nSC;
        paramView = this.mContext;
        l1 = locala1.nRz * 1000L;
        localObject = new GregorianCalendar();
        if (l1 >= 3600000L)
          break label386;
        paramView = "";
        label209: localTextView.setText(paramView);
        locala.nSC.setVisibility(0);
        if (localad == null)
          break label508;
        x.a(this.mContext, locala.niS, localad.Oj());
        label246: paramView = new ata();
      }
      try
      {
        if ((locala1.nRA != null) && (locala1.nRA.getILen() > 0))
        {
          paramView.parseFrom(aa.a(locala1.nRA));
          if (paramView.cSh > 0L)
          {
            paramView = this.mContext.getString(2131301173, new Object[] { e.F(paramView.cSh / 100.0D) });
            locala.nSD.setText(paramView);
            locala.nSH.setVisibility(8);
          }
          while (true)
          {
            AppMethodBeat.o(45193);
            return paramViewGroup;
            locala = (b.a)paramView.getTag();
            paramViewGroup = paramView;
            break;
            ab.e("SnsLuckyMoneyReceivedRecordListAdapter", "the contact is null,by username:%s", new Object[] { locala1.igi });
            break label164;
            label386: long l2 = l1 - new GregorianCalendar(((GregorianCalendar)localObject).get(1), ((GregorianCalendar)localObject).get(2), ((GregorianCalendar)localObject).get(5)).getTimeInMillis();
            if ((l2 > 0L) && (l2 <= 86400000L))
            {
              paramView = new SimpleDateFormat("HH:mm").format(new Date(l1));
              break label209;
            }
            localObject = new Time();
            ((Time)localObject).set(l1);
            paramView = com.tencent.mm.pluginsdk.f.g.a(paramView.getString(2131299935, new Object[] { " " }), (Time)localObject).toString();
            break label209;
            label508: ab.e("SnsLuckyMoneyReceivedRecordListAdapter", "the contact is null,by username:%s", new Object[] { locala1.igi });
            break label246;
            locala.nSD.setVisibility(8);
            locala.nSH.setVisibility(0);
          }
        }
      }
      catch (Exception paramView)
      {
        while (true)
        {
          ab.e("SnsLuckyMoneyReceivedRecordListAdapter", paramView.getMessage() + "hbBuffer is error");
          locala.nSD.setVisibility(8);
          locala.nSH.setVisibility(8);
          locala.kEn.setVisibility(8);
          locala.niS.setVisibility(8);
          locala.nSC.setVisibility(8);
          continue;
          locala.nSD.setVisibility(8);
          locala.nSH.setVisibility(0);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.lucky.ui.b
 * JD-Core Version:    0.6.2
 */