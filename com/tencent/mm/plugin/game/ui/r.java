package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.f.b;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.e.a.a;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.add;
import com.tencent.mm.protocal.protobuf.ade;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class r extends BaseAdapter
{
  Context context;
  boolean ctn;
  ArrayList<b> kwf;
  int mXJ;
  int njD;
  boolean nlW;
  int nlX;
  int nlY;
  int nlZ;
  int nma;
  private int nmb;
  boolean nmc;
  boolean nmd;
  private ArrayList<r.d> nme;

  public r(Context paramContext)
  {
    AppMethodBeat.i(112175);
    this.ctn = false;
    this.nlW = false;
    this.njD = 0;
    this.nlX = 0;
    this.nlY = 0;
    this.nlZ = 0;
    this.nma = 0;
    this.mXJ = 0;
    this.nmc = false;
    this.nmd = false;
    this.context = paramContext;
    this.kwf = null;
    this.nmb = paramContext.getResources().getColor(2131690123);
    AppMethodBeat.o(112175);
  }

  private String Oo(String paramString)
  {
    AppMethodBeat.i(112180);
    if (this.nme == null)
      this.nme = new ArrayList();
    StringBuilder localStringBuilder;
    while (true)
    {
      localStringBuilder = new StringBuilder(paramString);
      paramString = new r.d(this, (byte)0);
      for (int i = localStringBuilder.indexOf("<em>"); i >= 0; i = localStringBuilder.indexOf("<em>"))
      {
        paramString.start = i;
        localStringBuilder.delete(i, i + 4);
        i = localStringBuilder.indexOf("</em>");
        if (i < 0)
          break;
        paramString.end = i;
        localStringBuilder.delete(i, i + 5);
        this.nme.add(paramString);
      }
      this.nme.clear();
    }
    paramString = localStringBuilder.toString();
    AppMethodBeat.o(112180);
    return paramString;
  }

  private void a(TextView paramTextView, String paramString)
  {
    AppMethodBeat.i(112181);
    if (!bo.isNullOrNil(paramString))
    {
      SpannableString localSpannableString = new SpannableString(Oo(paramString));
      paramString = this.nme.iterator();
      while (paramString.hasNext())
      {
        r.d locald = (r.d)paramString.next();
        if (locald.start < locald.end)
          localSpannableString.setSpan(new ForegroundColorSpan(this.nmb), locald.start, locald.end, 33);
      }
      paramTextView.setText(localSpannableString);
      paramTextView.setVisibility(0);
      AppMethodBeat.o(112181);
    }
    while (true)
    {
      return;
      paramTextView.setVisibility(8);
      AppMethodBeat.o(112181);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(112176);
    int i;
    if (this.kwf == null)
    {
      i = 0;
      AppMethodBeat.o(112176);
    }
    while (true)
    {
      return i;
      i = this.kwf.size();
      AppMethodBeat.o(112176);
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(112177);
    Object localObject = this.kwf.get(paramInt);
    AppMethodBeat.o(112177);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(112178);
    paramInt = ((b)getItem(paramInt)).type;
    AppMethodBeat.o(112178);
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(112179);
    b localb = (b)getItem(paramInt);
    Object localObject1;
    Object localObject2;
    if (paramView == null)
    {
      localObject1 = new r.a((byte)0);
      paramView = this.context;
      switch (localb.type)
      {
      case 4:
      default:
        paramInt = 0;
        localObject2 = View.inflate(paramView, paramInt, null);
        ((r.a)localObject1).contentView = ((View)localObject2).findViewById(2131824619);
        ((r.a)localObject1).nmi = ((ImageView)((View)localObject2).findViewById(2131824620));
        ((r.a)localObject1).nmj = ((TextView)((View)localObject2).findViewById(2131824622));
        ((r.a)localObject1).nmk = ((TextView)((View)localObject2).findViewById(2131824621));
        ((r.a)localObject1).nml = ((TextView)((View)localObject2).findViewById(2131824623));
        ((r.a)localObject1).nmm = ((TextView)((View)localObject2).findViewById(2131824629));
        ((r.a)localObject1).nmn = ((View)localObject2).findViewById(2131824630);
        ((r.a)localObject1).nmo = ((TextView)((View)localObject2).findViewById(2131824631));
        ((r.a)localObject1).nmp = ((TextView)((View)localObject2).findViewById(2131824632));
        ((View)localObject2).setTag(localObject1);
        paramViewGroup = (ViewGroup)localObject1;
        paramView = (View)localObject2;
        if (((r.a)localObject1).nmj != null)
        {
          paramViewGroup = (ViewGroup)localObject1;
          paramView = (View)localObject2;
          if (((r.a)localObject1).nml != null)
          {
            paramView = ((r.a)localObject1).nmj;
            paramViewGroup = ((r.a)localObject1).nml;
            paramView.getViewTreeObserver().addOnGlobalLayoutListener(new r.1(this, paramView, paramViewGroup));
            paramView = (View)localObject2;
            paramViewGroup = (ViewGroup)localObject1;
          }
        }
        label290: switch (localb.type)
        {
        case 4:
        default:
          label336: switch (localb.type)
          {
          case 4:
          default:
          case 1:
          case 2:
          case 3:
          case 5:
          case 0:
          }
          break;
        case 1:
        case 2:
        case 3:
        case 0:
        case 5:
        case 6:
        }
        break;
      case 1:
      case 2:
      case 0:
      case 5:
      case 6:
      case 3:
      }
    }
    while (true)
    {
      AppMethodBeat.o(112179);
      return paramView;
      paramInt = 2130969774;
      break;
      paramInt = 2130969781;
      break;
      paramInt = 2130969780;
      break;
      paramInt = 2130969776;
      break;
      paramInt = 2130969777;
      break;
      paramInt = 2130969779;
      break;
      paramViewGroup = (r.a)paramView.getTag();
      break label290;
      if (!bo.isNullOrNil(localb.iconUrl))
      {
        localObject1 = new e.a.a();
        ((e.a.a)localObject1).ePF = false;
        ((e.a.a)localObject1).ePH = false;
        e.bFH().a(paramViewGroup.nmi, localb.iconUrl, ((e.a.a)localObject1).bFI());
      }
      a(paramViewGroup.nmj, localb.name);
      a(paramViewGroup.nmk, localb.nmq);
      a(paramViewGroup.nml, localb.hHV);
      break label336;
      if (!bo.isNullOrNil(localb.iconUrl))
      {
        localObject1 = new e.a.a();
        ((e.a.a)localObject1).ePF = false;
        ((e.a.a)localObject1).ePH = false;
        ((e.a.a)localObject1).nnP = true;
        e.bFH().a(paramViewGroup.nmi, localb.iconUrl, ((e.a.a)localObject1).bFI());
        paramViewGroup.nmi.setVisibility(0);
        label600: a(paramViewGroup.nmj, localb.name);
        a(paramViewGroup.nml, localb.hHV);
        if (bo.isNullOrNil(localb.fnb))
          break label720;
        paramViewGroup.nmo.setText(j.b(this.context, localb.fnb));
        paramViewGroup.nmo.setVisibility(0);
      }
      while (true)
      {
        if (localb.createTime <= 0L)
          break label732;
        paramViewGroup.nmp.setText(b.h(this.context, localb.createTime * 1000L));
        paramViewGroup.nmp.setVisibility(0);
        break;
        paramViewGroup.nmi.setVisibility(8);
        break label600;
        label720: paramViewGroup.nmo.setVisibility(8);
      }
      label732: paramViewGroup.nmp.setVisibility(8);
      break label336;
      if (!bo.isNullOrNil(localb.iconUrl))
      {
        localObject1 = new e.a.a();
        ((e.a.a)localObject1).ePF = false;
        ((e.a.a)localObject1).ePH = false;
        e.bFH().a(paramViewGroup.nmi, localb.iconUrl, ((e.a.a)localObject1).bFI());
      }
      a(paramViewGroup.nmj, localb.name);
      a(paramViewGroup.nmk, localb.nmq);
      a(paramViewGroup.nml, localb.hHV);
      TextView localTextView = paramViewGroup.nmm;
      localObject2 = localb.nmt;
      localObject1 = new StringBuilder();
      if (!bo.ek((List)localObject2))
      {
        int i = ((LinkedList)localObject2).size();
        for (paramInt = 0; paramInt < i - 1; paramInt++)
          ((StringBuilder)localObject1).append((String)((LinkedList)localObject2).get(paramInt) + "\n");
        ((StringBuilder)localObject1).append((String)((LinkedList)localObject2).get(i - 1));
        localTextView.setVisibility(0);
        localTextView.setText(((StringBuilder)localObject1).toString());
        break label336;
      }
      localTextView.setVisibility(8);
      break label336;
      paramViewGroup.nml.setText(localb.name);
      break label336;
      paramViewGroup.nmi.setImageResource(2131231897);
      paramViewGroup.nmj.setText(localb.name);
      break label336;
      if (localb.nmx)
        paramViewGroup.contentView.setBackgroundResource(2130838398);
      while (true)
      {
        paramInt = this.context.getResources().getDimensionPixelSize(2131427843);
        paramViewGroup.contentView.setPadding(0, paramInt, 0, paramInt);
        break;
        paramViewGroup.contentView.setBackgroundResource(2130838396);
      }
      if (localb.nmw)
        paramViewGroup.nmn.setVisibility(8);
      else
        paramViewGroup.nmn.setVisibility(0);
    }
  }

  public final int getViewTypeCount()
  {
    return 7;
  }

  public final void reset()
  {
    this.mXJ = 0;
    this.nmc = false;
  }

  public static final class b
  {
    public int actionType;
    public String appId;
    public long createTime;
    public String ctj;
    public String fnb;
    public String hHV;
    public String iconUrl;
    public String name;
    public String nmq;
    public ade nmr;
    public String nms;
    public LinkedList<String> nmt;
    public int nmu;
    public int nmv;
    public boolean nmw = false;
    public boolean nmx = false;
    public r.c nmy;
    public int type;

    public static b a(add paramadd)
    {
      AppMethodBeat.i(112173);
      b localb = new b();
      localb.type = 2;
      localb.name = paramadd.Title;
      localb.hHV = paramadd.Desc;
      localb.iconUrl = paramadd.ThumbUrl;
      localb.nms = paramadd.wkC;
      localb.nmu = paramadd.wkX;
      localb.nmv = paramadd.wkY;
      localb.appId = paramadd.fKh;
      localb.fnb = paramadd.ncH;
      localb.createTime = paramadd.vNm;
      localb.nmy = new r.c(paramadd.wkC, (byte)0);
      AppMethodBeat.o(112173);
      return localb;
    }

    public static b aM(int paramInt, String paramString)
    {
      AppMethodBeat.i(112172);
      b localb = new b();
      localb.type = paramInt;
      localb.name = paramString;
      localb.nmy = new r.c();
      AppMethodBeat.o(112172);
      return localb;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.r
 * JD-Core Version:    0.6.2
 */