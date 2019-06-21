package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MergeCursor;
import android.graphics.drawable.Drawable;
import android.os.HandlerThread;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.Time;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.g.a.sz.b;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.br;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.a;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.z;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class e extends p<ak>
  implements n.b
{
  private static long zrA = 2000L;
  protected List<String> elZ;
  private String gtX;
  private boolean gxV;
  protected MMSlideDelView.g jJO;
  protected MMSlideDelView.c jJP;
  protected MMSlideDelView.f jJQ;
  protected MMSlideDelView.d jJR;
  private boolean lhi;
  boolean riR;
  private float yDU;
  protected float yDV;
  private float yDW;
  private ColorStateList[] yDX;
  HashMap<String, d> yDY;
  private boolean zrB;
  private com.tencent.mm.sdk.platformtools.ap zrC;
  HashSet<Long> zrD;
  private boolean zrm;
  private f zrn;
  private com.tencent.mm.pluginsdk.ui.d zro;
  private boolean zrp;
  private boolean zrq;
  private boolean zrr;
  private c zrs;
  private com.tencent.mm.sdk.b.c zrt;
  private b zru;
  public String zrv;
  final e zrw;
  private final int zrx;
  private final int zry;
  private e.a zrz;

  public e(Context paramContext, p.a parama)
  {
    super(paramContext, new ak());
    AppMethodBeat.i(34189);
    this.elZ = null;
    this.yDX = new ColorStateList[5];
    this.zrm = true;
    this.gxV = false;
    this.jJR = MMSlideDelView.getItemStatusCallBack();
    this.yDU = -1.0F;
    this.yDV = -1.0F;
    this.yDW = -1.0F;
    this.lhi = false;
    this.zrp = false;
    this.zrq = false;
    this.zrr = false;
    this.zrt = null;
    this.zru = null;
    this.zrv = "";
    this.zrw = new e();
    this.riR = false;
    this.zrB = false;
    this.zrC = new com.tencent.mm.sdk.platformtools.ap(aw.RS().oAl.getLooper(), new e.1(this), false);
    this.zrD = new HashSet();
    super.a(parama);
    this.yDX[0] = com.tencent.mm.bz.a.h(paramContext, 2131690164);
    this.yDX[1] = com.tencent.mm.bz.a.h(paramContext, 2131690755);
    this.yDX[3] = com.tencent.mm.bz.a.h(paramContext, 2131690316);
    this.yDX[2] = com.tencent.mm.bz.a.h(paramContext, 2131690752);
    this.yDX[2] = com.tencent.mm.bz.a.h(paramContext, 2131690752);
    this.yDX[4] = com.tencent.mm.bz.a.h(paramContext, 2131690204);
    this.yDY = new HashMap();
    if (com.tencent.mm.bz.a.ga(paramContext))
      this.zry = paramContext.getResources().getDimensionPixelSize(2131427556);
    for (this.zrx = paramContext.getResources().getDimensionPixelSize(2131427558); ; this.zrx = paramContext.getResources().getDimensionPixelSize(2131427559))
    {
      this.yDU = com.tencent.mm.bz.a.al(paramContext, 2131427813);
      this.yDV = com.tencent.mm.bz.a.al(paramContext, 2131427762);
      this.yDW = com.tencent.mm.bz.a.al(paramContext, 2131427866);
      AppMethodBeat.o(34189);
      return;
      this.zry = paramContext.getResources().getDimensionPixelSize(2131427555);
    }
  }

  private static int FB(String paramString)
  {
    int i = 1;
    AppMethodBeat.i(34198);
    int j = i;
    if (paramString != null)
    {
      j = i;
      if (paramString.length() <= 0);
    }
    try
    {
      j = Integer.valueOf(paramString).intValue();
      AppMethodBeat.o(34198);
      return j;
    }
    catch (NumberFormatException paramString)
    {
      while (true)
        j = i;
    }
  }

  private CharSequence a(ak paramak, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(34200);
    if ((!ah.isNullOrNil(paramak.field_editingMsg)) && ((paramak.field_atCount <= 0) || (paramak.field_unReadCount <= 0)))
    {
      localObject1 = new SpannableStringBuilder(this.context.getString(2131301279));
      ((SpannableStringBuilder)localObject1).setSpan(new ForegroundColorSpan(-5569532), 0, ((SpannableStringBuilder)localObject1).length(), 33);
      ((SpannableStringBuilder)localObject1).append(" ").append(j.b(this.context, paramak.field_editingMsg, paramInt));
      AppMethodBeat.o(34200);
      paramak = (ak)localObject1;
    }
    while (true)
    {
      return paramak;
      localObject1 = paramak.field_digest;
      if ((localObject1 != null) && (((String)localObject1).startsWith("<img src=\"original_label.png\"/>  ")))
      {
        paramak = new SpannableString(j.e(this.context, (CharSequence)localObject1, paramInt));
        AppMethodBeat.o(34200);
      }
      else
      {
        localObject1 = paramak.field_username;
        int i;
        if (((String)localObject1).equals("qqmail"))
        {
          aw.ZK();
          if (ah.h((Integer)com.tencent.mm.model.c.Ry().get(17, null)) == 1);
          for (i = 1; ; i = 0)
          {
            if (i != 0)
              break label231;
            paramak = this.context.getString(2131303207);
            AppMethodBeat.o(34200);
            break;
          }
        }
        label231: if (((String)localObject1).equals("tmessage"))
        {
          aw.ZK();
          localObject1 = com.tencent.mm.model.c.XU().RA("@t.qq.com");
          if ((localObject1 != null) && (((com.tencent.mm.storage.bq)localObject1).isEnable()));
          for (i = 1; ; i = 0)
          {
            if (i != 0)
              break label306;
            paramak = this.context.getString(2131303207);
            AppMethodBeat.o(34200);
            break;
          }
        }
        label306: if ((paramak.field_msgType == null) || ((!paramak.field_msgType.equals("47")) && (!paramak.field_msgType.equals("1048625"))))
          break label587;
        localObject1 = aqV(paramak.field_digest);
        str1 = "";
        if (localObject1 != null)
        {
          paramak = "[" + (String)localObject1 + "]";
          AppMethodBeat.o(34200);
        }
        else
        {
          localObject1 = str1;
          if (paramak.field_digest == null)
            break;
          localObject1 = str1;
          if (!paramak.field_digest.contains(":"))
            break;
          str1 = paramak.field_digest.substring(0, paramak.field_digest.indexOf(":"));
          String str2 = aqV(paramak.field_digest.substring(paramak.field_digest.indexOf(":") + 1).replace(" ", ""));
          localObject1 = str1;
          if (str2 == null)
            break;
          paramak = "[" + str2 + "]";
          if (ah.isNullOrNil(str1))
          {
            AppMethodBeat.o(34200);
          }
          else
          {
            paramak = str1 + ": " + paramak;
            AppMethodBeat.o(34200);
          }
        }
      }
    }
    String str1 = this.context.getString(2131296895);
    if (ah.isNullOrNil((String)localObject1))
    {
      localObject1 = str1;
      label581: paramak.jh((String)localObject1);
      label587: if (ah.isNullOrNil(paramak.field_digest))
        break label803;
      if (ah.isNullOrNil(paramak.field_digestUser))
        break label792;
      if ((paramak.field_isSend != 0) || (!t.kH(paramak.field_username)))
        break label780;
    }
    label637: Object localObject2;
    label780: label792: label803: for (Object localObject1 = s.getDisplayName(paramak.field_digestUser, paramak.field_username); ; localObject2 = com.tencent.mm.booter.notification.a.h.a(paramak.field_isSend, paramak.field_username, paramak.field_content, FB(paramak.field_msgType), this.context))
      try
      {
        for (localObject1 = String.format(paramak.field_digest, new Object[] { localObject1 }); ; localObject1 = paramak.field_digest)
        {
          str1 = ((String)localObject1).replace('\n', ' ');
          if ((paramak.field_atCount <= 0) || (paramak.field_unReadCount <= 0))
            break label834;
          paramak = new SpannableStringBuilder(this.context.getString(2131301275));
          paramak.setSpan(new ForegroundColorSpan(-5569532), 0, paramak.length(), 33);
          paramak.append(" ").append(j.b(this.context, str1, paramInt));
          AppMethodBeat.o(34200);
          break;
          localObject1 = (String)localObject1 + ": " + str1;
          break label581;
          localObject1 = s.mJ(paramak.field_digestUser);
          break label637;
        }
      }
      catch (Exception localException)
      {
      }
    label834: if ((paramBoolean) && (paramak.field_unReadCount > 1))
      localObject2 = this.context.getString(2131301278, new Object[] { Integer.valueOf(paramak.field_unReadCount), str1 });
    while (true)
    {
      paramak = j.b(this.context, (CharSequence)localObject2, paramInt);
      AppMethodBeat.o(34200);
      break;
      localObject2 = str1;
      if (paramak.field_unReadCount > 0)
      {
        localObject2 = str1;
        if (t.ny(paramak.field_parentRef))
        {
          localObject2 = str1;
          if (!(this.context instanceof NewBizConversationUI))
            localObject2 = this.context.getString(2131301278, new Object[] { Integer.valueOf(paramak.field_unReadCount), str1 });
        }
      }
    }
  }

  private static String aqV(String paramString)
  {
    AppMethodBeat.i(34201);
    if ((paramString != null) && (paramString.length() == 32))
    {
      paramString = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jh(paramString);
      AppMethodBeat.o(34201);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(34201);
    }
  }

  private void ayz()
  {
    AppMethodBeat.i(34199);
    if (this.yDY != null)
    {
      this.yDY.clear();
      this.yDY = null;
    }
    AppMethodBeat.o(34199);
  }

  private void dIq()
  {
    AppMethodBeat.i(34193);
    if (this.yDY == null)
      AppMethodBeat.o(34193);
    while (true)
    {
      return;
      Iterator localIterator = this.yDY.entrySet().iterator();
      while (localIterator.hasNext())
        ((d)((Map.Entry)localIterator.next()).getValue()).zrH = null;
      AppMethodBeat.o(34193);
    }
  }

  private void dIr()
  {
    AppMethodBeat.i(34204);
    ab.d("MicroMsg.ConversationAdapter", "dkpno postTryNotify needNotify:%b timerStopped:%b", new Object[] { Boolean.valueOf(this.zrB), Boolean.valueOf(this.zrC.doT()) });
    this.zrB = true;
    if (this.zrC.doT())
      dIs();
    AppMethodBeat.o(34204);
  }

  private void dIs()
  {
    AppMethodBeat.i(34205);
    al.d(new e.2(this));
    AppMethodBeat.o(34205);
  }

  private CharSequence h(ak paramak)
  {
    AppMethodBeat.i(34190);
    if (paramak.field_status == 1)
    {
      paramak = this.context.getString(2131301306);
      AppMethodBeat.o(34190);
    }
    while (true)
    {
      return paramak;
      if (paramak.field_conversationTime == 9223372036854775807L)
      {
        paramak = "";
        AppMethodBeat.o(34190);
      }
      else
      {
        paramak = com.tencent.mm.pluginsdk.f.h.c(this.context, paramak.field_conversationTime, true);
        AppMethodBeat.o(34190);
      }
    }
  }

  public void KC()
  {
    AppMethodBeat.i(34196);
    ab.i("MicroMsg.ConversationAdapter", "dkpno resetCursor search:%b", new Object[] { Boolean.valueOf(this.gxV) });
    if (this.gxV)
    {
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
          ab.d("MicroMsg.ConversationAdapter", "block user ".concat(String.valueOf(str)));
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.ConversationAdapter", localException, "", new Object[0]);
        localArrayList1.add("officialaccounts");
        localArrayList1.add("helper_entry");
        arrayOfCursor[1] = aw.ZK().fke.b(this.gtX, "@micromsg.with.all.biz.qq.com", localArrayList1, localArrayList2);
        setCursor(new MergeCursor(arrayOfCursor));
      }
    }
    while (true)
    {
      if ((this.zrn != null) && (this.gtX != null))
        getCursor().getCount();
      super.notifyDataSetChanged();
      AppMethodBeat.o(34196);
      return;
      aw.ZK();
      setCursor(com.tencent.mm.model.c.XR().a(t.fkP, this.elZ, com.tencent.mm.o.a.ewS, false));
    }
  }

  public final void KD()
  {
    AppMethodBeat.i(34191);
    KC();
    AppMethodBeat.o(34191);
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(34202);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      ab.e("MicroMsg.ConversationAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
      AppMethodBeat.o(34202);
    }
    while (true)
    {
      return;
      a((String)paramObject, null);
      AppMethodBeat.o(34202);
    }
  }

  protected void a(ak paramak, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
  }

  public final void a(MMSlideDelView.f paramf)
  {
    this.jJQ = paramf;
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(34203);
    ab.i("MicroMsg.ConversationAdapter", "dkpno onNotifyChange mIsFront:%b mChangedBackground:%b event:%s", new Object[] { Boolean.valueOf(this.lhi), Boolean.valueOf(this.zrp), paramString });
    if ((!ah.isNullOrNil(paramString)) && (this.yDY != null))
      this.yDY.remove(paramString);
    if (this.lhi)
    {
      dIr();
      AppMethodBeat.o(34203);
    }
    while (true)
    {
      return;
      this.zrp = true;
      AppMethodBeat.o(34203);
    }
  }

  protected void a(String paramString, e.g paramg)
  {
  }

  public void detach()
  {
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(34197);
    ak localak = (ak)getItem(paramInt);
    String str = localak.field_username;
    paramViewGroup = this.zrw;
    paramViewGroup.talker = str;
    paramViewGroup.ehM = null;
    paramViewGroup.zrU = null;
    paramViewGroup.initialized = false;
    if (!ah.isNullOrNil(str))
      paramViewGroup.initialized = true;
    this.zrz = new e.a(this, (byte)0);
    label152: Object localObject1;
    label462: Object localObject2;
    ad localad;
    label569: boolean bool;
    label577: label600: label623: int i;
    label667: Object localObject3;
    if (paramView == null)
    {
      paramViewGroup = new e.g();
      if (com.tencent.mm.bz.a.ga(this.context))
      {
        paramView = View.inflate(this.context, 2130969242, null);
        paramViewGroup.ejo = ((ImageView)paramView.findViewById(2131821183));
        if ((!(this.context instanceof BizConversationUI)) && (!(this.context instanceof NewBizConversationUI)))
          break label1941;
        a.b.r(paramViewGroup.ejo, str);
        localObject1 = (com.tencent.mm.pluginsdk.ui.a)paramViewGroup.ejo.getDrawable();
        if (this.zro != null)
          this.zro.a((d.a)localObject1);
        paramViewGroup.yEc = ((NoMeasuredTextView)paramView.findViewById(2131823149));
        paramViewGroup.zrV = ((NoMeasuredTextView)paramView.findViewById(2131821512));
        paramViewGroup.yEd = ((NoMeasuredTextView)paramView.findViewById(2131823150));
        paramViewGroup.yEe = ((NoMeasuredTextView)paramView.findViewById(2131823151));
        paramViewGroup.jJV = ((TextView)paramView.findViewById(2131821067));
        paramViewGroup.jJV.setBackgroundResource(r.ik(this.context));
        paramViewGroup.yEf = ((ImageView)paramView.findViewById(2131823153));
        paramViewGroup.yEh = paramView.findViewById(2131823148);
        paramViewGroup.yEg = ((ImageView)paramView.findViewById(2131823154));
        paramViewGroup.zrW = ((ImageView)paramView.findViewById(2131823155));
        paramView.setTag(paramViewGroup);
        paramViewGroup.yEe.setTextSize(0, this.yDV);
        paramViewGroup.yEd.setTextSize(0, this.yDW);
        paramViewGroup.yEc.setTextSize(0, this.yDU);
        paramViewGroup.zrV.setTextSize(0, this.yDV);
        paramViewGroup.yEe.setTextColor(this.yDX[0]);
        paramViewGroup.yEd.setTextColor(this.yDX[4]);
        paramViewGroup.yEc.setTextColor(this.yDX[3]);
        paramViewGroup.zrV.setTextColor(this.yDX[0]);
        paramViewGroup.yEe.setShouldEllipsize(true);
        paramViewGroup.yEd.setShouldEllipsize(false);
        paramViewGroup.yEc.setShouldEllipsize(true);
        paramViewGroup.zrV.setShouldEllipsize(true);
        paramViewGroup.yEd.setGravity(5);
        localObject1 = (d)this.yDY.get(str);
        if (localObject1 != null)
          break label2712;
        localObject2 = new d((byte)0);
        localObject1 = this.zrw;
        if ((((e)localObject1).initialized) && (((e)localObject1).ehM == null))
        {
          aw.ZK();
          ((e)localObject1).ehM = com.tencent.mm.model.c.XM().aoO(((e)localObject1).talker);
        }
        localad = ((e)localObject1).ehM;
        if (localad == null)
          break label1964;
        ((d)localObject2).zrL = localad.duk;
        ((d)localObject2).zrK = ((int)localad.ewQ);
        if (localad == null)
          break label1979;
        bool = true;
        ((d)localObject2).zrQ = bool;
        if ((localad == null) || (!localad.Kc()))
          break label1985;
        bool = true;
        ((d)localObject2).zrS = bool;
        if ((localad == null) || (localad.dua != 0))
          break label1991;
        bool = true;
        ((d)localObject2).zrR = bool;
        ((d)localObject2).mgQ = t.kH(str);
        if ((!((d)localObject2).mgQ) || (!((d)localObject2).zrR) || (localak.field_unReadCount <= 0))
          break label1997;
        bool = true;
        ((d)localObject2).zrP = bool;
        ((d)localObject2).klY = 0;
        i = FB(localak.field_msgType);
        if ((i == 34) && (localak.field_isSend == 0) && (!ah.isNullOrNil(localak.field_content)))
        {
          localObject3 = localak.field_content;
          if (!str.equals("qmessage"))
          {
            localObject1 = localObject3;
            if (!str.equals("floatbottle"));
          }
          else
          {
            String[] arrayOfString = ((String)localObject3).split(":");
            localObject1 = localObject3;
            if (arrayOfString != null)
            {
              localObject1 = localObject3;
              if (arrayOfString.length > 3)
                localObject1 = arrayOfString[1] + ":" + arrayOfString[2] + ":" + arrayOfString[3];
            }
          }
          if (!new com.tencent.mm.modelvoice.n((String)localObject1).fWX)
            ((d)localObject2).klY = 1;
        }
        if ((i == 285212721) && (localak.field_unReadCount > 0))
        {
          localObject1 = localak.field_content;
          localObject3 = Long.valueOf(localak.field_lastSeq);
          if (!this.zrD.contains(localObject3))
          {
            this.zrD.add(localObject3);
            com.tencent.mm.sdk.g.d.xDG.b(new e.3(this, (String)localObject1), "tmplPreload");
          }
        }
        localObject1 = s.a(localad, str, ((d)localObject2).mgQ);
        if ((!((d)localObject2).mgQ) || (localObject1 != null))
          break label2003;
        ((d)localObject2).nickName = this.context.getString(2131298223);
        label963: ((d)localObject2).zrH = h(localak);
        ((d)localObject2).zrI = a(localak, (int)paramViewGroup.yEe.getTextSize(), ((d)localObject2).zrP);
        ((d)localObject2).zrT = localak.field_attrflag;
        switch (localak.field_status)
        {
        case 3:
        case 4:
        default:
          i = -1;
          label1055: ((d)localObject2).zrJ = i;
          ((d)localObject2).zrM = t.a(localak);
          aw.ZK();
          ((d)localObject2).yDZ = com.tencent.mm.model.c.XR().g(localak);
          if ((localad != null) && (localad.DX()))
          {
            bool = true;
            label1107: ((d)localObject2).zrN = bool;
            ((d)localObject2).zrO = aa.don();
            this.yDY.put(str, localObject2);
            localObject1 = localObject2;
          }
          break;
        case 0:
        case 1:
        case 2:
        case 5:
        }
      }
    }
    label1282: label1417: label1941: label2712: 
    while (true)
    {
      if (((d)localObject1).zrH == null)
        ((d)localObject1).zrH = h(localak);
      if ((((d)localObject1).zrP) || (t.ny(localak.field_parentRef)))
      {
        paramViewGroup.yEe.setTextColor(this.yDX[0]);
        label1189: com.tencent.mm.booter.notification.a.h.iv(paramViewGroup.yEe.getWidth());
        com.tencent.mm.booter.notification.a.h.iw((int)paramViewGroup.yEe.getTextSize());
        com.tencent.mm.booter.notification.a.h.a(paramViewGroup.yEe.getPaint());
        if (!str.toLowerCase().endsWith("@t.qq.com"))
          break label2091;
        paramViewGroup.yEc.setCompoundRightDrawablesWithIntrinsicBounds(2130839085);
        paramViewGroup.yEc.setDrawRightDrawable(true);
        label1252: i = ((d)localObject1).zrJ;
        if (i == -1)
          break label2102;
        paramViewGroup.yEe.setCompoundLeftDrawablesWithIntrinsicBounds(i);
        paramViewGroup.yEe.setDrawLeftDrawable(true);
        paramViewGroup.zrV.setVisibility(8);
        localObject2 = paramViewGroup.yEd.getLayoutParams();
        if (((d)localObject1).zrH.length() <= 9)
          break label2113;
        if (((ViewGroup.LayoutParams)localObject2).width != this.zry)
        {
          ((ViewGroup.LayoutParams)localObject2).width = this.zry;
          paramViewGroup.yEd.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        }
        label1345: ab.v("MicroMsg.ConversationAdapter", "layout update time width %d", new Object[] { Integer.valueOf(((ViewGroup.LayoutParams)localObject2).width) });
        paramViewGroup.yEd.setText(((d)localObject1).zrH);
        paramViewGroup.yEe.setText(((d)localObject1).zrI);
        if ((!((d)localObject1).mgQ) || (!((d)localObject1).zrR))
          break label2146;
        paramViewGroup.yEf.setVisibility(0);
        if ((!(this.context instanceof BizConversationUI)) && (!(this.context instanceof NewBizConversationUI)))
          break label2177;
        a.b.r(paramViewGroup.ejo, str);
        label1446: if (this.zrm)
        {
          if ((localak != null) && (paramViewGroup != null) && (localObject1 != null))
            break label2189;
          ab.w("MicroMsg.ConversationAdapter", "handle show tip cnt, but conversation or viewholder is null");
        }
        label1476: if ((!((d)localObject1).zrM) && (((d)localObject1).yDZ) && (aw.RK()))
        {
          aw.ZK();
          com.tencent.mm.model.c.XR().f(localak);
        }
        if ((!(this.context instanceof NewBizConversationUI)) || (!((d)localObject1).yDZ) || (localak.field_conversationTime == -1L))
          break label2599;
        localObject2 = this.context.getResources().getDrawable(2130837943);
        i = (int)paramViewGroup.yEc.getTextSize();
        ((Drawable)localObject2).setBounds(0, 0, i, i);
        localObject2 = new com.tencent.mm.ui.widget.a((Drawable)localObject2);
        localObject3 = new SpannableString("@");
        ((SpannableString)localObject3).setSpan(localObject2, 0, 1, 33);
        paramViewGroup.yEc.setText(TextUtils.concat(new CharSequence[] { ((d)localObject1).nickName, " ", localObject3 }));
        label1646: paramView.findViewById(2131823147).setBackgroundResource(2130838396);
        label1659: com.tencent.mm.bp.d.dlL();
        localObject2 = new sz();
        ((sz)localObject2).cPf.cPh = true;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        if ((0L != com.tencent.mm.plugin.messenger.foundation.a.a.a.a(localak, 7, 0L)) && (!localak.field_username.equals(((sz)localObject2).cPg.cPj)))
        {
          localak.eE(com.tencent.mm.plugin.messenger.foundation.a.a.a.a(localak, 6, localak.field_conversationTime));
          aw.ZK();
          com.tencent.mm.model.c.XR().a(localak, localak.field_username);
        }
        if ((com.tencent.mm.bg.g.fUs != null) && (com.tencent.mm.bg.g.fUs.tN(localak.field_username)))
          break label2647;
        paramViewGroup.yEg.setVisibility(8);
        label1790: if ((com.tencent.mm.bh.d.fUu == null) || (!com.tencent.mm.bh.d.fUu.tQ(localak.field_username)))
          break label2700;
        paramViewGroup.zrW.setVisibility(0);
      }
      while (true)
      {
        this.zrz.content = String.valueOf(((d)localObject1).zrI);
        this.zrz.bCu = String.valueOf(((d)localObject1).nickName);
        this.zrz.zrG = String.valueOf(((d)localObject1).zrH);
        localObject2 = this.zrz;
        a.a.dzk().a(paramView, ((e.a)localObject2).bCu, ((e.a)localObject2).zrF, ((e.a)localObject2).zrG, ((e.a)localObject2).content);
        a(str, paramViewGroup);
        a(localak, ((d)localObject1).yDZ, paramInt, false);
        AppMethodBeat.o(34197);
        return paramView;
        paramView = View.inflate(this.context, 2130969241, null);
        break;
        a.b.b(paramViewGroup.ejo, str);
        break label152;
        paramViewGroup = (e.g)paramView.getTag();
        break label462;
        label1964: ((d)localObject2).zrL = -1;
        ((d)localObject2).zrK = -1;
        break label569;
        label1979: bool = false;
        break label577;
        label1985: bool = false;
        break label600;
        label1991: bool = false;
        break label623;
        label1997: bool = false;
        break label667;
        label2003: ((d)localObject2).nickName = j.b(this.context, s.a(localad, str, ((d)localObject2).mgQ), paramViewGroup.yEc.getTextSize());
        break label963;
        i = -1;
        break label1055;
        i = 2131231663;
        break label1055;
        i = -1;
        break label1055;
        i = 2131231662;
        break label1055;
        bool = false;
        break label1107;
        paramViewGroup.yEe.setTextColor(this.yDX[localObject1.klY]);
        break label1189;
        label2091: paramViewGroup.yEc.setDrawRightDrawable(false);
        break label1252;
        label2102: paramViewGroup.yEe.setDrawLeftDrawable(false);
        break label1282;
        label2113: if (((ViewGroup.LayoutParams)localObject2).width == this.zrx)
          break label1345;
        ((ViewGroup.LayoutParams)localObject2).width = this.zrx;
        paramViewGroup.yEd.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        break label1345;
        label2146: if (((d)localObject1).zrN)
        {
          paramViewGroup.yEf.setVisibility(0);
          break label1417;
        }
        paramViewGroup.yEf.setVisibility(8);
        break label1417;
        a.b.b(paramViewGroup.ejo, str);
        break label1446;
        paramViewGroup.jJV.setVisibility(4);
        paramViewGroup.yEh.setVisibility(4);
        if (t.ny(localak.field_username))
        {
          localObject2 = paramViewGroup.yEh;
          if (localak.field_unReadCount > 0);
          for (i = 0; ; i = 4)
          {
            ((View)localObject2).setVisibility(i);
            paramViewGroup.yEc.setTextColor(this.yDX[3]);
            break;
          }
        }
        localObject3 = paramViewGroup.yEc;
        if ((((d)localObject1).zrQ) && (((d)localObject1).zrL == 1));
        for (localObject2 = this.yDX[2]; ; localObject2 = this.yDX[3])
        {
          ((NoMeasuredTextView)localObject3).setTextColor((ColorStateList)localObject2);
          if ((((d)localObject1).zrQ) && (((d)localObject1).zrK != 0))
            break label2339;
          ab.w("MicroMsg.ConversationAdapter", "handle show tip count, but talker is null");
          break;
        }
        label2339: if (t.ny(localak.field_parentRef))
        {
          if ((this.context instanceof NewBizConversationUI))
            break label1476;
          localObject2 = paramViewGroup.yEh;
          if (localak.field_unReadCount > 0);
          for (i = 0; ; i = 4)
          {
            ((View)localObject2).setVisibility(i);
            break;
          }
        }
        if ((((d)localObject1).zrN) && (((d)localObject1).zrS))
        {
          localObject2 = paramViewGroup.yEh;
          if (localak.field_unReadCount > 0);
          for (i = 0; ; i = 4)
          {
            ((View)localObject2).setVisibility(i);
            break;
          }
        }
        if ((((d)localObject1).mgQ) && (((d)localObject1).zrR))
        {
          localObject2 = paramViewGroup.yEh;
          if (localak.field_unReadCount > 0);
          for (i = 0; ; i = 4)
          {
            ((View)localObject2).setVisibility(i);
            break;
          }
        }
        i = localak.field_unReadCount;
        if (i > 99)
        {
          paramViewGroup.jJV.setText("");
          paramViewGroup.jJV.setBackgroundResource(2131230952);
          paramViewGroup.jJV.setVisibility(0);
        }
        while (true)
        {
          this.zrz.zrF = i;
          break;
          if (i > 0)
          {
            paramViewGroup.jJV.setText(localak.field_unReadCount);
            paramViewGroup.jJV.setBackgroundResource(r.ik(this.context));
            paramViewGroup.jJV.setVisibility(0);
          }
        }
        label2599: paramViewGroup.yEc.setText(((d)localObject1).nickName);
        if ((!((d)localObject1).yDZ) || (localak.field_conversationTime == -1L))
          break label1646;
        paramView.findViewById(2131823147).setBackgroundResource(2130838395);
        break label1659;
        label2647: paramViewGroup.yEg.setVisibility(0);
        if (localak.field_username.equals(((sz)localObject2).cPg.cPj))
        {
          paramViewGroup.yEg.setImageResource(2131232016);
          break label1790;
        }
        paramViewGroup.yEg.setImageResource(2131232015);
        break label1790;
        paramViewGroup.zrW.setVisibility(8);
      }
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(34195);
    this.zrC.stopTimer();
    this.zru = null;
    this.zrs = null;
    ayz();
    bIf();
    dww();
    detach();
    AppMethodBeat.o(34195);
  }

  public final void onPause()
  {
    AppMethodBeat.i(34192);
    if (this.jJR != null)
      this.jJR.bIp();
    this.lhi = false;
    AppMethodBeat.o(34192);
  }

  public final void onResume()
  {
    int i = 1;
    AppMethodBeat.i(34194);
    ab.i("MicroMsg.ConversationAdapter", "dkpno onResume mIsFront:%b  mNeedReCreate:%b mChangedBackground:%b mContactBackground:%b", new Object[] { Boolean.valueOf(this.lhi), Boolean.valueOf(this.zrq), Boolean.valueOf(this.zrp), Boolean.valueOf(this.zrr) });
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
      if ((this.zrq) && (this.zru != null))
        this.zrq = false;
      if ((this.zrp) || (this.zrr))
      {
        super.a(null, null);
        this.zrp = false;
        this.zrr = false;
      }
      AppMethodBeat.o(34194);
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

  public static abstract interface b
  {
  }

  final class c
    implements n.b
  {
    public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
    {
      AppMethodBeat.i(34188);
      if ((paramObject == null) || (!(paramObject instanceof String)))
      {
        ab.d("MicroMsg.ConversationAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
        AppMethodBeat.o(34188);
      }
      while (true)
      {
        return;
        paramn = (String)paramObject;
        if (e.a(this.zrE))
        {
          AppMethodBeat.o(34188);
        }
        else
        {
          if ((paramn != null) && (!paramn.equals("")) && (e.b(this.zrE) != null) && (e.b(this.zrE).containsKey(Integer.valueOf(paramInt))))
          {
            e.b(this.zrE).remove(Integer.valueOf(paramInt));
            e.c(this.zrE);
          }
          AppMethodBeat.o(34188);
        }
      }
    }
  }

  final class d
  {
    public int klY;
    public boolean mgQ;
    public CharSequence nickName;
    public boolean yDZ;
    public CharSequence zrH;
    public CharSequence zrI;
    public int zrJ;
    public int zrK;
    public int zrL;
    public boolean zrM;
    public boolean zrN;
    public boolean zrO;
    public boolean zrP;
    public boolean zrQ;
    public boolean zrR;
    public boolean zrS;
    public int zrT;

    private d()
    {
    }
  }

  final class e
  {
    ad ehM = null;
    boolean initialized = false;
    String talker = null;
    Integer zrU = null;

    public e()
    {
    }
  }

  public static abstract interface f
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.e
 * JD-Core Version:    0.6.2
 */