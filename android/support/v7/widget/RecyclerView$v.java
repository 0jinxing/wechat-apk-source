package android.support.v7.widget;

import android.support.v4.view.s;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class RecyclerView$v
{
  private static final List<Object> apR = Collections.EMPTY_LIST;
  private int Dj;
  public final View apJ;
  WeakReference<RecyclerView> apK;
  int apL = -1;
  public long apM = -1L;
  public int apN = -1;
  int apO = -1;
  v apP = null;
  v apQ = null;
  List<Object> apS = null;
  List<Object> apT = null;
  private int apU = 0;
  private RecyclerView.o apV = null;
  private boolean apW = false;
  private int apX = 0;
  int apY = -1;
  RecyclerView apZ;
  int mPosition = -1;

  public RecyclerView$v(View paramView)
  {
    if (paramView == null)
      throw new IllegalArgumentException("itemView may not be null");
    this.apJ = paramView;
  }

  private void kt()
  {
    if (this.apS == null)
    {
      this.apS = new ArrayList();
      this.apT = Collections.unmodifiableList(this.apS);
    }
  }

  final void O(Object paramObject)
  {
    if (paramObject == null)
      addFlags(1024);
    while (true)
    {
      return;
      if ((this.Dj & 0x400) == 0)
      {
        kt();
        this.apS.add(paramObject);
      }
    }
  }

  final void a(RecyclerView.o paramo, boolean paramBoolean)
  {
    this.apV = paramo;
    this.apW = paramBoolean;
  }

  final void addFlags(int paramInt)
  {
    this.Dj |= paramInt;
  }

  public final void ao(boolean paramBoolean)
  {
    int i;
    if (paramBoolean)
    {
      i = this.apU - 1;
      this.apU = i;
      if (this.apU >= 0)
        break label53;
      this.apU = 0;
      new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ").append(this);
    }
    while (true)
    {
      return;
      i = this.apU + 1;
      break;
      label53: if ((!paramBoolean) && (this.apU == 1))
        this.Dj |= 16;
      else if ((paramBoolean) && (this.apU == 0))
        this.Dj &= -17;
    }
  }

  final boolean cx(int paramInt)
  {
    if ((this.Dj & paramInt) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  @Deprecated
  public final int getPosition()
  {
    if (this.apO == -1);
    for (int i = this.mPosition; ; i = this.apO)
      return i;
  }

  final boolean isBound()
  {
    if ((this.Dj & 0x1) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isRemoved()
  {
    if ((this.Dj & 0x8) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void kf()
  {
    this.apL = -1;
    this.apO = -1;
  }

  final void kg()
  {
    if (this.apL == -1)
      this.apL = this.mPosition;
  }

  final boolean kh()
  {
    if ((this.Dj & 0x80) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int ki()
  {
    if (this.apO == -1);
    for (int i = this.mPosition; ; i = this.apO)
      return i;
  }

  public final int kj()
  {
    if (this.apZ == null);
    for (int i = -1; ; i = this.apZ.i(this))
      return i;
  }

  public final int kk()
  {
    return this.apN;
  }

  final boolean kl()
  {
    if (this.apV != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void km()
  {
    this.apV.t(this);
  }

  final boolean kn()
  {
    if ((this.Dj & 0x20) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void ko()
  {
    this.Dj &= -33;
  }

  final void kp()
  {
    this.Dj &= -257;
  }

  final boolean kq()
  {
    if ((this.Dj & 0x4) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final boolean kr()
  {
    if ((this.Dj & 0x2) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final boolean ks()
  {
    if ((this.Dj & 0x100) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void ku()
  {
    if (this.apS != null)
      this.apS.clear();
    this.Dj &= -1025;
  }

  final List<Object> kv()
  {
    List localList;
    if ((this.Dj & 0x400) == 0)
      if ((this.apS == null) || (this.apS.size() == 0))
        localList = apR;
    while (true)
    {
      return localList;
      localList = this.apT;
      continue;
      localList = apR;
    }
  }

  public final boolean kw()
  {
    if (((this.Dj & 0x10) == 0) && (!s.Q(this.apJ)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final boolean kx()
  {
    if ((this.Dj & 0x2) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void o(int paramInt, boolean paramBoolean)
  {
    if (this.apL == -1)
      this.apL = this.mPosition;
    if (this.apO == -1)
      this.apO = this.mPosition;
    if (paramBoolean)
      this.apO += paramInt;
    this.mPosition += paramInt;
    if (this.apJ.getLayoutParams() != null)
      ((RecyclerView.LayoutParams)this.apJ.getLayoutParams()).aoN = true;
  }

  final void resetInternal()
  {
    this.Dj = 0;
    this.mPosition = -1;
    this.apL = -1;
    this.apM = -1L;
    this.apO = -1;
    this.apU = 0;
    this.apP = null;
    this.apQ = null;
    ku();
    this.apX = 0;
    this.apY = -1;
    RecyclerView.h(this);
  }

  final void setFlags(int paramInt1, int paramInt2)
  {
    this.Dj = (this.Dj & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
  }

  public String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.apM + ", oldPos=" + this.apL + ", pLpos:" + this.apO);
    String str;
    if (kl())
    {
      StringBuilder localStringBuilder2 = localStringBuilder1.append(" scrap ");
      if (this.apW)
      {
        str = "[changeScrap]";
        localStringBuilder2.append(str);
      }
    }
    else
    {
      if (kq())
        localStringBuilder1.append(" invalid");
      if (!isBound())
        localStringBuilder1.append(" unbound");
      if (kr())
        localStringBuilder1.append(" update");
      if (isRemoved())
        localStringBuilder1.append(" removed");
      if (kh())
        localStringBuilder1.append(" ignored");
      if (ks())
        localStringBuilder1.append(" tmpDetached");
      if (!kw())
        localStringBuilder1.append(" not recyclable(" + this.apU + ")");
      if (((this.Dj & 0x200) == 0) && (!kq()))
        break label309;
    }
    label309: for (int i = 1; ; i = 0)
    {
      if (i != 0)
        localStringBuilder1.append(" undefined adapter position");
      if (this.apJ.getParent() == null)
        localStringBuilder1.append(" no parent");
      localStringBuilder1.append("}");
      return localStringBuilder1.toString();
      str = "[attachedScrap]";
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView.v
 * JD-Core Version:    0.6.2
 */