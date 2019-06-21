package com.tencent.mm.cb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.e.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.SmileyInfo;
import com.tencent.mm.storage.emotion.r;
import java.util.ArrayList;

public class e
{
  private static e xFX = null;
  private String country;
  private String[] xFY;
  private String[] xFZ;
  private String[] xGa;
  private ArrayList<r> xGb;
  private SparseArray<r> xGc;

  public e(Context paramContext)
  {
    AppMethodBeat.i(62666);
    this.xGb = new ArrayList();
    this.xGc = new SparseArray();
    this.xFY = paramContext.getResources().getStringArray(2131755036);
    this.xFZ = paramContext.getResources().getStringArray(2131755037);
    this.xGa = paramContext.getResources().getStringArray(2131755038);
    this.xGb.clear();
    this.xGc.clear();
    dqJ();
    this.country = aa.dor();
    AppMethodBeat.o(62666);
  }

  private void dqJ()
  {
    int i = 0;
    AppMethodBeat.i(62667);
    if ((this.xFY != null) && (this.xGa != null))
    {
      int j = this.xFY.length;
      int k = 0;
      r localr;
      for (int m = 0; k < j; m++)
      {
        localr = new r(m, this.xFY[k]);
        this.xGb.add(localr);
        this.xGc.put(m, localr);
        k++;
      }
      j = this.xGa.length;
      k = i;
      while (k < j)
      {
        localr = new r(m, this.xGa[k]);
        this.xGb.add(localr);
        this.xGc.put(m, localr);
        k++;
        m++;
      }
    }
    AppMethodBeat.o(62667);
  }

  public static e dqK()
  {
    AppMethodBeat.i(62670);
    if (xFX == null);
    try
    {
      e locale = new com/tencent/mm/cb/e;
      locale.<init>(ah.getContext());
      xFX = locale;
      locale = xFX;
      AppMethodBeat.o(62670);
      return locale;
    }
    finally
    {
      AppMethodBeat.o(62670);
    }
  }

  public int aRs()
  {
    AppMethodBeat.i(62668);
    ab.i("MicroMsg.MergerSmileyManager", "updateSmileyPanelInfo " + bo.dpG());
    this.xGb.clear();
    ArrayList localArrayList1 = ((PluginEmoji)g.M(PluginEmoji.class)).getEmojiMgr().bjP();
    if ((localArrayList1 == null) || (localArrayList1.isEmpty()))
      localArrayList1 = a.b(new com.tencent.mm.vfs.b("assets:///panel/".concat(String.valueOf(((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().bjS()))));
    while (true)
    {
      if ((localArrayList1 != null) && (!localArrayList1.isEmpty()))
      {
        ArrayList localArrayList2 = f.dqL().dqP();
        int i = localArrayList1.size();
        int j = 0;
        k = 0;
        if (j < i)
        {
          r localr = (r)localArrayList1.get(j);
          String str = localr.field_key;
          if ((str.startsWith("[")) && (!localArrayList2.contains(str)))
            ab.i("MicroMsg.MergerSmileyManager", "no smiley info. key:%s", new Object[] { str });
          while (true)
          {
            j++;
            break;
            this.xGb.add(localr);
            this.xGc.put(k, localr);
            k++;
          }
        }
      }
      for (int k = 0; ; k = -1)
      {
        AppMethodBeat.o(62668);
        return k;
        dqJ();
        ab.i("MicroMsg.MergerSmileyManager", "smiley panel list is null.");
      }
    }
  }

  public int aRt()
  {
    AppMethodBeat.i(62669);
    int i;
    if (this.xGb == null)
    {
      i = 0;
      AppMethodBeat.o(62669);
    }
    while (true)
    {
      return i;
      i = this.xGb.size();
      AppMethodBeat.o(62669);
    }
  }

  public String getText(int paramInt)
  {
    AppMethodBeat.i(62672);
    Object localObject;
    if ((paramInt < 0) || (paramInt >= this.xGb.size()))
    {
      ab.w("MicroMsg.MergerSmileyManager", "get text, error index");
      localObject = "";
      AppMethodBeat.o(62672);
    }
    while (true)
    {
      return localObject;
      localObject = (r)this.xGb.get(paramInt);
      if (localObject != null)
      {
        SmileyInfo localSmileyInfo = f.dqL().anY(((r)localObject).field_key);
        if (localSmileyInfo != null)
        {
          if ((this.country.equals("zh_CN")) && (!bo.isNullOrNil(localSmileyInfo.field_cnValue)))
          {
            localObject = localSmileyInfo.field_cnValue;
            AppMethodBeat.o(62672);
          }
          else if (((this.country.equals("zh_TW")) || (this.country.equals("zh_HK"))) && (!bo.isNullOrNil(localSmileyInfo.field_twValue)))
          {
            localObject = localSmileyInfo.field_twValue;
            AppMethodBeat.o(62672);
          }
          else
          {
            localObject = localSmileyInfo.field_enValue;
            AppMethodBeat.o(62672);
          }
        }
        else
        {
          localObject = ((r)localObject).field_key;
          AppMethodBeat.o(62672);
        }
      }
      else
      {
        localObject = "";
        AppMethodBeat.o(62672);
      }
    }
  }

  public Drawable qJ(int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(62671);
    if (this.xGc == null)
    {
      ab.i("MicroMsg.MergerSmileyManager", "getSmileyDrawable smiley panel map is null.");
      AppMethodBeat.o(62671);
    }
    while (true)
    {
      return localObject1;
      localObject2 = (r)this.xGc.get(paramInt);
      if (localObject2 != null)
        break;
      ab.i("MicroMsg.MergerSmileyManager", "getSmileyDrawable smiley info is null.");
      AppMethodBeat.o(62671);
    }
    localObject1 = f.dqL().anY(((r)localObject2).field_key);
    if (localObject1 != null)
    {
      f.dqL();
      paramInt = ((SmileyInfo)localObject1).field_position;
      if (paramInt >= 0);
      for (localObject1 = b.dqD().qJ(paramInt); ; localObject1 = f.anX(((SmileyInfo)localObject1).field_fileName))
      {
        AppMethodBeat.o(62671);
        break;
      }
    }
    localObject1 = b.dqD();
    Object localObject2 = ((r)localObject2).field_key;
    if (bo.isNullOrNil((String)localObject2))
    {
      ab.i("MicroMsg.EmojiHelper", "getEmoji item failed. key is null.");
      localObject1 = null;
    }
    while (true)
    {
      localObject1 = b.dqD().a((c)localObject1, true);
      break;
      paramInt = ((String)localObject2).codePointAt(0);
      if (((b)localObject1).Mi(paramInt) != null)
        localObject1 = ((b)localObject1).Mi(paramInt);
      else
        localObject1 = ((b)localObject1).gY(paramInt, 0);
    }
  }

  public String qK(int paramInt)
  {
    AppMethodBeat.i(62674);
    Object localObject1;
    if (paramInt < 0)
    {
      ab.w("MicroMsg.MergerSmileyManager", "get emoji text, error index down");
      localObject1 = "";
      AppMethodBeat.o(62674);
    }
    while (true)
    {
      return localObject1;
      Object localObject2 = dqK().xGa[paramInt].split(" ");
      localObject1 = Character.toChars(Integer.decode(localObject2[0]).intValue());
      char[] arrayOfChar = Character.toChars(Integer.decode(localObject2[1]).intValue());
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((char[])localObject1);
      ((StringBuilder)localObject2).append(arrayOfChar);
      localObject1 = ((StringBuilder)localObject2).toString();
      AppMethodBeat.o(62674);
    }
  }

  public String qL(int paramInt)
  {
    AppMethodBeat.i(62673);
    Object localObject;
    if (paramInt < 0)
    {
      ab.w("MicroMsg.MergerSmileyManager", "get text, error index");
      localObject = "";
      AppMethodBeat.o(62673);
    }
    while (true)
    {
      return localObject;
      localObject = (r)this.xGb.get(paramInt);
      if (localObject != null)
      {
        localObject = ((r)localObject).field_key;
        AppMethodBeat.o(62673);
      }
      else
      {
        localObject = "";
        AppMethodBeat.o(62673);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cb.e
 * JD-Core Version:    0.6.2
 */