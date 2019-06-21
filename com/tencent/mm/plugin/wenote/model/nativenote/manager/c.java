package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.text.Editable;
import android.text.Spanned;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.wenote.model.a.g;
import com.tencent.mm.plugin.wenote.model.a.i;
import com.tencent.mm.plugin.wenote.model.a.k;
import com.tencent.mm.plugin.wenote.model.a.l;
import com.tencent.mm.plugin.wenote.model.a.o;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c
{
  private static volatile c uOZ = null;
  public ArrayList<com.tencent.mm.plugin.wenote.model.a.c> iPr = null;
  public com.tencent.mm.plugin.wenote.model.nativenote.b.a uPa = null;
  public aar uPb = null;
  public int uPc = 0;
  public int uPd = 0;
  public int uPe = 0;
  public boolean uPf = false;

  private boolean Kf(int paramInt)
  {
    AppMethodBeat.i(26725);
    if ((this.iPr != null) && (paramInt >= 0) && (paramInt < this.iPr.size()))
    {
      a((com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(paramInt), false);
      this.iPr.remove(paramInt);
    }
    for (boolean bool = true; ; bool = false)
    {
      AppMethodBeat.o(26725);
      return bool;
    }
  }

  private void a(com.tencent.mm.plugin.wenote.model.a.c paramc, boolean paramBoolean)
  {
    AppMethodBeat.i(26748);
    if (paramc == null)
      AppMethodBeat.o(26748);
    while (true)
    {
      return;
      if (paramc.getType() == 1)
      {
        int i = com.tencent.mm.plugin.wenote.b.c.ahl(((i)paramc).content);
        if (paramBoolean)
        {
          this.uPd = (i + this.uPd);
          AppMethodBeat.o(26748);
        }
        else
        {
          this.uPd -= i;
          AppMethodBeat.o(26748);
        }
      }
      else if (paramBoolean)
      {
        this.uPe += 1;
        AppMethodBeat.o(26748);
      }
      else
      {
        this.uPe -= 1;
        AppMethodBeat.o(26748);
      }
    }
  }

  private void b(com.tencent.mm.plugin.wenote.model.a.c paramc)
  {
    AppMethodBeat.i(26744);
    if (paramc == null)
    {
      AppMethodBeat.o(26744);
      return;
    }
    o localo = (o)paramc;
    com.tencent.mm.plugin.wenote.model.d locald;
    if (localo.getType() > 1)
    {
      if (bo.isNullOrNil(localo.uOo))
        localo.uOo = det();
      locald = com.tencent.mm.plugin.wenote.model.c.ddG().uMN;
      if (locald != null)
        break label107;
      ab.e("MicroMsg.Note.NoteDataManager", "processItem,item is %s, but get wnnote base is null", new Object[] { paramc.toString() });
    }
    while (true)
    {
      if (bo.isNullOrNil(paramc.mnd))
        paramc.mnd = com.tencent.mm.plugin.wenote.model.f.agW(paramc.toString());
      AppMethodBeat.o(26744);
      break;
      label107: if (locald.uMT == null)
        ab.e("MicroMsg.Note.NoteDataManager", "processItem,item is %s, but mEditorIdToDataItem is null", new Object[] { paramc.toString() });
      else
        locald.uMT.put(localo.uOo, localo);
    }
  }

  private boolean b(int paramInt, com.tencent.mm.plugin.wenote.model.a.c paramc)
  {
    boolean bool = true;
    AppMethodBeat.i(26723);
    if ((paramc != null) && (this.iPr != null) && (paramInt >= 0) && (paramInt <= this.iPr.size()))
    {
      this.iPr.add(paramInt, paramc);
      a(paramc, true);
    }
    while (true)
    {
      AppMethodBeat.o(26723);
      return bool;
      bool = false;
    }
  }

  private static String dO(String paramString, int paramInt)
  {
    AppMethodBeat.i(26739);
    paramString = String.format("<div><object data-type=\"%d\" id=\"%s\" name=\"%s\" class=\"item item-\"></object></div>", new Object[] { Integer.valueOf(paramInt), paramString, paramString });
    AppMethodBeat.o(26739);
    return paramString;
  }

  public static c dem()
  {
    AppMethodBeat.i(26717);
    if (uOZ == null);
    try
    {
      if (uOZ == null)
      {
        localc = new com/tencent/mm/plugin/wenote/model/nativenote/manager/c;
        localc.<init>();
        uOZ = localc;
      }
      c localc = uOZ;
      AppMethodBeat.o(26717);
      return localc;
    }
    finally
    {
      AppMethodBeat.o(26717);
    }
  }

  private void deq()
  {
    AppMethodBeat.i(26733);
    if (this.iPr != null)
    {
      Iterator localIterator = this.iPr.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.wenote.model.a.c localc = (com.tencent.mm.plugin.wenote.model.a.c)localIterator.next();
        localc.uNT = false;
        localc.uNZ = false;
      }
    }
    AppMethodBeat.o(26733);
  }

  private String det()
  {
    AppMethodBeat.i(26737);
    if ((this.uPc == 0) && (this.iPr != null))
    {
      Iterator localIterator = this.iPr.iterator();
      while (localIterator.hasNext())
      {
        localObject = (o)localIterator.next();
        if (((o)localObject).uOo.startsWith("WeNote_"))
        {
          i = bo.getInt(((o)localObject).uOo.substring(7), -1);
          if (i > this.uPc);
          while (true)
          {
            this.uPc = i;
            break;
            i = this.uPc;
          }
        }
      }
    }
    Object localObject = new StringBuilder("WeNote_");
    int i = this.uPc + 1;
    this.uPc = i;
    localObject = i;
    AppMethodBeat.o(26737);
    return localObject;
  }

  public final com.tencent.mm.plugin.wenote.model.a.c Ke(int paramInt)
  {
    AppMethodBeat.i(26719);
    com.tencent.mm.plugin.wenote.model.a.c localc;
    if ((this.iPr != null) && (paramInt >= 0) && (paramInt < this.iPr.size()))
    {
      localc = (com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(paramInt);
      AppMethodBeat.o(26719);
    }
    while (true)
    {
      return localc;
      localc = null;
      AppMethodBeat.o(26719);
    }
  }

  public final void Kg(int paramInt)
  {
    AppMethodBeat.i(26726);
    if (this.uPa != null)
      this.uPa.JX(paramInt);
    AppMethodBeat.o(26726);
  }

  public final int a(com.tencent.mm.plugin.wenote.model.a.c paramc, WXRTEditText paramWXRTEditText, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(26741);
    int i;
    if (paramc == null)
    {
      i = -1;
      AppMethodBeat.o(26741);
    }
    while (true)
    {
      return i;
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(paramc);
      i = a(localArrayList, paramWXRTEditText, true, paramBoolean1, paramBoolean2, paramBoolean3);
      AppMethodBeat.o(26741);
    }
  }

  public final int a(ArrayList<com.tencent.mm.plugin.wenote.model.a.c> paramArrayList, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(26743);
    if ((paramArrayList == null) || (paramArrayList.size() <= 0) || (this.iPr == null) || (paramInt2 < 0) || (paramInt3 < 0) || (paramInt4 < 0) || (paramInt4 < paramInt3))
    {
      ab.e("MicroMsg.Note.NoteDataManager", "pasteItemList,error,return");
      AppMethodBeat.o(26743);
      paramInt1 = -1;
    }
    Object localObject1;
    Object localObject2;
    while (true)
    {
      return paramInt1;
      if (com.tencent.mm.plugin.wenote.model.c.ddG().uMN == null)
      {
        ab.e("MicroMsg.Note.NoteDataManager", "pasteItemList, but get wnnote base is null, return");
        AppMethodBeat.o(26743);
        paramInt1 = -1;
      }
      else
      {
        localObject1 = (com.tencent.mm.plugin.wenote.model.a.c)paramArrayList.get(paramArrayList.size() - 1);
        if (localObject1 == null)
        {
          ab.e("MicroMsg.Note.NoteDataManager", "pasteItemList, lastInsertItem is null");
          AppMethodBeat.o(26743);
          paramInt1 = -1;
        }
        else
        {
          ((com.tencent.mm.plugin.wenote.model.a.c)localObject1).uNV = -1;
          ((com.tencent.mm.plugin.wenote.model.a.c)localObject1).uNT = true;
          ((com.tencent.mm.plugin.wenote.model.a.c)localObject1).uNZ = false;
          localObject2 = Ke(paramInt2);
          if (localObject2 != null)
            break;
          ab.e("MicroMsg.Note.NoteDataManager", "pasteItemList, item is null");
          AppMethodBeat.o(26743);
          paramInt1 = -1;
        }
      }
    }
    label908: label911: label916: 
    while (true)
    {
      try
      {
        deq();
        if ((paramInt1 == 0) && (((com.tencent.mm.plugin.wenote.model.a.c)localObject2).getType() == 1))
        {
          Object localObject3 = com.tencent.mm.plugin.wenote.model.nativenote.a.a.ahb(((i)localObject2).content);
          if ((localObject3 == null) || (paramInt3 > ((Spanned)localObject3).length()) || (paramInt4 > ((Spanned)localObject3).length()))
          {
            if (localObject3 == null)
            {
              paramInt1 = -1;
              ab.e("MicroMsg.Note.NoteDataManager", "pasteItemList error, oriText:%d  startOff:%d  endOff:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
              AppMethodBeat.o(26743);
              paramInt1 = -1;
              break;
            }
            paramInt1 = ((Spanned)localObject3).length();
            continue;
          }
          localObject1 = ((Spanned)localObject3).subSequence(0, paramInt3);
          CharSequence localCharSequence = ((Spanned)localObject3).subSequence(paramInt4, ((Spanned)localObject3).length());
          localObject3 = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a((Spanned)localObject1);
          localObject1 = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a((Spanned)localCharSequence);
          localObject2 = (i)localObject2;
          if (!bo.isNullOrNil((String)localObject3))
          {
            if (((String)localObject3).endsWith("<br/>"))
            {
              localObject3 = ((String)localObject3).substring(0, ((String)localObject3).length() - 5);
              ((i)localObject2).content = ((String)localObject3);
              paramInt2++;
              paramInt1 = paramInt2;
              if (!bo.isNullOrNil((String)localObject1))
              {
                localObject2 = new com/tencent/mm/plugin/wenote/model/a/i;
                ((i)localObject2).<init>();
                ((i)localObject2).type = 1;
                localObject3 = localObject1;
                if (((String)localObject1).startsWith("<br/>"))
                  localObject3 = ((String)localObject1).substring(5, ((String)localObject1).length());
                ((i)localObject2).content = ((String)localObject3);
                ((i)localObject2).uNV = 0;
                ((i)localObject2).uNT = false;
                ((i)localObject2).uNZ = false;
                b(paramInt2, (com.tencent.mm.plugin.wenote.model.a.c)localObject2);
                paramInt4 = 1;
                paramInt1 = paramInt2;
                paramInt3 = paramInt2;
                paramInt2 = paramInt1;
                paramInt1 = paramInt4;
                localObject1 = paramArrayList.iterator();
                i = paramInt3;
                j = paramInt1;
                paramInt4 = paramInt2;
                if (!((Iterator)localObject1).hasNext())
                  continue;
                paramArrayList = (com.tencent.mm.plugin.wenote.model.a.c)((Iterator)localObject1).next();
                b(paramArrayList);
                if (!b(paramInt3, paramArrayList))
                  break label916;
                paramInt3++;
                continue;
              }
            }
            else
            {
              continue;
            }
          }
          else
          {
            if (!bo.isNullOrNil((String)localObject1))
            {
              localObject3 = localObject1;
              if (((String)localObject1).startsWith("<br/>"))
                localObject3 = ((String)localObject1).substring(5, ((String)localObject1).length());
              ((i)localObject2).content = ((String)localObject3);
              paramInt1 = 0;
              paramInt4 = paramInt2;
              paramInt3 = paramInt2;
              paramInt2 = paramInt4;
              continue;
            }
            Kf(paramInt2);
            paramInt1 = paramInt2;
            if (this.uPa != null)
            {
              this.uPa.JZ(paramInt2);
              paramInt1 = paramInt2;
            }
          }
          paramInt4 = 0;
          paramInt2 = paramInt1;
          paramInt3 = paramInt1;
          paramInt1 = paramInt4;
          continue;
        }
        if (paramInt1 == 1)
          break label911;
        paramInt1 = paramInt2 + 1;
        localObject1 = paramArrayList.iterator();
        paramInt2 = paramInt1;
        if (((Iterator)localObject1).hasNext())
        {
          paramArrayList = (com.tencent.mm.plugin.wenote.model.a.c)((Iterator)localObject1).next();
          b(paramArrayList);
          if (!b(paramInt2, paramArrayList))
            break label908;
          paramInt2++;
          continue;
        }
        int j = 0;
        paramInt4 = paramInt1;
        int i = paramInt2;
        if ((i - 1 >= 0) && (i - 1 < dem().size()))
        {
          paramInt1 = i - 1;
          if (this.uPa != null)
          {
            paramInt3 = i - paramInt4;
            paramInt2 = paramInt3;
            if (j != 0)
              paramInt2 = paramInt3 + 1;
            if ((paramInt4 >= 0) && (paramInt2 > 0))
              this.uPa.gC(paramInt4, paramInt2);
            if (paramInt4 <= 0)
              break label880;
            this.uPa.gD(paramInt4 - 1, dem().size() - (paramInt4 - 1));
            this.uPa.Ka(paramInt1);
          }
          dew();
          AppMethodBeat.o(26743);
          break;
        }
      }
      finally
      {
        AppMethodBeat.o(26743);
      }
      paramInt1 = dem().size() - 1;
      continue;
      label880: if (paramInt4 == 0)
      {
        this.uPa.gD(paramInt4, dem().size() - paramInt4);
        continue;
        continue;
        paramInt1 = paramInt2;
      }
    }
  }

  public final int a(ArrayList<com.tencent.mm.plugin.wenote.model.a.c> paramArrayList, WXRTEditText paramWXRTEditText, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    AppMethodBeat.i(26742);
    int i;
    if ((paramArrayList == null) || (paramArrayList.size() <= 0) || (this.iPr == null))
    {
      ab.e("MicroMsg.Note.NoteDataManager", "insertItemList,error,return");
      AppMethodBeat.o(26742);
      i = -1;
    }
    while (true)
    {
      return i;
      if (com.tencent.mm.plugin.wenote.model.c.ddG().uMN == null)
      {
        ab.e("MicroMsg.Note.NoteDataManager", "insertItemList, but get wnnote base is null, return");
        AppMethodBeat.o(26742);
        i = -1;
      }
      else
      {
        if ((!paramBoolean2) || (!af(paramArrayList)) || (this.uPa == null))
          break;
        this.uPa.ddW();
        AppMethodBeat.o(26742);
        i = -1;
      }
    }
    Object localObject1;
    if (paramBoolean1)
    {
      localObject1 = (com.tencent.mm.plugin.wenote.model.a.c)paramArrayList.get(paramArrayList.size() - 1);
      ((com.tencent.mm.plugin.wenote.model.a.c)localObject1).uNV = -1;
      ((com.tencent.mm.plugin.wenote.model.a.c)localObject1).uNT = true;
      ((com.tencent.mm.plugin.wenote.model.a.c)localObject1).uNZ = false;
      if ((paramWXRTEditText != null) && (paramWXRTEditText.uQc))
      {
        if (paramWXRTEditText.getEditTextType() != 2)
          break label295;
        ((com.tencent.mm.plugin.wenote.model.a.c)localObject1).uOc = 2;
        label176: paramWXRTEditText.uQc = false;
        ((com.tencent.mm.plugin.wenote.model.a.c)localObject1).uOd = paramWXRTEditText.uOd;
        paramWXRTEditText.uOd = 0;
      }
    }
    if ((paramWXRTEditText == null) || (paramWXRTEditText.getRecyclerItemPosition() != 0))
      label206: if (paramWXRTEditText != null)
        break label653;
    label1285: label1291: 
    while (true)
    {
      int j;
      label295: int m;
      try
      {
        j = size();
        deq();
        paramArrayList = paramArrayList.iterator();
        i = j;
        if (paramArrayList.hasNext())
        {
          paramWXRTEditText = (com.tencent.mm.plugin.wenote.model.a.c)paramArrayList.next();
          b(paramWXRTEditText);
          if ((paramWXRTEditText == null) || (this.iPr == null))
            break label1285;
          this.iPr.add(paramWXRTEditText);
          a(paramWXRTEditText, true);
          k = 1;
          if (k == 0)
            break label1291;
          i++;
          continue;
          if (paramWXRTEditText.getEditTextType() != 1)
            break label176;
          ((com.tencent.mm.plugin.wenote.model.a.c)localObject1).uOc = 1;
          break label176;
          if ((paramWXRTEditText.getEditTextType() == 2) || (paramWXRTEditText.getSelectionStart() != 0) || (paramArrayList == null) || (paramArrayList.size() <= 0))
            break label206;
          i = ((com.tencent.mm.plugin.wenote.model.a.c)paramArrayList.get(0)).getType();
          if ((i != 2) && (i != 6) && (i != 5) && (i != 3) && (i != 4))
            break label206;
          localObject1 = new i();
          ((i)localObject1).content = "";
          ((i)localObject1).uNT = false;
          ((i)localObject1).uNZ = false;
          paramArrayList.add(0, localObject1);
          break label206;
        }
        m = 0;
        if ((i - 1 >= 0) && (i - 1 < dem().size()))
        {
          n = i - 1;
          k = n;
          i1 = i;
          if (paramBoolean4)
          {
            n++;
            i++;
            deq();
            if (n >= dem().size())
              break label1180;
            paramArrayList = dem().Ke(n);
            k = n;
            i1 = i;
            if (paramArrayList != null)
            {
              paramArrayList.uNV = 0;
              paramArrayList.uNT = true;
              paramArrayList.uNZ = false;
              i1 = i;
              k = n;
            }
          }
          if (this.uPa != null)
          {
            n = i1 - j;
            i = n;
            if (m != 0)
              i = n + 1;
            if ((j >= 0) && (i > 0))
              this.uPa.gC(j, i);
            if (j <= 0)
              break label1234;
            this.uPa.gD(j - 1, dem().size() - (j - 1));
            if (paramBoolean3)
              this.uPa.ddV();
            this.uPa.Ka(k);
          }
          dew();
          AppMethodBeat.o(26742);
          i = k;
          break;
          label653: k = paramWXRTEditText.getRecyclerItemPosition();
          Object localObject2 = Ke(k);
          if (localObject2 == null)
          {
            AppMethodBeat.o(26742);
            i = -1;
            break;
          }
          deq();
          if ((paramWXRTEditText.getEditTextType() == 0) && (((com.tencent.mm.plugin.wenote.model.a.c)localObject2).getType() == 1))
          {
            localObject1 = paramWXRTEditText.getSelection();
            Object localObject3 = paramWXRTEditText.getText();
            paramWXRTEditText = ((Editable)localObject3).subSequence(0, ((e)localObject1).aqm);
            localObject3 = ((Editable)localObject3).subSequence(((e)localObject1).Ls, ((Editable)localObject3).length());
            localObject1 = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a((Spanned)paramWXRTEditText);
            paramWXRTEditText = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a((Spanned)localObject3);
            localObject2 = (i)localObject2;
            if (!bo.isNullOrNil((String)localObject1))
            {
              if (((String)localObject1).endsWith("<br/>"))
              {
                localObject1 = ((String)localObject1).substring(0, ((String)localObject1).length() - 5);
                ((i)localObject2).content = ((String)localObject1);
                k++;
                i = k;
                if (bo.isNullOrNil(paramWXRTEditText))
                  continue;
                localObject2 = new com/tencent/mm/plugin/wenote/model/a/i;
                ((i)localObject2).<init>();
                ((i)localObject2).type = 1;
                localObject1 = paramWXRTEditText;
                if (paramWXRTEditText.startsWith("<br/>"))
                  localObject1 = paramWXRTEditText.substring(5, paramWXRTEditText.length());
                ((i)localObject2).content = ((String)localObject1);
                ((i)localObject2).uNV = 0;
                ((i)localObject2).uNT = false;
                ((i)localObject2).uNZ = false;
                b(k, (com.tencent.mm.plugin.wenote.model.a.c)localObject2);
                i1 = k;
                n = 1;
                i = k;
                k = i1;
                paramArrayList = paramArrayList.iterator();
                i1 = i;
                i = i1;
                j = k;
                m = n;
                if (!paramArrayList.hasNext())
                  continue;
                paramWXRTEditText = (com.tencent.mm.plugin.wenote.model.a.c)paramArrayList.next();
                b(paramWXRTEditText);
                if (!b(i1, paramWXRTEditText))
                  break label1278;
                i = i1 + 1;
                i1 = i;
                continue;
              }
              continue;
            }
            if (!bo.isNullOrNil(paramWXRTEditText))
            {
              localObject1 = paramWXRTEditText;
              if (paramWXRTEditText.startsWith("<br/>"))
                localObject1 = paramWXRTEditText.substring(5, paramWXRTEditText.length());
              ((i)localObject2).content = ((String)localObject1);
              n = k;
              i1 = 0;
              i = k;
              k = n;
              n = i1;
              continue;
            }
            Kf(k);
            i = k;
            if (this.uPa != null)
            {
              this.uPa.JZ(k);
              i = k;
            }
            k = i;
            n = 0;
            continue;
          }
          if (paramWXRTEditText.getEditTextType() == 1)
            break label1275;
          k++;
          paramArrayList = paramArrayList.iterator();
          i = k;
          if (!paramArrayList.hasNext())
            break label1262;
          paramWXRTEditText = (com.tencent.mm.plugin.wenote.model.a.c)paramArrayList.next();
          b(paramWXRTEditText);
          if (!b(i, paramWXRTEditText))
            break label1272;
          i++;
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(26742);
      }
      int n = dem().size() - 1;
      continue;
      label1180: paramArrayList = new i();
      paramArrayList.type = 1;
      paramArrayList.content = "";
      paramArrayList.uNV = 0;
      paramArrayList.uNT = true;
      paramArrayList.uNZ = false;
      b(n, paramArrayList);
      int k = n;
      int i1 = i;
      continue;
      label1234: if (j == 0)
      {
        this.uPa.gD(j, dem().size() - j);
        continue;
        label1262: m = 0;
        j = k;
        continue;
        label1272: continue;
        label1275: continue;
        label1278: i = i1;
        continue;
        k = 0;
      }
    }
  }

  public final void a(String paramString, com.tencent.mm.plugin.wenote.model.a.c paramc)
  {
    int i = 0;
    AppMethodBeat.i(26727);
    while (true)
    {
      try
      {
        if (this.iPr == null)
        {
          return;
          i++;
        }
        if (i < this.iPr.size())
        {
          if (!((com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(i)).ddP().equals(paramString))
            continue;
          a((com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(i), false);
          this.iPr.set(i, paramc);
          a(paramc, true);
          if ((i != -1) && (this.uPa != null))
            this.uPa.JX(i);
          AppMethodBeat.o(26727);
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(26727);
      }
      i = -1;
    }
  }

  public final boolean a(int paramInt, com.tencent.mm.plugin.wenote.model.a.c paramc)
  {
    boolean bool = true;
    AppMethodBeat.i(26722);
    while (true)
    {
      try
      {
        if ((this.iPr == null) || (paramInt < 0) || (paramInt > this.iPr.size()))
          break label138;
        this.iPr.add(paramInt, paramc);
        a(paramc, true);
        if ((bool) && (this.uPa != null))
        {
          this.uPa.JY(paramInt);
          if (paramInt > 0)
            this.uPa.gD(paramInt - 1, this.iPr.size() - (paramInt - 1));
        }
        else
        {
          AppMethodBeat.o(26722);
          return bool;
        }
      }
      finally
      {
        AppMethodBeat.o(26722);
      }
      this.uPa.gD(paramInt, this.iPr.size() - paramInt);
      continue;
      label138: bool = false;
    }
  }

  public final boolean a(com.tencent.mm.plugin.wenote.model.a.c paramc)
  {
    boolean bool = true;
    AppMethodBeat.i(26720);
    if (paramc != null);
    while (true)
    {
      try
      {
        if (this.iPr != null)
        {
          this.iPr.add(paramc);
          a(paramc, true);
          return bool;
        }
      }
      finally
      {
        AppMethodBeat.o(26720);
      }
      bool = false;
    }
  }

  public final boolean af(ArrayList<com.tencent.mm.plugin.wenote.model.a.c> paramArrayList)
  {
    AppMethodBeat.i(26746);
    StringBuilder localStringBuilder = new StringBuilder();
    paramArrayList = paramArrayList.iterator();
    int i = 0;
    while (paramArrayList.hasNext())
    {
      com.tencent.mm.plugin.wenote.model.a.c localc = (com.tencent.mm.plugin.wenote.model.a.c)paramArrayList.next();
      if (localc.getType() != 1)
        i++;
      else
        localStringBuilder.append(((i)localc).content);
    }
    boolean bool = gF(com.tencent.mm.plugin.wenote.b.c.ahl(localStringBuilder.toString()), i);
    AppMethodBeat.o(26746);
    return bool;
  }

  public final void ahd(String paramString)
  {
    AppMethodBeat.i(26728);
    if ((bo.isNullOrNil(paramString)) || (this.iPr == null))
      AppMethodBeat.o(26728);
    while (true)
    {
      return;
      paramString = com.tencent.mm.plugin.wenote.b.b.ahg(paramString);
      if ((paramString != null) && (paramString.size() > 0))
        try
        {
          ab.i("MicroMsg.Note.NoteDataManager", "updateDataByHtml, mHasInitDataListFinish :％B", new Object[] { Boolean.valueOf(this.uPf) });
          al localal = aw.RS();
          c.2 local2 = new com/tencent/mm/plugin/wenote/model/nativenote/manager/c$2;
          local2.<init>(this, paramString);
          if (this.uPf);
          for (long l = 500L; ; l = 1000L)
          {
            localal.m(local2, l);
            AppMethodBeat.o(26728);
            break;
          }
        }
        catch (Exception paramString)
        {
          while (true)
            ab.e("MicroMsg.Note.NoteDataManager", "updateDataByHtml exception,%s", new Object[] { paramString.toString() });
        }
        finally
        {
          AppMethodBeat.o(26728);
        }
      else
        AppMethodBeat.o(26728);
    }
  }

  public final abf ahe(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(26740);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.Note.NoteDataManager", "getFavProtoItem error ,htmlstr is null or nil");
      AppMethodBeat.o(26740);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      Object localObject3;
      Object localObject4;
      label813: 
      while (true)
      {
        try
        {
          if (i >= this.iPr.size())
            break;
          localObject2 = (com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(i);
          if (bo.isNullOrNil(((com.tencent.mm.plugin.wenote.model.a.c)localObject2).mnd))
            ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).mnd = com.tencent.mm.plugin.wenote.model.f.agW(localObject2.toString());
          if (((com.tencent.mm.plugin.wenote.model.a.c)localObject2).getType() == -1)
          {
            if ((localArrayList.size() > 0) && (((o)localArrayList.get(localArrayList.size() - 1)).type == 1))
            {
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject3 = (i)localArrayList.get(localArrayList.size() - 1);
              ((i)localObject3).content += "\n";
              i++;
              continue;
            }
            localObject3 = new com/tencent/mm/plugin/wenote/model/a/i;
            ((i)localObject3).<init>();
            ((i)localObject3).content = "\n";
            ((i)localObject3).mnd = ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).mnd;
            ((i)localObject3).uOo = "-1";
            ((i)localObject3).type = 1;
            ((i)localObject3).uOn = null;
            localArrayList.add(localObject3);
            continue;
          }
        }
        finally
        {
          AppMethodBeat.o(26740);
        }
        if (((com.tencent.mm.plugin.wenote.model.a.c)localObject2).getType() >= -1)
        {
          if (((((com.tencent.mm.plugin.wenote.model.a.c)localObject2).getType() == 6) || (((com.tencent.mm.plugin.wenote.model.a.c)localObject2).getType() == 4)) && (bo.isNullOrNil(((o)localObject2).cHg)))
          {
            localObject3 = new com/tencent/mm/protocal/protobuf/aar;
            ((aar)localObject3).<init>();
            ((aar)localObject3).akU(((com.tencent.mm.plugin.wenote.model.a.c)localObject2).mnd);
            ((aar)localObject3).akR(((com.tencent.mm.plugin.wenote.model.a.c)localObject2).ddQ());
            localObject3 = com.tencent.mm.plugin.wenote.model.f.o((aar)localObject3);
            if (com.tencent.mm.vfs.e.ct((String)localObject3))
            {
              ab.e("MicroMsg.Note.NoteDataManager", "getFavProtoItem,type = %d, localfile exsit,but localpath is null or nil, set path here", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.wenote.model.a.c)localObject2).getType()) });
              ((o)localObject2).cHg = ((String)localObject3);
            }
          }
          if (((com.tencent.mm.plugin.wenote.model.a.c)localObject2).getType() != 1)
          {
            localArrayList.add((o)localObject2);
          }
          else
          {
            localObject2 = (i)localObject2;
            if (bo.isNullOrNil(((i)localObject2).content))
            {
              if ((localArrayList.size() > 0) && (((o)localArrayList.get(localArrayList.size() - 1)).getType() == 1))
              {
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                localObject2 = (i)localArrayList.get(localArrayList.size() - 1);
                ((i)localObject2).content += "<br/>";
              }
              else
              {
                localObject3 = new com/tencent/mm/plugin/wenote/model/a/i;
                ((i)localObject3).<init>();
                ((i)localObject3).content = "<br/>";
                ((i)localObject3).mnd = ((i)localObject2).mnd;
                ((i)localObject3).uOo = ((i)localObject2).uOo;
                ((i)localObject3).type = ((i)localObject2).type;
                ((i)localObject3).uOn = null;
                localArrayList.add(localObject3);
              }
            }
            else
            {
              if ((localArrayList.size() > 0) && (((o)localArrayList.get(localArrayList.size() - 1)).getType() == 1))
              {
                localObject4 = new java/lang/StringBuilder;
                ((StringBuilder)localObject4).<init>();
                localObject3 = (i)localArrayList.get(localArrayList.size() - 1);
                ((i)localObject3).content += ((i)localObject2).content;
              }
              while (true)
              {
                if ((i + 1 >= this.iPr.size()) || (((com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(i + 1)).getType() != 1) || (bo.isNullOrNil(((i)this.iPr.get(i + 1)).content)))
                  break label813;
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>();
                localObject3 = (i)localArrayList.get(localArrayList.size() - 1);
                ((i)localObject3).content += "<br/>";
                break;
                localObject3 = new com/tencent/mm/plugin/wenote/model/a/i;
                ((i)localObject3).<init>();
                ((i)localObject3).content = ((i)localObject2).content;
                ((i)localObject3).mnd = ((i)localObject2).mnd;
                ((i)localObject3).uOo = ((i)localObject2).uOo;
                ((i)localObject3).type = ((i)localObject2).type;
                ((i)localObject3).uOn = null;
                localArrayList.add(localObject3);
              }
            }
          }
        }
      }
      paramString = Pattern.compile("<wx-", 2).matcher(paramString).replaceAll("<");
      Object localObject2 = Pattern.compile("</wx-", 2).matcher(paramString).replaceAll("</");
      try
      {
        paramString = ((String)localObject2).getBytes("UTF-8");
        i = 0;
        this.uPb.LE(8);
        this.uPb.ale("WeNoteHtmlFile");
        this.uPb.oY(true);
        this.uPb.akR(".htm");
        this.uPb.akU(com.tencent.mm.plugin.wenote.model.f.agW(this.uPb.toString()));
        localObject4 = com.tencent.mm.plugin.wenote.model.f.o(this.uPb);
        ab.i("MicroMsg.Note.NoteDataManager", "getFavProtoItem: save note html file, path is %s", new Object[] { localObject4 });
        localObject3 = new com.tencent.mm.vfs.b((String)localObject4);
        if (((com.tencent.mm.vfs.b)localObject3).exists())
          ((com.tencent.mm.vfs.b)localObject3).delete();
        if (((com.tencent.mm.vfs.b)localObject3).exists());
      }
      catch (UnsupportedEncodingException paramString)
      {
        try
        {
          ((com.tencent.mm.vfs.b)localObject3).createNewFile();
          if ((i != 0) || (com.tencent.mm.vfs.e.b((String)localObject4, paramString, paramString.length) != 0))
            break label1099;
          this.uPb.akV((String)localObject4);
          ab.i("MicroMsg.Note.NoteDataManager", "do WNNoteBase.ConvertNote2FavProtoItem");
          paramString = com.tencent.mm.plugin.wenote.model.d.a((String)localObject2, localArrayList, this.uPb);
          AppMethodBeat.o(26740);
          continue;
          paramString = paramString;
          ab.printErrStackTrace("MicroMsg.Note.NoteDataManager", paramString, "", new Object[0]);
          ab.e("MicroMsg.Note.NoteDataManager", "writehtmlfile, use utf-8 encoding error,use default encoding,");
          i = 1;
          paramString = null;
        }
        catch (IOException paramString)
        {
          ab.printErrStackTrace("MicroMsg.Note.NoteDataManager", paramString, "", new Object[0]);
          AppMethodBeat.o(26740);
          paramString = localObject1;
        }
      }
      continue;
      label1099: ab.i("MicroMsg.Note.NoteDataManager", "writefile error,return");
      Toast.makeText(ah.getContext(), ah.getContext().getString(2131299726), 1).show();
      AppMethodBeat.o(26740);
      paramString = localObject1;
    }
  }

  public final String ahf(String paramString)
  {
    AppMethodBeat.i(26750);
    label200: label208: label213: 
    while (true)
    {
      try
      {
        if (this.iPr == null)
          break label213;
        int i = 0;
        if (i < this.iPr.size())
        {
          if (((com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(i)).getType() != 1)
            break label208;
          localObject = com.tencent.mm.plugin.wenote.b.b.ahh(((i)this.iPr.get(i)).content).replace("&lt;", "<").replace("&gt;", ">").replace(" ", " ");
          if (bo.isNullOrNil((String)localObject))
            break label208;
          localObject = ((String)localObject).split("\n");
          j = 0;
          if (j >= localObject.length)
            break label200;
          if (!bo.isNullOrNil(localObject[j].trim()))
          {
            localObject = localObject[j];
            j = 1;
            paramString = (String)localObject;
            if (j != 0)
              continue;
            i++;
            paramString = (String)localObject;
            continue;
          }
          j++;
          continue;
        }
        localObject = paramString;
        if (paramString.length() > 1000)
          localObject = paramString.substring(0, 1000);
        AppMethodBeat.o(26750);
        return localObject;
      }
      finally
      {
        AppMethodBeat.o(26750);
      }
      int j = 0;
      Object localObject = paramString;
      continue;
      localObject = paramString;
    }
  }

  public final boolean au(int paramInt, boolean paramBoolean)
  {
    boolean bool1 = false;
    AppMethodBeat.i(26724);
    boolean bool2 = bool1;
    while (true)
    {
      try
      {
        if (this.iPr != null)
        {
          bool2 = bool1;
          if (paramInt >= 0)
          {
            bool2 = bool1;
            if (paramInt < this.iPr.size())
            {
              a((com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(paramInt), false);
              this.iPr.remove(paramInt);
              bool2 = true;
            }
          }
        }
        if ((bool2) && (paramBoolean) && (this.uPa != null))
        {
          this.uPa.JZ(paramInt);
          if (paramInt > 0)
            this.uPa.gD(paramInt - 1, this.iPr.size() - (paramInt - 1));
        }
        else
        {
          AppMethodBeat.o(26724);
          return bool2;
        }
      }
      finally
      {
        AppMethodBeat.o(26724);
      }
      this.uPa.gD(paramInt, this.iPr.size() - paramInt);
    }
  }

  public final void av(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(26730);
    try
    {
      if (this.iPr == null)
        return;
      com.tencent.mm.plugin.wenote.model.a.c localc;
      if ((paramInt >= 0) && (paramInt < this.iPr.size()))
      {
        localc = (com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(paramInt);
        if ((localc != null) && (localc.uOa != paramBoolean))
        {
          localc.uOa = paramBoolean;
          if (this.uPa != null)
            this.uPa.JX(paramInt);
        }
      }
      while (true)
      {
        AppMethodBeat.o(26730);
        break;
        if (paramInt == -1)
          for (paramInt = 0; paramInt < this.iPr.size(); paramInt++)
          {
            localc = (com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(paramInt);
            if ((localc != null) && (localc.uOa != paramBoolean))
            {
              localc.uOa = paramBoolean;
              if (this.uPa != null)
                this.uPa.JX(paramInt);
            }
          }
      }
    }
    finally
    {
      AppMethodBeat.o(26730);
    }
  }

  public final void aw(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(26734);
    while (true)
    {
      try
      {
        if ((this.iPr == null) || (paramInt < 0) || (paramInt >= this.iPr.size()))
          return;
        int i = 0;
        if (i < this.iPr.size())
        {
          if (i == paramInt)
          {
            ((com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(i)).uNT = true;
            ((com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(i)).uNZ = paramBoolean;
            i++;
            continue;
          }
          ((com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(i)).uNT = false;
          ((com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(i)).uNZ = false;
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(26734);
      }
      AppMethodBeat.o(26734);
    }
  }

  public final boolean d(int paramInt, ArrayList<com.tencent.mm.plugin.wenote.model.a.c> paramArrayList)
  {
    AppMethodBeat.i(26721);
    boolean bool;
    if ((paramArrayList == null) || (paramArrayList.size() <= 0))
    {
      AppMethodBeat.o(26721);
      bool = false;
      return bool;
    }
    while (true)
    {
      try
      {
        if (this.iPr != null)
        {
          int i = 0;
          j = 0;
          k = paramInt;
          paramInt = j;
          if ((i < paramArrayList.size()) && (k >= 0) && (k <= this.iPr.size()))
          {
            com.tencent.mm.plugin.wenote.model.a.c localc = (com.tencent.mm.plugin.wenote.model.a.c)paramArrayList.get(i);
            j = paramInt;
            int m = k;
            if (localc != null)
            {
              b(localc);
              this.iPr.add(k, localc);
              j = paramInt + 1;
              m = k + 1;
              a(localc, true);
            }
            i++;
            paramInt = j;
            k = m;
            continue;
          }
          bool = true;
          j = paramInt;
          if ((bool) && (this.uPa != null))
            this.uPa.gC(k - j, j);
          AppMethodBeat.o(26721);
          break;
        }
      }
      finally
      {
        AppMethodBeat.o(26721);
      }
      bool = false;
      int j = 0;
      int k = paramInt;
    }
  }

  public final void den()
  {
    AppMethodBeat.i(26729);
    int i;
    if (this.iPr != null)
      i = this.iPr.size();
    while (true)
    {
      ab.i("MicroMsg.Note.NoteDataManager", "clear mDataList, size:%d", new Object[] { Integer.valueOf(i) });
      try
      {
        if (this.iPr != null)
          this.iPr.clear();
        this.uPe = 0;
        this.uPd = 0;
        AppMethodBeat.o(26729);
        return;
        i = 0;
      }
      finally
      {
        AppMethodBeat.o(26729);
      }
    }
  }

  public final int deo()
  {
    AppMethodBeat.i(26731);
    while (true)
    {
      try
      {
        if (this.iPr != null)
        {
          i = 0;
          if (i < this.iPr.size())
          {
            if (((com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(i)).uNT)
              return i;
            i++;
            continue;
          }
        }
      }
      finally
      {
        AppMethodBeat.o(26731);
      }
      int i = -1;
    }
  }

  public final void dep()
  {
    AppMethodBeat.i(26732);
    try
    {
      if (this.iPr != null)
      {
        Iterator localIterator = this.iPr.iterator();
        while (localIterator.hasNext())
        {
          com.tencent.mm.plugin.wenote.model.a.c localc = (com.tencent.mm.plugin.wenote.model.a.c)localIterator.next();
          localc.uNT = false;
          localc.uNZ = false;
        }
      }
    }
    finally
    {
      AppMethodBeat.o(26732);
    }
    AppMethodBeat.o(26732);
  }

  public final int der()
  {
    AppMethodBeat.i(26735);
    while (true)
    {
      try
      {
        if (this.iPr != null)
        {
          i = 0;
          if (i < this.iPr.size())
          {
            if ((((com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(i)).getType() == 4) && (((l)this.iPr.get(i)).uOh.booleanValue()))
              return i;
            i++;
            continue;
          }
        }
      }
      finally
      {
        AppMethodBeat.o(26735);
      }
      int i = -1;
    }
  }

  public final String des()
  {
    AppMethodBeat.i(26736);
    while (true)
    {
      try
      {
        if ((this.uPc != 0) || (this.iPr == null))
          break;
        Iterator localIterator = this.iPr.iterator();
        if (!localIterator.hasNext())
          break;
        o localo = (o)localIterator.next();
        if (!localo.uOo.startsWith("WeNote_"))
          continue;
        i = bo.getInt(localo.uOo.substring(7), -1);
        if (i > this.uPc)
        {
          this.uPc = i;
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(26736);
      }
      i = this.uPc;
    }
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("WeNote_");
    int i = this.uPc + 1;
    this.uPc = i;
    localObject2 = i;
    AppMethodBeat.o(26736);
    return localObject2;
  }

  public final String deu()
  {
    AppMethodBeat.i(26738);
    Object localObject1 = "";
    try
    {
      if ((this.iPr == null) || (this.iPr.size() <= 0))
        localObject1 = "";
      while (true)
      {
        return localObject1;
        int i = 0;
        if (i < this.iPr.size())
        {
          Object localObject3 = (com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(i);
          switch (((com.tencent.mm.plugin.wenote.model.a.c)localObject3).getType())
          {
          default:
          case 1:
          case 2:
          case 6:
          case 20:
          case 4:
          case 3:
          case 5:
          case -1:
          }
          while (true)
          {
            i++;
            break;
            Object localObject4 = (i)localObject3;
            if (bo.isNullOrNil(((i)localObject4).content))
            {
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject1 = (String)localObject1 + "<br/>";
            }
            else
            {
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject3 = (String)localObject1 + ((i)localObject4).content;
              localObject1 = localObject3;
              if (i + 1 < this.iPr.size())
              {
                localObject1 = localObject3;
                if (((com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(i + 1)).getType() == 1)
                {
                  localObject1 = localObject3;
                  if (!bo.isNullOrNil(((i)this.iPr.get(i + 1)).content))
                  {
                    localObject1 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject1).<init>();
                    localObject1 = (String)localObject3 + "<br/>";
                    continue;
                    localObject4 = (com.tencent.mm.plugin.wenote.model.a.f)localObject3;
                    localObject3 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject3).<init>();
                    localObject1 = (String)localObject1 + dO(((com.tencent.mm.plugin.wenote.model.a.f)localObject4).uOo, 2);
                    continue;
                    localObject4 = (k)localObject3;
                    localObject3 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject3).<init>();
                    localObject1 = (String)localObject1 + dO(((k)localObject4).uOo, 6);
                    continue;
                    localObject4 = (com.tencent.mm.plugin.wenote.model.a.b)localObject3;
                    localObject3 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject3).<init>();
                    localObject1 = (String)localObject1 + dO(((com.tencent.mm.plugin.wenote.model.a.b)localObject4).uOo, 20);
                    continue;
                    localObject4 = (l)localObject3;
                    localObject3 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject3).<init>();
                    localObject1 = (String)localObject1 + dO(((l)localObject4).uOo, ((l)localObject4).getType());
                    continue;
                    localObject3 = (g)localObject3;
                    localObject4 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject4).<init>();
                    localObject1 = (String)localObject1 + dO(((g)localObject3).uOo, 3);
                    continue;
                    localObject4 = (com.tencent.mm.plugin.wenote.model.a.d)localObject3;
                    localObject3 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject3).<init>();
                    localObject1 = (String)localObject1 + dO(((com.tencent.mm.plugin.wenote.model.a.d)localObject4).uOo, 5);
                    continue;
                    localObject3 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject3).<init>();
                    localObject1 = (String)localObject1 + "<hr/>";
                  }
                }
              }
            }
          }
        }
        localObject1 = ((String)localObject1).replaceAll("\n", "<br/>");
        AppMethodBeat.o(26738);
      }
    }
    finally
    {
      AppMethodBeat.o(26738);
    }
  }

  public final ArrayList<com.tencent.mm.plugin.wenote.model.a.c> dev()
  {
    AppMethodBeat.i(26745);
    Object localObject1;
    if (this.iPr == null)
    {
      localObject1 = null;
      AppMethodBeat.o(26745);
    }
    while (true)
    {
      return localObject1;
      localObject1 = new ArrayList();
      try
      {
        Iterator localIterator = this.iPr.iterator();
        while (localIterator.hasNext())
          ((ArrayList)localObject1).add(com.tencent.mm.plugin.wenote.b.c.c((com.tencent.mm.plugin.wenote.model.a.c)localIterator.next()));
      }
      finally
      {
        AppMethodBeat.o(26745);
      }
      AppMethodBeat.o(26745);
    }
  }

  public final void dew()
  {
    AppMethodBeat.i(26747);
    aw.RS().aa(new c.3(this));
    AppMethodBeat.o(26747);
  }

  public final int dex()
  {
    AppMethodBeat.i(26751);
    try
    {
      int i;
      if (this.iPr == null)
      {
        AppMethodBeat.o(26751);
        i = -1;
      }
      while (true)
      {
        return i;
        for (i = 0; ; i++)
        {
          if (i >= this.iPr.size())
            break label91;
          com.tencent.mm.plugin.wenote.model.a.c localc = (com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(i);
          if ((localc != null) && (localc.getType() != -3) && (localc.getType() != -2))
          {
            AppMethodBeat.o(26751);
            break;
          }
        }
        label91: AppMethodBeat.o(26751);
        i = -1;
      }
    }
    finally
    {
      AppMethodBeat.o(26751);
    }
  }

  public final int dey()
  {
    AppMethodBeat.i(26752);
    try
    {
      int i;
      if (this.iPr == null)
      {
        AppMethodBeat.o(26752);
        i = -1;
      }
      while (true)
      {
        return i;
        for (i = this.iPr.size() - 1; ; i--)
        {
          if (i < 0)
            break label92;
          com.tencent.mm.plugin.wenote.model.a.c localc = (com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(i);
          if ((localc != null) && (localc.getType() != -3) && (localc.getType() != -2))
          {
            AppMethodBeat.o(26752);
            break;
          }
        }
        label92: AppMethodBeat.o(26752);
        i = -1;
      }
    }
    finally
    {
      AppMethodBeat.o(26752);
    }
  }

  public final boolean gF(int paramInt1, int paramInt2)
  {
    boolean bool = true;
    if (paramInt1 < 0);
    for (int i = 0; ; i = 1)
    {
      if (paramInt2 < 0);
      for (int j = 0; ; j = 1)
      {
        if ((i != 0) && (this.uPd + paramInt1 > 16384));
        while (true)
        {
          return bool;
          if ((j == 0) || (this.uPe + paramInt2 <= 30))
            bool = false;
        }
      }
    }
  }

  public final void gG(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(26749);
    ab.i("MicroMsg.Note.NoteDataManager", "checkMergeTextDataItem startPos: %d endPos: %d needNotify: %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.TRUE });
    while (true)
    {
      Object localObject3;
      i locali;
      try
      {
        if (this.iPr == null)
          return;
        int i = paramInt1;
        if (paramInt1 <= 0)
          i = 0;
        if (paramInt2 < this.iPr.size())
          break label505;
        paramInt2 = this.iPr.size() - 1;
        paramInt1 = -1;
        if (paramInt2 <= i)
          break label459;
        Object localObject1 = (com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(paramInt2);
        localObject3 = (com.tencent.mm.plugin.wenote.model.a.c)this.iPr.get(paramInt2 - 1);
        int j = paramInt1;
        if (localObject1 != null)
        {
          j = paramInt1;
          if (((com.tencent.mm.plugin.wenote.model.a.c)localObject1).getType() == 1)
          {
            j = paramInt1;
            if (localObject3 != null)
            {
              j = paramInt1;
              if (((com.tencent.mm.plugin.wenote.model.a.c)localObject3).getType() == 1)
              {
                paramInt1 = paramInt2 - 1;
                localObject1 = (i)localObject1;
                locali = (i)localObject3;
                if (bo.isNullOrNil(((i)localObject1).content))
                  break label430;
                Spanned localSpanned = com.tencent.mm.plugin.wenote.model.nativenote.a.a.ahb(((i)localObject1).content);
                localObject3 = com.tencent.mm.plugin.wenote.model.nativenote.a.a.ahb(locali.content);
                StringBuilder localStringBuilder = new java/lang/StringBuilder;
                localStringBuilder.<init>();
                locali.content = (locali.content + "<br/>" + ((i)localObject1).content);
                if (!((i)localObject1).uNT)
                  break label398;
                locali.uNT = true;
                locali.uNZ = false;
                if ((((i)localObject1).uNV != -1) && (((i)localObject1).uNV < localSpanned.length()))
                  continue;
                locali.uNV = -1;
                ab.i("MicroMsg.Note.NoteDataManager", "checkMergeTextDataItem remove position: %d", new Object[] { Integer.valueOf(paramInt2) });
                Kf(paramInt2);
                j = paramInt1;
                if (this.uPa != null)
                {
                  this.uPa.JZ(paramInt2);
                  j = paramInt1;
                }
              }
            }
          }
        }
        paramInt2--;
        paramInt1 = j;
        continue;
        j = ((Spanned)localObject3).length();
        locali.uNV = (((i)localObject1).uNV + (j + 1));
        continue;
      }
      finally
      {
        AppMethodBeat.o(26749);
      }
      label398: if ((locali.uNT) && (locali.uNV == -1))
      {
        locali.uNV = ((Spanned)localObject3).length();
        continue;
        label430: if (localObject2.uNT)
        {
          locali.uNT = true;
          locali.uNZ = false;
          locali.uNV = -1;
          continue;
          label459: if ((paramInt1 != -1) && (this.uPa != null))
            this.uPa.gD(paramInt1, this.iPr.size() - paramInt1);
          dew();
          AppMethodBeat.o(26749);
          continue;
          label505: paramInt1 = -1;
        }
      }
    }
  }

  public final int size()
  {
    AppMethodBeat.i(26718);
    int i;
    if (this.iPr != null)
    {
      i = this.iPr.size();
      AppMethodBeat.o(26718);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(26718);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.c
 * JD-Core Version:    0.6.2
 */