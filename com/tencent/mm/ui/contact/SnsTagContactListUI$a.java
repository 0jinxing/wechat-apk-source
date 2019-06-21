package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.sns.b.k;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.MaskLayout;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class SnsTagContactListUI$a extends BaseAdapter
{
  private Context context;
  private bd rqa;
  private Map<Integer, a> zpn;
  private ColorStateList zpo;
  private ColorStateList zpp;
  private Map<Integer, String> zpv;

  public SnsTagContactListUI$a(Context paramContext, List<Long> paramList)
  {
    AppMethodBeat.i(33957);
    this.context = null;
    this.zpn = new HashMap();
    this.zpv = new HashMap();
    this.rqa = null;
    this.context = paramContext;
    this.zpn.clear();
    this.zpv.clear();
    aw.ZK();
    this.rqa = c.XM();
    Object localObject = paramList.iterator();
    int j;
    for (int i = 0; ((Iterator)localObject).hasNext(); i = j)
    {
      long l = ((Long)((Iterator)localObject).next()).longValue();
      paramList = n.qFA;
      j = i;
      if (paramList != null)
      {
        Iterator localIterator = paramList.jT(l).iterator();
        while (true)
        {
          j = i;
          if (!localIterator.hasNext())
            break;
          String str = (String)localIterator.next();
          a locala = new a();
          locala.setUsername(str);
          this.zpv.put(Integer.valueOf(this.zpn.size()), paramList.jU(l));
          this.zpn.put(Integer.valueOf(i), locala);
          i++;
        }
      }
    }
    try
    {
      localObject = paramContext.getResources().getXml(2131690750);
      paramList = paramContext.getResources().getXml(2131690751);
      this.zpo = ColorStateList.createFromXml(paramContext.getResources(), (XmlPullParser)localObject);
      this.zpp = ColorStateList.createFromXml(paramContext.getResources(), paramList);
      AppMethodBeat.o(33957);
      return;
    }
    catch (XmlPullParserException paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsTagContactList", paramContext, "", new Object[0]);
        AppMethodBeat.o(33957);
      }
    }
    catch (IOException paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsTagContactList", paramContext, "", new Object[0]);
        AppMethodBeat.o(33957);
      }
    }
  }

  private String Pq(int paramInt)
  {
    AppMethodBeat.i(33961);
    String str;
    if (!this.zpv.containsKey(Integer.valueOf(paramInt)))
    {
      str = "";
      AppMethodBeat.o(33961);
    }
    while (true)
    {
      return str;
      str = (String)this.zpv.get(Integer.valueOf(paramInt));
      AppMethodBeat.o(33961);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(33958);
    int i = this.zpn.size();
    AppMethodBeat.o(33958);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(33959);
    Object localObject;
    if (paramInt < 0)
    {
      localObject = null;
      AppMethodBeat.o(33959);
    }
    while (true)
    {
      return localObject;
      a locala = (a)this.zpn.get(Integer.valueOf(paramInt));
      localObject = locala;
      if (locala.field_showHead == 0)
      {
        ad localad = this.rqa.aoO(locala.field_username);
        localObject = locala;
        if (localad != null)
        {
          this.zpn.put(Integer.valueOf(paramInt), localad);
          localObject = localad;
        }
      }
      AppMethodBeat.o(33959);
    }
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(33960);
    label103: a locala;
    label148: TextView localTextView;
    if (paramView == null)
    {
      paramView = View.inflate(this.context, 2130969223, null);
      paramViewGroup = new SnsTagContactListUI.b((byte)0);
      paramViewGroup.nBN = ((TextView)paramView.findViewById(2131821069));
      paramViewGroup.emP = ((MaskLayout)paramView.findViewById(2131821072));
      paramViewGroup.emg = ((TextView)paramView.findViewById(2131821079));
      paramViewGroup.zpr = ((TextView)paramView.findViewById(2131821080));
      paramView.setTag(paramViewGroup);
      if ((a)getItem(paramInt - 1) != null)
        break label265;
      localObject = "";
      locala = (a)getItem(paramInt);
      if (paramInt != 0)
        break label277;
      paramViewGroup.nBN.setVisibility(0);
      paramViewGroup.nBN.setText(Pq(paramInt));
      paramViewGroup.nBN.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      localTextView = paramViewGroup.emg;
      if (t.nI(locala.field_username))
        break label340;
    }
    label265: label277: label340: for (Object localObject = this.zpo; ; localObject = this.zpp)
    {
      localTextView.setTextColor((ColorStateList)localObject);
      a.b.t((ImageView)paramViewGroup.emP.getContentView(), locala.field_username);
      paramViewGroup.zpr.setVisibility(8);
      paramViewGroup.emP.setVisibility(0);
      paramViewGroup.emg.setText(j.b(this.context, locala.Oj(), paramViewGroup.emg.getTextSize()));
      paramViewGroup.emg.setVisibility(0);
      AppMethodBeat.o(33960);
      return paramView;
      paramViewGroup = (SnsTagContactListUI.b)paramView.getTag();
      break;
      localObject = Pq(paramInt - 1);
      break label103;
      if ((paramInt > 0) && (!Pq(paramInt).equals(localObject)))
      {
        paramViewGroup.nBN.setVisibility(0);
        paramViewGroup.nBN.setText(Pq(paramInt));
        paramViewGroup.nBN.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        break label148;
      }
      paramViewGroup.nBN.setVisibility(8);
      break label148;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SnsTagContactListUI.a
 * JD-Core Version:    0.6.2
 */