package com.tencent.neattextview.textview.b;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.tencent.neattextview.textview.layout.d;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class b<T extends CharacterStyle>
  implements Serializable
{
  protected LinkedList<RectF> AjV;
  public CharacterStyle AjW;
  private int Ls;
  private int aqm;

  b(int paramInt1, int paramInt2, CharacterStyle paramCharacterStyle)
  {
    this.aqm = paramInt1;
    this.Ls = paramInt2;
    this.AjW = paramCharacterStyle;
  }

  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    this.aqm = paramObjectInputStream.readInt();
    this.Ls = paramObjectInputStream.readInt();
    int i = paramObjectInputStream.readInt();
    this.AjV = new LinkedList();
    for (int j = 0; j < i; j++)
    {
      RectF localRectF = new RectF(paramObjectInputStream.readFloat(), paramObjectInputStream.readFloat(), paramObjectInputStream.readFloat(), paramObjectInputStream.readFloat());
      this.AjV.add(localRectF);
    }
  }

  private void writeObject(ObjectOutputStream paramObjectOutputStream)
  {
    paramObjectOutputStream.writeInt(this.aqm);
    paramObjectOutputStream.writeInt(this.Ls);
    paramObjectOutputStream.writeInt(this.AjV.size());
    Iterator localIterator = this.AjV.iterator();
    while (localIterator.hasNext())
    {
      RectF localRectF = (RectF)localIterator.next();
      paramObjectOutputStream.writeFloat(localRectF.left);
      paramObjectOutputStream.writeFloat(localRectF.top);
      paramObjectOutputStream.writeFloat(localRectF.right);
      paramObjectOutputStream.writeFloat(localRectF.bottom);
    }
  }

  public abstract void a(Canvas paramCanvas, TextPaint paramTextPaint, List<d> paramList);

  public final boolean ak(float paramFloat1, float paramFloat2)
  {
    boolean bool;
    if (this.AjV == null)
      bool = false;
    while (true)
    {
      return bool;
      Iterator localIterator = this.AjV.iterator();
      while (true)
        if (localIterator.hasNext())
          if (((RectF)localIterator.next()).contains(paramFloat1, paramFloat2))
          {
            bool = true;
            break;
          }
      bool = false;
    }
  }

  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramObject == null)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      bool2 = bool1;
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        bool2 = bool1;
        if (paramObject.aqm == this.aqm)
        {
          bool2 = bool1;
          if (paramObject.Ls == this.Ls)
          {
            for (int i = 0; ; i++)
            {
              if (i >= this.AjV.size())
                break label103;
              bool2 = bool1;
              if (!((RectF)this.AjV.get(i)).equals((RectF)paramObject.AjV.get(i)))
                break;
            }
            label103: bool2 = true;
          }
        }
      }
    }
  }

  final void fz(List<d> paramList)
  {
    if (this.AjV == null)
    {
      this.AjV = new LinkedList();
      paramList = paramList.iterator();
    }
    while (true)
    {
      d locald;
      if (paramList.hasNext())
      {
        locald = (d)paramList.next();
        if ((locald.aqm > this.aqm) || (this.Ls >= locald.Ls))
          break label87;
        this.AjV.add(locald.hR(this.aqm, this.Ls));
      }
      while (true)
      {
        return;
        label87: if ((locald.aqm <= this.aqm) && (this.aqm < locald.Ls) && (locald.Ls <= this.Ls))
        {
          this.AjV.add(locald.hR(this.aqm, locald.Ls));
          break;
        }
        if ((this.aqm >= locald.aqm) || (this.Ls >= locald.Ls) || (this.Ls < locald.aqm))
          break label199;
        this.AjV.add(locald.hR(locald.aqm, this.Ls));
      }
      label199: if ((this.aqm < locald.aqm) && (this.Ls >= locald.Ls))
        this.AjV.add(locald.hR(locald.aqm, locald.Ls));
    }
  }

  public int hashCode()
  {
    int i = 0;
    int j = 0;
    while (i < this.AjV.size())
    {
      j += ((RectF)this.AjV.get(i)).hashCode();
      i++;
    }
    return this.aqm + this.Ls + j;
  }

  public String toString()
  {
    return "CharacterBgStyle{mRectFList=" + this.AjV + ", mStart=" + this.aqm + ", mEnd=" + this.Ls + '}';
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.neattextview.textview.b.b
 * JD-Core Version:    0.6.2
 */