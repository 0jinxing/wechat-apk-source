package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.HandlerThread;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.format.Time;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.a.a.a;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.MMSlideDelView.g;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.a;
import com.tencent.mm.ui.tools.r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class i extends p<ak>
  implements n.b
{
  private static long zrA = 2000L;
  private String cIe;
  protected MMSlideDelView.g jJO;
  protected MMSlideDelView.c jJP;
  protected MMSlideDelView.f jJQ;
  protected MMSlideDelView.d jJR;
  private boolean lhi;
  private float yDU;
  private float yDV;
  private float yDW;
  HashMap<String, i.a> yDY;
  private boolean zrB;
  ap zrC;
  private boolean zrp;
  public String zrv;
  private final int zrx;
  private final int zry;
  private ColorStateList[] zug;

  public i(Context paramContext, String paramString, p.a parama)
  {
    super(paramContext, new ak());
    AppMethodBeat.i(34399);
    this.zug = new ColorStateList[5];
    this.jJR = MMSlideDelView.getItemStatusCallBack();
    this.yDU = -1.0F;
    this.yDV = -1.0F;
    this.yDW = -1.0F;
    this.lhi = false;
    this.zrp = false;
    this.zrv = "";
    this.zrB = false;
    this.zrC = new ap(aw.RS().oAl.getLooper(), new i.1(this), false);
    super.a(parama);
    this.cIe = paramString;
    this.yDY = new HashMap();
    this.zug[0] = com.tencent.mm.bz.a.h(paramContext, 2131690164);
    this.zug[1] = com.tencent.mm.bz.a.h(paramContext, 2131690755);
    this.zug[3] = com.tencent.mm.bz.a.h(paramContext, 2131690316);
    this.zug[2] = com.tencent.mm.bz.a.h(paramContext, 2131690752);
    this.zug[2] = com.tencent.mm.bz.a.h(paramContext, 2131690752);
    this.zug[4] = com.tencent.mm.bz.a.h(paramContext, 2131690204);
    if (com.tencent.mm.bz.a.ga(paramContext))
      this.zry = paramContext.getResources().getDimensionPixelSize(2131427556);
    for (this.zrx = paramContext.getResources().getDimensionPixelSize(2131427558); ; this.zrx = paramContext.getResources().getDimensionPixelSize(2131427559))
    {
      this.yDU = com.tencent.mm.bz.a.al(paramContext, 2131427813);
      this.yDV = com.tencent.mm.bz.a.al(paramContext, 2131427762);
      this.yDW = com.tencent.mm.bz.a.al(paramContext, 2131427866);
      aw.ZK();
      c.XR().a(this);
      AppMethodBeat.o(34399);
      return;
      this.zry = paramContext.getResources().getDimensionPixelSize(2131427555);
    }
  }

  private static String aqV(String paramString)
  {
    AppMethodBeat.i(34407);
    if ((paramString != null) && (paramString.length() == 32))
    {
      paramString = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jh(paramString);
      AppMethodBeat.o(34407);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(34407);
    }
  }

  private CharSequence c(ak paramak, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(34406);
    Object localObject1;
    if ((!ah.isNullOrNil(paramak.field_editingMsg)) && ((paramak.field_atCount <= 0) || (paramak.field_unReadCount <= 0)))
    {
      localObject1 = new SpannableStringBuilder(this.context.getString(2131301279));
      ((SpannableStringBuilder)localObject1).setSpan(new ForegroundColorSpan(-5569532), 0, ((SpannableStringBuilder)localObject1).length(), 33);
      ((SpannableStringBuilder)localObject1).append(" ").append(j.b(this.context, paramak.field_editingMsg, paramInt));
      AppMethodBeat.o(34406);
      paramak = (ak)localObject1;
    }
    while (true)
    {
      return paramak;
      localObject1 = paramak.field_digest;
      if ((localObject1 != null) && (((String)localObject1).startsWith("<img src=\"original_label.png\"/>  ")))
      {
        paramak = new SpannableString(j.e(this.context, (CharSequence)localObject1, paramInt));
        AppMethodBeat.o(34406);
      }
      else
      {
        String str1;
        if ((k(paramak) == 47) || (k(paramak) == 1048625))
        {
          localObject1 = aqV(paramak.field_digest);
          str1 = "";
          if (localObject1 != null)
          {
            paramak = "[" + (String)localObject1 + "]";
            AppMethodBeat.o(34406);
          }
          else
          {
            localObject1 = str1;
            if (paramak.field_digest != null)
            {
              localObject1 = str1;
              if (paramak.field_digest.contains(":"))
              {
                str1 = paramak.field_digest.substring(0, paramak.field_digest.indexOf(":"));
                String str2 = aqV(paramak.field_digest.substring(paramak.field_digest.indexOf(":") + 1).replace(" ", ""));
                localObject1 = str1;
                if (str2 != null)
                {
                  paramak = "[" + str2 + "]";
                  if (ah.isNullOrNil(str1))
                  {
                    AppMethodBeat.o(34406);
                    continue;
                  }
                  paramak = str1 + ": " + paramak;
                  AppMethodBeat.o(34406);
                }
              }
            }
            else
            {
              str1 = this.context.getString(2131296895);
              if (ah.isNullOrNil((String)localObject1))
              {
                localObject1 = str1;
                label412: paramak.jh((String)localObject1);
              }
            }
          }
        }
        else
        {
          if (!ah.isNullOrNil(paramak.field_digest))
            if (!ah.isNullOrNil(paramak.field_digestUser))
              if ((paramak.field_isSend != 0) || (!t.kH(paramak.field_username)));
          for (localObject1 = s.getDisplayName(paramak.field_digestUser, paramak.field_username); ; localObject2 = com.tencent.mm.booter.notification.a.h.a(paramak.field_isSend, paramak.field_username, paramak.field_content, k(paramak), this.context))
            try
            {
              label468: for (localObject1 = String.format(paramak.field_digest, new Object[] { localObject1 }); ; localObject1 = paramak.field_digest)
              {
                str1 = ((String)localObject1).replace('\n', ' ');
                if ((paramak.field_atCount <= 0) || (paramak.field_unReadCount <= 0))
                  break label661;
                paramak = new SpannableStringBuilder(this.context.getString(2131301275));
                paramak.setSpan(new ForegroundColorSpan(-5569532), 0, paramak.length(), 33);
                paramak.append(" ").append(j.b(this.context, str1, paramInt));
                AppMethodBeat.o(34406);
                break;
                localObject1 = (String)localObject1 + ": " + str1;
                break label412;
                localObject1 = s.mJ(paramak.field_digestUser);
                break label468;
              }
            }
            catch (Exception localException)
            {
            }
          label661: Object localObject2 = str1;
          if (paramBoolean)
          {
            localObject2 = str1;
            if (paramak.field_unReadCount > 1)
              localObject2 = this.context.getString(2131301278, new Object[] { Integer.valueOf(paramak.field_unReadCount), str1 });
          }
          paramak = j.b(this.context, (CharSequence)localObject2, paramInt);
          AppMethodBeat.o(34406);
        }
      }
    }
  }

  private void dIq()
  {
    AppMethodBeat.i(34409);
    if (this.yDY == null)
      AppMethodBeat.o(34409);
    while (true)
    {
      return;
      Iterator localIterator = this.yDY.entrySet().iterator();
      while (localIterator.hasNext())
        ((i.a)((Map.Entry)localIterator.next()).getValue()).zrH = null;
      AppMethodBeat.o(34409);
    }
  }

  private void dIr()
  {
    AppMethodBeat.i(34412);
    ab.d("MicroMsg.EnterpriseConversationAdapter", "dkpno postTryNotify needNotify:%b timerStopped:%b", new Object[] { Boolean.valueOf(this.zrB), Boolean.valueOf(this.zrC.doT()) });
    this.zrB = true;
    if (this.zrC.doT())
      dIs();
    AppMethodBeat.o(34412);
  }

  private void dIs()
  {
    AppMethodBeat.i(34413);
    al.d(new i.2(this));
    AppMethodBeat.o(34413);
  }

  private CharSequence h(ak paramak)
  {
    AppMethodBeat.i(34408);
    if (paramak.field_status == 1)
    {
      paramak = this.context.getString(2131301306);
      AppMethodBeat.o(34408);
    }
    while (true)
    {
      return paramak;
      if (paramak.field_conversationTime == 9223372036854775807L)
      {
        paramak = "";
        AppMethodBeat.o(34408);
      }
      else
      {
        paramak = com.tencent.mm.pluginsdk.f.h.c(this.context, paramak.field_conversationTime, true);
        AppMethodBeat.o(34408);
      }
    }
  }

  private static int k(ak paramak)
  {
    int i = 1;
    AppMethodBeat.i(34405);
    paramak = paramak.field_msgType;
    int j = i;
    if (paramak != null)
    {
      j = i;
      if (paramak.length() <= 0);
    }
    try
    {
      j = Integer.valueOf(paramak).intValue();
      AppMethodBeat.o(34405);
      return j;
    }
    catch (NumberFormatException paramak)
    {
      while (true)
        j = i;
    }
  }

  public final void KC()
  {
    AppMethodBeat.i(34403);
    bIf();
    aw.ZK();
    setCursor(c.XR().c(t.fkP, null, this.cIe));
    if (this.yle != null)
      this.yle.apt();
    super.notifyDataSetChanged();
    AppMethodBeat.o(34403);
  }

  public final void KD()
  {
    AppMethodBeat.i(34402);
    KC();
    AppMethodBeat.o(34402);
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(34410);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      ab.e("MicroMsg.EnterpriseConversationAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
      AppMethodBeat.o(34410);
    }
    while (true)
    {
      return;
      a((String)paramObject, null);
      AppMethodBeat.o(34410);
    }
  }

  public final void a(MMSlideDelView.f paramf)
  {
    this.jJQ = paramf;
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(34411);
    ab.i("MicroMsg.EnterpriseConversationAdapter", "dkpno onNotifyChange mIsFront:%b mChangedBackground:%b event:%s", new Object[] { Boolean.valueOf(this.lhi), Boolean.valueOf(this.zrp), paramString });
    if ((!ah.isNullOrNil(paramString)) && (this.yDY != null))
      this.yDY.remove(paramString);
    if (this.lhi)
    {
      dIr();
      AppMethodBeat.o(34411);
    }
    while (true)
    {
      return;
      this.zrp = true;
      AppMethodBeat.o(34411);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(34404);
    ak localak = (ak)getItem(paramInt);
    String str = localak.field_username;
    paramViewGroup = null;
    if (paramView != null)
      paramViewGroup = (b)paramView.getTag();
    if ((paramView == null) || (paramViewGroup == null))
    {
      paramViewGroup = new b();
      if (com.tencent.mm.bz.a.ga(this.context))
      {
        paramView = View.inflate(this.context, 2130969242, null);
        paramViewGroup.ejo = ((ImageView)paramView.findViewById(2131821183));
        paramViewGroup.zui = ((NoMeasuredTextView)paramView.findViewById(2131823149));
        paramViewGroup.zui.setTextSize(0, this.yDU);
        paramViewGroup.zui.setTextColor(this.zug[3]);
        paramViewGroup.zui.setShouldEllipsize(true);
        paramViewGroup.zuj = ((NoMeasuredTextView)paramView.findViewById(2131823150));
        paramViewGroup.zuj.setTextSize(0, this.yDW);
        paramViewGroup.zuj.setTextColor(this.zug[4]);
        paramViewGroup.zuj.setShouldEllipsize(false);
        paramViewGroup.zuj.setGravity(5);
        paramViewGroup.zuk = ((NoMeasuredTextView)paramView.findViewById(2131823151));
        paramViewGroup.zuk.setTextSize(0, this.yDV);
        paramViewGroup.zuk.setTextColor(this.zug[0]);
        paramViewGroup.zuk.setShouldEllipsize(true);
        paramViewGroup.zul = ((TextView)paramView.findViewById(2131821067));
        paramViewGroup.zul.setBackgroundResource(r.ik(this.context));
        paramViewGroup.yEf = ((ImageView)paramView.findViewById(2131823153));
        paramViewGroup.yEh = paramView.findViewById(2131823148);
        paramView.findViewById(2131823154).setVisibility(8);
        paramView.findViewById(2131823155).setVisibility(8);
        paramView.setTag(paramViewGroup);
      }
    }
    while (true)
    {
      i.a locala = (i.a)this.yDY.get(str);
      aw.ZK();
      Object localObject = c.XM().aoO(str);
      label382: boolean bool;
      if (locala == null)
      {
        locala = new i.a(this, (byte)0);
        if (localObject != null)
        {
          locala.zrK = ((int)((com.tencent.mm.n.a)localObject).ewQ);
          if (localObject == null)
            break label1093;
          bool = true;
          label390: locala.zrQ = bool;
          if ((localObject == null) || (!((ad)localObject).Kc()))
            break label1099;
          bool = true;
          label413: locala.zrS = bool;
          if ((localObject == null) || (!((ad)localObject).DX()))
            break label1105;
          bool = true;
          label436: locala.zrN = bool;
          if (localak.field_unReadCount <= 0)
            break label1111;
          bool = true;
          label454: locala.rXd = bool;
          locala.klY = 0;
          if ((k(localak) == 34) && (localak.field_isSend == 0) && (!ah.isNullOrNil(localak.field_content)) && (!new com.tencent.mm.modelvoice.n(localak.field_content).fWX))
            locala.klY = 1;
          locala.nickName = j.b(this.context, s.a((ad)localObject, str, false), paramViewGroup.zui.getTextSize());
          locala.zrH = h(localak);
          paramInt = (int)paramViewGroup.zuk.getTextSize();
          if ((!locala.zrN) || (!locala.rXd))
            break label1117;
          bool = true;
          label586: locala.zrI = c(localak, paramInt, bool);
          locala.zrT = localak.field_attrflag;
          switch (localak.field_status)
          {
          case 3:
          case 4:
          default:
            paramInt = -1;
            label654: locala.zrJ = paramInt;
            aw.ZK();
            locala.yDZ = c.XR().g(localak);
            locala.zrO = aa.don();
            this.yDY.put(str, locala);
          case 0:
          case 1:
          case 2:
          case 5:
          }
        }
      }
      while (true)
      {
        if (locala.zrH == null)
          locala.zrH = h(localak);
        if ((locala.zrN) && (locala.rXd))
        {
          paramViewGroup.zuk.setTextColor(this.zug[0]);
          label747: com.tencent.mm.booter.notification.a.h.iv(paramViewGroup.zuk.getWidth());
          com.tencent.mm.booter.notification.a.h.iw((int)paramViewGroup.zuk.getTextSize());
          com.tencent.mm.booter.notification.a.h.a(paramViewGroup.zuk.getPaint());
          if (locala.zrJ == -1)
            break label1167;
          paramViewGroup.zuk.setCompoundLeftDrawablesWithIntrinsicBounds(locala.zrJ);
          paramViewGroup.zuk.setDrawLeftDrawable(true);
          label807: paramViewGroup.zuk.setText(locala.zrI);
          paramViewGroup.zui.setDrawRightDrawable(false);
          paramViewGroup.zui.setText(locala.nickName);
          localObject = paramViewGroup.zuj.getLayoutParams();
          if (locala.zrH.length() <= 9)
            break label1178;
          if (((ViewGroup.LayoutParams)localObject).width != this.zry)
          {
            ((ViewGroup.LayoutParams)localObject).width = this.zry;
            paramViewGroup.zuj.setLayoutParams((ViewGroup.LayoutParams)localObject);
          }
          label893: paramViewGroup.zuj.setText(locala.zrH);
          if (!locala.zrN)
            break label1211;
          paramViewGroup.yEf.setVisibility(0);
          label921: a.b.b(paramViewGroup.ejo, str);
          paramViewGroup.zul.setVisibility(4);
          paramViewGroup.yEh.setVisibility(4);
          if ((locala.zrQ) && (locala.zrK != 0))
          {
            paramInt = localak.field_unReadCount;
            if (!locala.zrN)
              break label1228;
            paramViewGroup = paramViewGroup.yEh;
            if (paramInt <= 0)
              break label1223;
            paramInt = 0;
            label987: paramViewGroup.setVisibility(paramInt);
          }
          label992: if ((!locala.yDZ) || (localak.field_conversationTime == -1L))
            break label1304;
          paramView.findViewById(2131823147).setBackgroundResource(2130838395);
        }
        while (true)
        {
          a.a.dzk().a(paramView, String.valueOf(locala.nickName), localak.field_unReadCount, String.valueOf(locala.zrH), String.valueOf(locala.zrI));
          AppMethodBeat.o(34404);
          return paramView;
          paramView = View.inflate(this.context, 2130969241, null);
          break;
          locala.zrK = -1;
          break label382;
          label1093: bool = false;
          break label390;
          label1099: bool = false;
          break label413;
          label1105: bool = false;
          break label436;
          label1111: bool = false;
          break label454;
          label1117: bool = false;
          break label586;
          paramInt = -1;
          break label654;
          paramInt = 2131231663;
          break label654;
          paramInt = -1;
          break label654;
          paramInt = 2131231662;
          break label654;
          paramViewGroup.zuk.setTextColor(this.zug[locala.klY]);
          break label747;
          label1167: paramViewGroup.zuk.setDrawLeftDrawable(false);
          break label807;
          label1178: if (((ViewGroup.LayoutParams)localObject).width == this.zrx)
            break label893;
          ((ViewGroup.LayoutParams)localObject).width = this.zrx;
          paramViewGroup.zuj.setLayoutParams((ViewGroup.LayoutParams)localObject);
          break label893;
          label1211: paramViewGroup.yEf.setVisibility(8);
          break label921;
          label1223: paramInt = 4;
          break label987;
          label1228: if (paramInt > 99)
          {
            paramViewGroup.zul.setText("");
            paramViewGroup.zul.setBackgroundResource(2131230952);
            paramViewGroup.zul.setVisibility(0);
            break label992;
          }
          if (paramInt <= 0)
            break label992;
          paramViewGroup.zul.setText(String.valueOf(paramInt));
          paramViewGroup.zul.setBackgroundResource(r.ik(this.context));
          paramViewGroup.zul.setVisibility(0);
          break label992;
          label1304: paramView.findViewById(2131823147).setBackgroundResource(2130838396);
        }
      }
    }
  }

  public final void onPause()
  {
    AppMethodBeat.i(34400);
    if (this.jJR != null)
      this.jJR.bIp();
    this.lhi = false;
    AppMethodBeat.o(34400);
  }

  public final void onResume()
  {
    int i = 1;
    AppMethodBeat.i(34401);
    this.lhi = true;
    Object localObject = new Time();
    ((Time)localObject).setToNow();
    localObject = com.tencent.mm.pluginsdk.f.g.a("MM/dd", (Time)localObject).toString();
    if (!this.zrv.equals(localObject));
    while (true)
    {
      this.zrv = ((String)localObject);
      if (i != 0)
        dIq();
      if (this.zrp)
      {
        super.a(null, null);
        this.zrp = false;
      }
      AppMethodBeat.o(34401);
      return;
      i = 0;
    }
  }

  public final void setGetViewPositionCallback(MMSlideDelView.c paramc)
  {
    this.jJP = paramc;
  }

  public final void setPerformItemClickListener(MMSlideDelView.g paramg)
  {
    this.jJO = paramg;
  }

  public static final class b
  {
    public ImageView ejo;
    public ImageView yEf;
    public View yEh;
    public NoMeasuredTextView zui;
    public NoMeasuredTextView zuj;
    public NoMeasuredTextView zuk;
    public TextView zul;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.i
 * JD-Core Version:    0.6.2
 */