package com.tencent.mm.cache;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.text.SpannableString;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.y.e;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public final class c
  implements d<com.tencent.mm.y.c>
{
  public Stack<com.tencent.mm.y.c> efp;
  public Stack<com.tencent.mm.y.c> efq;
  private int efs;

  public final void CO()
  {
    this.efs += 1;
  }

  public final void Je()
  {
    AppMethodBeat.i(116238);
    ab.i("MicroMsg.EmojiAndTextCache", "[onRestore] size:%s isExit:%s", new Object[] { Integer.valueOf(this.efp.size()), Boolean.FALSE });
    this.efp.clear();
    if (this.efq != null)
    {
      ab.i("MicroMsg.EmojiAndTextCache", "[onRestore] %s", new Object[] { Integer.valueOf(this.efq.size()) });
      this.efp.addAll(this.efq);
    }
    ab.i("MicroMsg.EmojiAndTextCache", "[onRestore] mCurStack size:%s ", new Object[] { Integer.valueOf(this.efp.size()) });
    Iterator localIterator = this.efp.iterator();
    while (localIterator.hasNext())
      ((com.tencent.mm.y.c)localIterator.next()).Qc();
    AppMethodBeat.o(116238);
  }

  public final com.tencent.mm.y.c Jh()
  {
    AppMethodBeat.i(116241);
    com.tencent.mm.y.c localc = (com.tencent.mm.y.c)this.efp.pop();
    AppMethodBeat.o(116241);
    return localc;
  }

  public final com.tencent.mm.y.c Ji()
  {
    AppMethodBeat.i(116242);
    com.tencent.mm.y.c localc;
    if ((this.efp != null) && (this.efp.size() > 0))
    {
      localc = (com.tencent.mm.y.c)this.efp.peek();
      AppMethodBeat.o(116242);
    }
    while (true)
    {
      return localc;
      localc = null;
      AppMethodBeat.o(116242);
    }
  }

  public final ListIterator<com.tencent.mm.y.c> Jj()
  {
    AppMethodBeat.i(116246);
    ListIterator localListIterator = this.efp.listIterator(this.efp.size());
    AppMethodBeat.o(116246);
    return localListIterator;
  }

  public final int[] Jk()
  {
    AppMethodBeat.i(116247);
    int[] arrayOfInt = new int[2];
    if (this.efq != null)
    {
      Iterator localIterator = this.efq.iterator();
      while (localIterator.hasNext())
        if (((com.tencent.mm.y.c)localIterator.next() instanceof e))
          arrayOfInt[1] += 1;
        else
          arrayOfInt[0] += 1;
    }
    AppMethodBeat.o(116247);
    return arrayOfInt;
  }

  public final void a(Canvas paramCanvas, boolean paramBoolean)
  {
    AppMethodBeat.i(116239);
    Object localObject;
    if (paramBoolean)
    {
      paramCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
      localObject = this.efp.iterator();
      while (((Iterator)localObject).hasNext())
      {
        com.tencent.mm.y.c localc = (com.tencent.mm.y.c)((Iterator)localObject).next();
        if (!localc.ejw)
          localc.draw(paramCanvas);
      }
      AppMethodBeat.o(116239);
    }
    while (true)
    {
      return;
      localObject = Ji();
      if ((localObject != null) && (!((com.tencent.mm.y.c)localObject).ejw))
        ((com.tencent.mm.y.c)localObject).draw(paramCanvas);
      AppMethodBeat.o(116239);
    }
  }

  public final void a(com.tencent.mm.y.c paramc)
  {
    AppMethodBeat.i(116243);
    if (this.efp != null)
      this.efp.push(paramc);
    AppMethodBeat.o(116243);
  }

  public final int ac(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(116244);
    if (paramBoolean)
      if (this.efp != null)
      {
        i = this.efp.size();
        AppMethodBeat.o(116244);
      }
    while (true)
    {
      return i;
      AppMethodBeat.o(116244);
      continue;
      if (this.efq != null)
      {
        i = this.efq.size();
        AppMethodBeat.o(116244);
      }
      else
      {
        AppMethodBeat.o(116244);
      }
    }
  }

  public final void b(Canvas paramCanvas)
  {
    AppMethodBeat.i(116240);
    Iterator localIterator = this.efp.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.y.c localc = (com.tencent.mm.y.c)localIterator.next();
      localc.setSelected(false);
      localc.draw(paramCanvas);
    }
    AppMethodBeat.o(116240);
  }

  public final void b(com.tencent.mm.y.c paramc)
  {
    AppMethodBeat.i(116245);
    if (paramc == null)
      AppMethodBeat.o(116245);
    while (true)
    {
      return;
      int i = this.efp.indexOf(paramc);
      this.efp.remove(i);
      this.efp.push(paramc);
      AppMethodBeat.o(116245);
    }
  }

  public final void by(boolean paramBoolean)
  {
    AppMethodBeat.i(116237);
    ab.i("MicroMsg.EmojiAndTextCache", "[onSave] size:%s isExit:%s", new Object[] { Integer.valueOf(this.efp.size()), Boolean.valueOf(paramBoolean) });
    if (this.efq != null)
      this.efq.clear();
    this.efq = new Stack();
    Iterator localIterator = this.efp.iterator();
    com.tencent.mm.y.c localc;
    while (localIterator.hasNext())
    {
      localc = (com.tencent.mm.y.c)localIterator.next();
      this.efq.push(localc.Qh());
    }
    ab.i("MicroMsg.EmojiAndTextCache", "[onSave] mLastStack size:%s", new Object[] { Integer.valueOf(this.efq.size()) });
    if (paramBoolean)
    {
      this.efp.clear();
      localIterator = this.efq.iterator();
      while (localIterator.hasNext())
      {
        localc = (com.tencent.mm.y.c)localIterator.next();
        ab.d("MicroMsg.EmojiItem", "[recycleBitmap]");
        if ((localc.eHh != null) && (!localc.eHh.isRecycled()))
        {
          ab.i("MicroMsg.EmojiItem", "bitmap recycle %s", new Object[] { localc.eHh.toString() });
          localc.eHh.recycle();
        }
      }
    }
    AppMethodBeat.o(116237);
  }

  public final String[] kb(String paramString)
  {
    AppMethodBeat.i(116248);
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "";
    arrayOfString[1] = "";
    Iterator localIterator = this.efp.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.y.c localc = (com.tencent.mm.y.c)localIterator.next();
      if ((localc instanceof e))
        arrayOfString[1] = (arrayOfString[1] + ((e)localc).eHF.toString() + paramString);
      else
        arrayOfString[0] = (arrayOfString[0] + localc.eHg.Aq() + paramString);
    }
    AppMethodBeat.o(116248);
    return arrayOfString;
  }

  public final void onCreate()
  {
    AppMethodBeat.i(116235);
    ab.i("MicroMsg.EmojiAndTextCache", "[onCreate]");
    this.efp = new Stack();
    AppMethodBeat.o(116235);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(116236);
    ab.i("MicroMsg.EmojiAndTextCache", "[onDestroy]");
    Iterator localIterator;
    if (this.efp != null)
    {
      localIterator = this.efp.iterator();
      while (localIterator.hasNext())
        ((com.tencent.mm.y.c)localIterator.next()).clear();
      this.efp.clear();
    }
    if (this.efq != null)
    {
      localIterator = this.efq.iterator();
      while (localIterator.hasNext())
        ((com.tencent.mm.y.c)localIterator.next()).clear();
      this.efq.clear();
    }
    AppMethodBeat.o(116236);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cache.c
 * JD-Core Version:    0.6.2
 */