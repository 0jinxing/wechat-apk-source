package com.tencent.mm.ui.conversation;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.g.c.at;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bq;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.tools.r;
import java.util.HashMap;
import java.util.List;

final class SettingCheckUnProcessWalletConvUI$a extends BaseAdapter
{
  private float yDU;
  protected float yDV;
  private float yDW;
  private ColorStateList[] yDX;
  private HashMap<String, SettingCheckUnProcessWalletConvUI.a.a> yDY;
  private final int zrx;
  private final int zry;

  public SettingCheckUnProcessWalletConvUI$a(SettingCheckUnProcessWalletConvUI paramSettingCheckUnProcessWalletConvUI)
  {
    AppMethodBeat.i(34617);
    this.yDX = new ColorStateList[5];
    this.yDU = -1.0F;
    this.yDV = -1.0F;
    this.yDW = -1.0F;
    this.yDX[0] = a.h(paramSettingCheckUnProcessWalletConvUI, 2131690164);
    this.yDX[1] = a.h(paramSettingCheckUnProcessWalletConvUI, 2131690755);
    this.yDX[3] = a.h(paramSettingCheckUnProcessWalletConvUI, 2131690316);
    this.yDX[2] = a.h(paramSettingCheckUnProcessWalletConvUI, 2131690752);
    this.yDX[2] = a.h(paramSettingCheckUnProcessWalletConvUI, 2131690752);
    this.yDX[4] = a.h(paramSettingCheckUnProcessWalletConvUI, 2131690204);
    if (a.ga(paramSettingCheckUnProcessWalletConvUI))
      this.zry = paramSettingCheckUnProcessWalletConvUI.getResources().getDimensionPixelSize(2131427556);
    for (this.zrx = paramSettingCheckUnProcessWalletConvUI.getResources().getDimensionPixelSize(2131427558); ; this.zrx = paramSettingCheckUnProcessWalletConvUI.getResources().getDimensionPixelSize(2131427559))
    {
      this.yDU = a.al(paramSettingCheckUnProcessWalletConvUI, 2131427813);
      this.yDV = a.al(paramSettingCheckUnProcessWalletConvUI, 2131427762);
      this.yDW = a.al(paramSettingCheckUnProcessWalletConvUI, 2131427866);
      this.yDY = new HashMap();
      AppMethodBeat.o(34617);
      return;
      this.zry = paramSettingCheckUnProcessWalletConvUI.getResources().getDimensionPixelSize(2131427555);
    }
  }

  private static int FB(String paramString)
  {
    int i = 1;
    AppMethodBeat.i(34621);
    int j = i;
    if (paramString != null)
    {
      j = i;
      if (paramString.length() <= 0);
    }
    try
    {
      j = Integer.valueOf(paramString).intValue();
      AppMethodBeat.o(34621);
      return j;
    }
    catch (NumberFormatException paramString)
    {
      while (true)
        j = i;
    }
  }

  private static String aqV(String paramString)
  {
    AppMethodBeat.i(34624);
    if ((paramString != null) && (paramString.length() == 32))
    {
      paramString = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jh(paramString);
      AppMethodBeat.o(34624);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(34624);
    }
  }

  private CharSequence c(ak paramak, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(34623);
    if ((!ah.isNullOrNil(paramak.field_editingMsg)) && ((paramak.field_atCount <= 0) || (paramak.field_unReadCount <= 0)))
    {
      localObject1 = new SpannableStringBuilder(this.zvJ.getString(2131301279));
      ((SpannableStringBuilder)localObject1).setSpan(new ForegroundColorSpan(-5569532), 0, ((SpannableStringBuilder)localObject1).length(), 33);
      ((SpannableStringBuilder)localObject1).append(" ").append(j.b(this.zvJ, paramak.field_editingMsg, paramInt));
      AppMethodBeat.o(34623);
      paramak = (ak)localObject1;
    }
    while (true)
    {
      return paramak;
      localObject1 = paramak.field_digest;
      if ((localObject1 != null) && (((String)localObject1).startsWith("<img src=\"original_label.png\"/>  ")))
      {
        paramak = new SpannableString(j.e(this.zvJ, (CharSequence)localObject1, paramInt));
        AppMethodBeat.o(34623);
      }
      else
      {
        localObject1 = paramak.field_username;
        int i;
        if (((String)localObject1).equals("qqmail"))
        {
          aw.ZK();
          if (ah.h((Integer)c.Ry().get(17, null)) == 1);
          for (i = 1; ; i = 0)
          {
            if (i != 0)
              break label221;
            paramak = this.zvJ.getString(2131303207);
            AppMethodBeat.o(34623);
            break;
          }
        }
        label221: if (((String)localObject1).equals("tmessage"))
        {
          aw.ZK();
          localObject1 = c.XU().RA("@t.qq.com");
          if ((localObject1 != null) && (((bq)localObject1).isEnable()));
          for (i = 1; ; i = 0)
          {
            if (i != 0)
              break label292;
            paramak = this.zvJ.getString(2131303207);
            AppMethodBeat.o(34623);
            break;
          }
        }
        label292: if ((paramak.field_msgType == null) || ((!paramak.field_msgType.equals("47")) && (!paramak.field_msgType.equals("1048625"))))
          break label571;
        localObject1 = aqV(paramak.field_digest);
        str1 = "";
        if (localObject1 != null)
        {
          paramak = "[" + (String)localObject1 + "]";
          AppMethodBeat.o(34623);
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
            AppMethodBeat.o(34623);
          }
          else
          {
            paramak = str1 + ": " + paramak;
            AppMethodBeat.o(34623);
          }
        }
      }
    }
    String str1 = this.zvJ.getString(2131296895);
    if (ah.isNullOrNil((String)localObject1))
    {
      localObject1 = str1;
      label565: paramak.jh((String)localObject1);
      label571: if (ah.isNullOrNil(paramak.field_digest))
        break label784;
      if (ah.isNullOrNil(paramak.field_digestUser))
        break label773;
      if ((paramak.field_isSend != 0) || (!t.kH(paramak.field_username)))
        break label761;
    }
    label621: label761: Object localObject2;
    label773: label784: for (Object localObject1 = s.getDisplayName(paramak.field_digestUser, paramak.field_username); ; localObject2 = com.tencent.mm.booter.notification.a.h.a(paramak.field_isSend, paramak.field_username, paramak.field_content, FB(paramak.field_msgType), this.zvJ))
      try
      {
        for (localObject1 = String.format(paramak.field_digest, new Object[] { localObject1 }); ; localObject1 = paramak.field_digest)
        {
          str1 = ((String)localObject1).replace('\n', ' ');
          if ((paramak.field_atCount <= 0) || (paramak.field_unReadCount <= 0))
            break label815;
          paramak = new SpannableStringBuilder(this.zvJ.getString(2131301275));
          paramak.setSpan(new ForegroundColorSpan(-5569532), 0, paramak.length(), 33);
          paramak.append(" ").append(j.b(this.zvJ, str1, paramInt));
          AppMethodBeat.o(34623);
          break;
          localObject1 = (String)localObject1 + ": " + str1;
          break label565;
          localObject1 = s.mJ(paramak.field_digestUser);
          break label621;
        }
      }
      catch (Exception localException)
      {
      }
    label815: if ((paramBoolean) && (paramak.field_unReadCount > 1))
      localObject2 = this.zvJ.getString(2131301278, new Object[] { Integer.valueOf(paramak.field_unReadCount), str1 });
    while (true)
    {
      paramak = j.b(this.zvJ, (CharSequence)localObject2, paramInt);
      AppMethodBeat.o(34623);
      break;
      localObject2 = str1;
      if (paramak.field_unReadCount > 1)
      {
        localObject2 = str1;
        if (t.ny(paramak.field_parentRef))
          localObject2 = this.zvJ.getString(2131301278, new Object[] { Integer.valueOf(paramak.field_unReadCount), str1 });
      }
    }
  }

  private CharSequence h(ak paramak)
  {
    AppMethodBeat.i(34622);
    if (paramak.field_status == 1)
    {
      paramak = this.zvJ.getString(2131301306);
      AppMethodBeat.o(34622);
    }
    while (true)
    {
      return paramak;
      if (paramak.field_conversationTime == 9223372036854775807L)
      {
        paramak = "";
        AppMethodBeat.o(34622);
      }
      else
      {
        paramak = com.tencent.mm.pluginsdk.f.h.c(this.zvJ, paramak.field_conversationTime, true);
        AppMethodBeat.o(34622);
      }
    }
  }

  public final ak Py(int paramInt)
  {
    AppMethodBeat.i(34619);
    Object localObject = (String)SettingCheckUnProcessWalletConvUI.d(this.zvJ).get(paramInt);
    aw.ZK();
    localObject = c.XR().aoZ((String)localObject);
    AppMethodBeat.o(34619);
    return localObject;
  }

  public final int getCount()
  {
    AppMethodBeat.i(34618);
    int i = SettingCheckUnProcessWalletConvUI.d(this.zvJ).size();
    AppMethodBeat.o(34618);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(34620);
    if (paramView == null)
    {
      paramViewGroup = new SettingCheckUnProcessWalletConvUI.a.b(this, (byte)0);
      if (a.ga(this.zvJ))
      {
        paramView = View.inflate(this.zvJ, 2130969242, null);
        paramViewGroup.ejo = ((ImageView)paramView.findViewById(2131821183));
        paramViewGroup.yEc = ((NoMeasuredTextView)paramView.findViewById(2131823149));
        paramViewGroup.zrV = ((NoMeasuredTextView)paramView.findViewById(2131821512));
        paramViewGroup.yEd = ((NoMeasuredTextView)paramView.findViewById(2131823150));
        paramViewGroup.yEe = ((NoMeasuredTextView)paramView.findViewById(2131823151));
        paramViewGroup.jJV = ((TextView)paramView.findViewById(2131821067));
        paramViewGroup.jJV.setBackgroundResource(r.ik(this.zvJ));
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
      }
    }
    ak localak;
    while (true)
    {
      localak = Py(paramInt);
      if (localak != null)
        break label384;
      AppMethodBeat.o(34620);
      return paramView;
      paramView = View.inflate(this.zvJ, 2130969241, null);
      break;
      paramViewGroup = (SettingCheckUnProcessWalletConvUI.a.b)paramView.getTag();
    }
    label384: a.b.b(paramViewGroup.ejo, localak.field_username);
    paramViewGroup.ejo.getDrawable();
    String str1 = localak.field_username;
    Object localObject1 = (SettingCheckUnProcessWalletConvUI.a.a)this.yDY.get(str1);
    Object localObject2 = localObject1;
    boolean bool;
    if (localObject1 == null)
    {
      localObject1 = new SettingCheckUnProcessWalletConvUI.a.a(this, (byte)0);
      ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).zrL = -1;
      ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).zrK = -1;
      ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).zrQ = false;
      ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).zrS = false;
      ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).zrR = false;
      ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).mgQ = t.kH(localak.field_username);
      if ((((SettingCheckUnProcessWalletConvUI.a.a)localObject1).mgQ) && (((SettingCheckUnProcessWalletConvUI.a.a)localObject1).zrR) && (localak.field_unReadCount > 0))
      {
        bool = true;
        label515: ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).zrP = bool;
        ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).klY = 0;
        if ((FB(localak.field_msgType) == 34) && (localak.field_isSend == 0) && (!ah.isNullOrNil(localak.field_content)))
        {
          String str2 = localak.field_content;
          if (!str1.equals("qmessage"))
          {
            localObject2 = str2;
            if (!str1.equals("floatbottle"));
          }
          else
          {
            String[] arrayOfString = str2.split(":");
            localObject2 = str2;
            if (arrayOfString != null)
            {
              localObject2 = str2;
              if (arrayOfString.length > 3)
                localObject2 = arrayOfString[1] + ":" + arrayOfString[2] + ":" + arrayOfString[3];
            }
          }
          if (!new n((String)localObject2).fWX)
            ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).klY = 1;
        }
        localObject2 = s.mJ(str1);
        if ((!((SettingCheckUnProcessWalletConvUI.a.a)localObject1).mgQ) || (localObject2 != null))
          break label1238;
        ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).nickName = this.zvJ.getString(2131298223);
        label724: ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).zrH = h(localak);
        ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).zrI = c(localak, (int)paramViewGroup.yEe.getTextSize(), ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).zrP);
        ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).zrT = localak.field_attrflag;
      }
    }
    else
    {
      switch (localak.field_status)
      {
      case 3:
      case 4:
      default:
        paramInt = -1;
        label814: ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).zrJ = paramInt;
        ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).zrM = t.a(localak);
        aw.ZK();
        ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).yDZ = c.XR().g(localak);
        ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).zrN = false;
        ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).zrO = aa.don();
        this.yDY.put(str1, localObject1);
        localObject2 = localObject1;
        if (((SettingCheckUnProcessWalletConvUI.a.a)localObject2).zrH == null)
          ((SettingCheckUnProcessWalletConvUI.a.a)localObject2).zrH = h(localak);
        if ((((SettingCheckUnProcessWalletConvUI.a.a)localObject2).zrP) || (t.ny(localak.field_parentRef)))
        {
          paramViewGroup.yEe.setTextColor(this.yDX[0]);
          label930: if (!str1.toLowerCase().endsWith("@t.qq.com"))
            break label1309;
          paramViewGroup.yEc.setCompoundRightDrawablesWithIntrinsicBounds(2130839085);
          paramViewGroup.yEc.setDrawRightDrawable(true);
          label961: paramInt = ((SettingCheckUnProcessWalletConvUI.a.a)localObject2).zrJ;
          if (paramInt == -1)
            break label1320;
          paramViewGroup.yEe.setCompoundLeftDrawablesWithIntrinsicBounds(paramInt);
          paramViewGroup.yEe.setDrawLeftDrawable(true);
          label988: paramViewGroup.yEc.setText(((SettingCheckUnProcessWalletConvUI.a.a)localObject2).nickName);
          paramViewGroup.zrV.setVisibility(8);
          localObject1 = paramViewGroup.yEd.getLayoutParams();
          if (((SettingCheckUnProcessWalletConvUI.a.a)localObject2).zrH.length() <= 9)
            break label1331;
          if (((ViewGroup.LayoutParams)localObject1).width != this.zry)
          {
            ((ViewGroup.LayoutParams)localObject1).width = this.zry;
            paramViewGroup.yEd.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          }
          label1063: ab.v("MicroMsg.SettingCheckUnProcessWalletConvUI", "layout update time width %d", new Object[] { Integer.valueOf(((ViewGroup.LayoutParams)localObject1).width) });
          paramViewGroup.yEd.setText(((SettingCheckUnProcessWalletConvUI.a.a)localObject2).zrH);
          paramViewGroup.yEe.setText(((SettingCheckUnProcessWalletConvUI.a.a)localObject2).zrI);
          if ((!((SettingCheckUnProcessWalletConvUI.a.a)localObject2).mgQ) || (!((SettingCheckUnProcessWalletConvUI.a.a)localObject2).zrR))
            break label1364;
          paramViewGroup.yEf.setVisibility(0);
          label1135: a.b.b(paramViewGroup.ejo, str1);
          if ((!((SettingCheckUnProcessWalletConvUI.a.a)localObject2).zrM) && (((SettingCheckUnProcessWalletConvUI.a.a)localObject2).yDZ) && (aw.RK()))
          {
            aw.ZK();
            c.XR().f(localak);
          }
          if ((!((SettingCheckUnProcessWalletConvUI.a.a)localObject2).yDZ) || (localak.field_conversationTime == -1L))
            break label1395;
          paramView.findViewById(2131823147).setBackgroundResource(2130838395);
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
      paramViewGroup.yEg.setVisibility(8);
      AppMethodBeat.o(34620);
      break;
      bool = false;
      break label515;
      label1238: ((SettingCheckUnProcessWalletConvUI.a.a)localObject1).nickName = j.b(this.zvJ, s.mJ(str1), paramViewGroup.yEc.getTextSize());
      break label724;
      paramInt = -1;
      break label814;
      paramInt = 2131231663;
      break label814;
      paramInt = -1;
      break label814;
      paramInt = 2131231662;
      break label814;
      paramViewGroup.yEe.setTextColor(this.yDX[localObject2.klY]);
      break label930;
      label1309: paramViewGroup.yEc.setDrawRightDrawable(false);
      break label961;
      label1320: paramViewGroup.yEe.setDrawLeftDrawable(false);
      break label988;
      label1331: if (((ViewGroup.LayoutParams)localObject1).width == this.zrx)
        break label1063;
      ((ViewGroup.LayoutParams)localObject1).width = this.zrx;
      paramViewGroup.yEd.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      break label1063;
      label1364: if (((SettingCheckUnProcessWalletConvUI.a.a)localObject2).zrN)
      {
        paramViewGroup.yEf.setVisibility(0);
        break label1135;
      }
      paramViewGroup.yEf.setVisibility(8);
      break label1135;
      label1395: paramView.findViewById(2131823147).setBackgroundResource(2130838396);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI.a
 * JD-Core Version:    0.6.2
 */