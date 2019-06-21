package com.tencent.mm.plugin.messenger.b;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.a.e;
import com.tencent.mm.plugin.messenger.a.e.a;
import com.tencent.mm.plugin.messenger.a.e.b;
import com.tencent.mm.plugin.messenger.a.e.c;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class a
  implements e
{
  private Map<String, LinkedList<e.b>> oqU;
  private Map<String, LinkedList<e.a>> oqV;
  private Map<String, HashSet<e.c>> oqW;
  private com.tencent.mm.at.a.d.a<Long, CharSequence> oqX;
  private com.tencent.mm.at.a.d.a<Long, CharSequence> oqY;
  public o oqZ;

  public a()
  {
    AppMethodBeat.i(136923);
    this.oqU = new HashMap();
    this.oqV = new HashMap();
    this.oqW = new HashMap();
    this.oqX = new com.tencent.mm.at.a.d.a(200);
    this.oqY = new com.tencent.mm.at.a.d.a(500);
    this.oqZ = new a.1(this);
    AppMethodBeat.o(136923);
  }

  private static void J(CharSequence paramCharSequence)
  {
    int i = 0;
    AppMethodBeat.i(136934);
    if ((paramCharSequence != null) && (paramCharSequence.length() > 0) && ((paramCharSequence instanceof Spanned)))
    {
      paramCharSequence = (ClickableSpan[])((Spanned)paramCharSequence).getSpans(0, paramCharSequence.length(), ClickableSpan.class);
      if ((paramCharSequence != null) && (paramCharSequence.length > 0))
      {
        int j = paramCharSequence.length;
        while (i < j)
        {
          if (!(paramCharSequence[i] instanceof com.tencent.mm.ui.base.a.a))
          {
            paramCharSequence = new IllegalArgumentException("hy: actively throw Exception!!! all clickable spans must be instance of com.tencent.mm.ui.base.span.IPressableSpan!");
            AppMethodBeat.o(136934);
            throw paramCharSequence;
          }
          i++;
        }
      }
    }
    AppMethodBeat.o(136934);
  }

  private static boolean RD(String paramString)
  {
    AppMethodBeat.i(136937);
    boolean bool;
    if (("tmpl_type_profile".equals(paramString)) || ("tmpl_type_profilewithrevoke".equals(paramString)) || ("tmpl_type_profilewithrevokeqrcode".equals(paramString)) || ("tmpl_type_wxappnotifywithview".equals(paramString)) || ("tmpl_type_succeed_contact".equals(paramString)) || ("tmpl_type_jump_chat".equals(paramString)))
    {
      bool = true;
      AppMethodBeat.o(136937);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(136937);
    }
  }

  private static boolean RE(String paramString)
  {
    AppMethodBeat.i(136938);
    boolean bool;
    if (("link_profile".equals(paramString)) || ("link_revoke".equals(paramString)) || ("link_revoke_qrcode".equals(paramString)) || ("link_plain".equals(paramString)) || ("link_view_wxapp".equals(paramString)) || ("link_succeed_contact".equals(paramString)) || ("link_jump_chat".equals(paramString)) || ("link_admin_explain".equals(paramString)))
    {
      bool = true;
      AppMethodBeat.o(136938);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(136938);
    }
  }

  private CharSequence a(Map<String, String> paramMap, Bundle paramBundle, WeakReference<Context> paramWeakReference, int paramInt)
  {
    AppMethodBeat.i(136932);
    ArrayList localArrayList1 = new ArrayList();
    int i = 0;
    Object localObject1 = new StringBuilder();
    Object localObject2;
    if (i == 0)
    {
      localObject2 = "";
      label35: localObject2 = localObject2;
      localObject2 = ".sysmsg.sysmsgtemplate.content_template" + (String)localObject2;
      if (bo.isNullOrNil((String)paramMap.get(localObject2)))
        break label862;
      localObject1 = (String)paramMap.get((String)localObject2 + ".$type");
      if (!RD((String)localObject1))
      {
        ab.w("MicroMsg.SysMsgTemplateImp", "hy: non supported type: %s", new Object[] { localObject1 });
        localArrayList1.add(q((String)localObject2, paramMap));
      }
      localObject2 = (String)paramMap.get((String)localObject2 + ".template");
      ab.v("MicroMsg.SysMsgTemplateImp", "hy: rawTemplate : %s", new Object[] { localObject2 });
      localObject2 = b.RF((String)localObject2);
      if (localObject2 != null)
        break label278;
    }
    label278: for (int j = 0; ; j = ((ArrayList)localObject2).size())
    {
      ab.d("MicroMsg.SysMsgTemplateImp", "hy: parsed %d models", new Object[] { Integer.valueOf(j) });
      if ((localObject2 != null) && (((ArrayList)localObject2).size() != 0))
        break label288;
      localArrayList1.add(new SpannableString(""));
      i++;
      break;
      localObject2 = Integer.valueOf(i);
      break label35;
    }
    label288: ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = ((ArrayList)localObject2).iterator();
    label651: label909: label910: 
    while (true)
    {
      label304: b.a locala;
      if (localIterator.hasNext())
      {
        locala = (b.a)localIterator.next();
        if (locala.type == 0)
        {
          localArrayList2.add(new SpannableString(j.b(ah.getContext(), locala.content)));
        }
        else if (locala.type == 1)
        {
          j = 0;
          localObject2 = ".sysmsg.sysmsgtemplate.content_template" + ".link_list.link";
          if (j == 0)
            break label909;
          localObject2 = (String)localObject2 + j;
        }
      }
      else
      {
        while (true)
        {
          if (bo.isNullOrNil((String)paramMap.get(localObject2)))
            break label910;
          localObject1 = (String)paramMap.get((String)localObject2 + ".$name");
          String str;
          label553: boolean bool;
          if (locala.content.equals(localObject1))
          {
            str = (String)paramMap.get((String)localObject2 + ".$type");
            if (paramInt != 0)
              break label690;
            localObject1 = (List)this.oqU.get(str);
            if ((localObject1 != null) && (((List)localObject1).size() > 0))
              break label626;
            localObject1 = null;
            if ((RE(str)) && (localObject1 != null))
              break label657;
            str = bo.bc(str, "");
            if (localObject1 != null)
              break label651;
            bool = true;
            label583: ab.i("MicroMsg.SysMsgTemplateImp", "alvinluo not support link type: %s or listener == null: %b", new Object[] { str, Boolean.valueOf(bool) });
            localArrayList2.add(q((String)localObject2, paramMap));
          }
          label783: 
          while (true)
          {
            j++;
            break;
            label626: localObject1 = (e.b)((LinkedList)this.oqU.get(str)).getLast();
            break label553;
            bool = false;
            break label583;
            label657: localObject2 = ((e.b)localObject1).a(paramMap, (String)localObject2, paramBundle, paramWeakReference);
            J((CharSequence)localObject2);
            localArrayList2.add(nullAsNil((CharSequence)localObject2));
            continue;
            label690: if (paramInt == 1)
            {
              localObject1 = (List)this.oqV.get(str);
              if ((localObject1 == null) || (((List)localObject1).size() <= 0));
              for (localObject1 = null; ; localObject1 = (e.a)((LinkedList)this.oqV.get(str)).getLast())
              {
                if ((RE(str)) && (localObject1 != null))
                  break label783;
                localArrayList2.add(q((String)localObject2, paramMap));
                break;
              }
              localArrayList2.add(bo.nullAsNil(((e.a)localObject1).g(paramMap, (String)localObject2)));
            }
            else
            {
              ab.e("MicroMsg.SysMsgTemplateImp", "hy: not supported digest type");
            }
          }
          ab.e("MicroMsg.SysMsgTemplateImp", "hy: invalid! should not get here");
          break label304;
          localObject2 = concactSpannable(localArrayList2);
          ab.v("MicroMsg.SysMsgTemplateImp", "hy: concatedvalue is %s", new Object[] { localObject2 });
          localArrayList1.add(localObject2);
          break;
          label862: if (localArrayList1.size() == 0)
          {
            ab.w("MicroMsg.SysMsgTemplateImp", "hy: not handled");
            paramMap = new SpannableString("");
            AppMethodBeat.o(136932);
          }
          while (true)
          {
            return paramMap;
            paramMap = concactSpannable(localArrayList1);
            AppMethodBeat.o(136932);
          }
        }
      }
    }
  }

  private static CharSequence concactSpannable(ArrayList<CharSequence> paramArrayList)
  {
    AppMethodBeat.i(136935);
    SpannableString localSpannableString = new SpannableString("");
    Iterator localIterator = paramArrayList.iterator();
    for (paramArrayList = localSpannableString; localIterator.hasNext(); paramArrayList = TextUtils.concat(new CharSequence[] { paramArrayList, (CharSequence)localIterator.next() }));
    AppMethodBeat.o(136935);
    return paramArrayList;
  }

  private static CharSequence nullAsNil(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(136933);
    if ((paramCharSequence == null) || (paramCharSequence.length() == 0))
    {
      paramCharSequence = new SpannableString("");
      AppMethodBeat.o(136933);
    }
    while (true)
    {
      return paramCharSequence;
      AppMethodBeat.o(136933);
    }
  }

  private static CharSequence q(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(136936);
    int i;
    if (bo.getInt((String)paramMap.get(paramString + ".$hidden"), 0) == 1)
    {
      i = 1;
      if (i == 0)
        break label80;
      ab.v("MicroMsg.SysMsgTemplateImp", "hy: hide");
      paramString = new SpannableString("");
      AppMethodBeat.o(136936);
    }
    while (true)
    {
      return paramString;
      i = 0;
      break;
      label80: paramString = (String)paramMap.get(paramString + ".plain");
      paramString = new SpannableString(j.b(ah.getContext(), bo.nullAsNil(paramString)));
      AppMethodBeat.o(136936);
    }
  }

  public final void QB(String paramString)
  {
    AppMethodBeat.i(136927);
    ab.i("MicroMsg.SysMsgTemplateImp", "hy: removing template listener: %s", new Object[] { paramString });
    if (!this.oqU.containsKey(paramString))
      ab.w("MicroMsg.SysMsgTemplateImp", "[removeTemplateListener] mHandleListener is not contains this linkName:%s", new Object[] { paramString });
    LinkedList localLinkedList = (LinkedList)this.oqU.get(paramString);
    ab.i("MicroMsg.SysMsgTemplateImp", "[removeTemplateListener] linkName(%s) list size:%s", new Object[] { paramString, Integer.valueOf(localLinkedList.size()) });
    if (localLinkedList.size() > 0)
      localLinkedList.removeLast();
    AppMethodBeat.o(136927);
  }

  public final void QC(String paramString)
  {
    AppMethodBeat.i(136929);
    ab.i("MicroMsg.SysMsgTemplateImp", "hy: removing digest listener: %s", new Object[] { paramString });
    if (!this.oqV.containsKey(paramString))
      ab.w("MicroMsg.SysMsgTemplateImp", "[removeTemplateListener] mHandleListener is not contains this linkName:%s", new Object[] { paramString });
    LinkedList localLinkedList = (LinkedList)this.oqV.get(paramString);
    ab.i("MicroMsg.SysMsgTemplateImp", "[removeDigestListener] linkName(%s) list size:%s", new Object[] { paramString, Integer.valueOf(localLinkedList.size()) });
    if (localLinkedList.size() > 0)
      localLinkedList.removeLast();
    AppMethodBeat.o(136929);
  }

  public final CharSequence QD(String paramString)
  {
    AppMethodBeat.i(136931);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.SysMsgTemplateImp", "hy: [digest] request translate content is null!");
      AppMethodBeat.o(136931);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      paramString = br.z(paramString, "sysmsg");
      if (paramString == null)
      {
        ab.i("MicroMsg.SysMsgTemplateImp", "hy: [digest] not retrieved sysmsg from new xml!");
        AppMethodBeat.o(136931);
        paramString = null;
      }
      else
      {
        String str = (String)paramString.get(".sysmsg.$type");
        if ((bo.isNullOrNil(str)) || (!"sysmsgtemplate".equals(str)))
        {
          ab.w("MicroMsg.SysMsgTemplateImp", "hy: [digest] not acceptable sysmsg: %s", new Object[] { str });
          AppMethodBeat.o(136931);
          paramString = null;
        }
        else
        {
          paramString = a(paramString, null, null, 1);
          AppMethodBeat.o(136931);
        }
      }
    }
  }

  public final CharSequence a(String paramString, Bundle paramBundle, WeakReference<Context> paramWeakReference)
  {
    AppMethodBeat.i(136930);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.SysMsgTemplateImp", "hy: request translate content is null!");
      AppMethodBeat.o(136930);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Map localMap = br.z(paramString, "sysmsg");
      if (localMap == null)
      {
        ab.i("MicroMsg.SysMsgTemplateImp", "hy: not retrieved sysmsg from new xml!");
        AppMethodBeat.o(136930);
        paramString = null;
      }
      else
      {
        paramString = (String)localMap.get(".sysmsg.$type");
        if ((bo.isNullOrNil(paramString)) || (!"sysmsgtemplate".equals(paramString)))
        {
          ab.w("MicroMsg.SysMsgTemplateImp", "hy: not acceptable sysmsg: %s", new Object[] { paramString });
          AppMethodBeat.o(136930);
          paramString = null;
        }
        else
        {
          paramString = a(localMap, paramBundle, paramWeakReference, 0);
          AppMethodBeat.o(136930);
        }
      }
    }
  }

  public final void a(String paramString, e.a parama)
  {
    AppMethodBeat.i(136928);
    ab.i("MicroMsg.SysMsgTemplateImp", "hy: adding digest listener: %s", new Object[] { paramString });
    if (!this.oqV.containsKey(paramString))
      this.oqV.put(paramString, new LinkedList());
    if (!((List)this.oqV.get(paramString)).contains(parama))
      ((LinkedList)this.oqV.get(paramString)).add(parama);
    AppMethodBeat.o(136928);
  }

  public final void a(String paramString, e.b paramb)
  {
    AppMethodBeat.i(136926);
    ab.i("MicroMsg.SysMsgTemplateImp", "hy: adding template listener: %s", new Object[] { paramString });
    if (!this.oqU.containsKey(paramString))
      this.oqU.put(paramString, new LinkedList());
    if (!((List)this.oqU.get(paramString)).contains(paramb))
      ((LinkedList)this.oqU.get(paramString)).add(paramb);
    AppMethodBeat.o(136926);
  }

  public final void a(String paramString, e.c paramc)
  {
    AppMethodBeat.i(136924);
    al.d(new a.2(this, paramString, paramc));
    AppMethodBeat.o(136924);
  }

  public final void b(String paramString, e.c paramc)
  {
    AppMethodBeat.i(136925);
    al.d(new a.3(this, paramString, paramc));
    AppMethodBeat.o(136925);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.b.a
 * JD-Core Version:    0.6.2
 */