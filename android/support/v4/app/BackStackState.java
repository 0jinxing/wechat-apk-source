package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;

final class BackStackState
  implements Parcelable
{
  public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator()
  {
  };
  final int Ca;
  final int Cb;
  final int Cf;
  final CharSequence Cg;
  final int Ch;
  final CharSequence Ci;
  final ArrayList<String> Cj;
  final ArrayList<String> Ck;
  final boolean Cl;
  final int[] Cs;
  final int mIndex;
  final String mName;

  public BackStackState(Parcel paramParcel)
  {
    this.Cs = paramParcel.createIntArray();
    this.Ca = paramParcel.readInt();
    this.Cb = paramParcel.readInt();
    this.mName = paramParcel.readString();
    this.mIndex = paramParcel.readInt();
    this.Cf = paramParcel.readInt();
    this.Cg = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.Ch = paramParcel.readInt();
    this.Ci = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.Cj = paramParcel.createStringArrayList();
    this.Ck = paramParcel.createStringArrayList();
    if (paramParcel.readInt() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.Cl = bool;
      return;
    }
  }

  public BackStackState(b paramb)
  {
    int i = paramb.BV.size();
    this.Cs = new int[i * 6];
    if (!paramb.Cc)
      throw new IllegalStateException("Not on back stack");
    int j = 0;
    int k = 0;
    if (j < i)
    {
      b.a locala = (b.a)paramb.BV.get(j);
      int[] arrayOfInt = this.Cs;
      int m = k + 1;
      arrayOfInt[k] = locala.Cn;
      arrayOfInt = this.Cs;
      int n = m + 1;
      if (locala.fragment != null);
      for (k = locala.fragment.mIndex; ; k = -1)
      {
        arrayOfInt[m] = k;
        arrayOfInt = this.Cs;
        m = n + 1;
        arrayOfInt[n] = locala.Co;
        arrayOfInt = this.Cs;
        k = m + 1;
        arrayOfInt[m] = locala.Cp;
        arrayOfInt = this.Cs;
        n = k + 1;
        arrayOfInt[k] = locala.Cq;
        arrayOfInt = this.Cs;
        k = n + 1;
        arrayOfInt[n] = locala.Cr;
        j++;
        break;
      }
    }
    this.Ca = paramb.Ca;
    this.Cb = paramb.Cb;
    this.mName = paramb.mName;
    this.mIndex = paramb.mIndex;
    this.Cf = paramb.Cf;
    this.Cg = paramb.Cg;
    this.Ch = paramb.Ch;
    this.Ci = paramb.Ci;
    this.Cj = paramb.Cj;
    this.Ck = paramb.Ck;
    this.Cl = paramb.Cl;
  }

  public final b a(FragmentManagerImpl paramFragmentManagerImpl)
  {
    b localb = new b(paramFragmentManagerImpl);
    int i = 0;
    int j = 0;
    if (j < this.Cs.length)
    {
      b.a locala = new b.a();
      int[] arrayOfInt = this.Cs;
      int k = j + 1;
      locala.Cn = arrayOfInt[j];
      if (FragmentManagerImpl.DEBUG)
        new StringBuilder("Instantiate ").append(localb).append(" op #").append(i).append(" base fragment #").append(this.Cs[k]);
      arrayOfInt = this.Cs;
      j = k + 1;
      k = arrayOfInt[k];
      if (k >= 0);
      for (locala.fragment = ((Fragment)paramFragmentManagerImpl.mActive.get(k)); ; locala.fragment = null)
      {
        arrayOfInt = this.Cs;
        k = j + 1;
        locala.Co = arrayOfInt[j];
        arrayOfInt = this.Cs;
        j = k + 1;
        locala.Cp = arrayOfInt[k];
        arrayOfInt = this.Cs;
        k = j + 1;
        locala.Cq = arrayOfInt[j];
        arrayOfInt = this.Cs;
        j = k + 1;
        locala.Cr = arrayOfInt[k];
        localb.BW = locala.Co;
        localb.BX = locala.Cp;
        localb.BY = locala.Cq;
        localb.BZ = locala.Cr;
        localb.a(locala);
        i++;
        break;
      }
    }
    localb.Ca = this.Ca;
    localb.Cb = this.Cb;
    localb.mName = this.mName;
    localb.mIndex = this.mIndex;
    localb.Cc = true;
    localb.Cf = this.Cf;
    localb.Cg = this.Cg;
    localb.Ch = this.Ch;
    localb.Ci = this.Ci;
    localb.Cj = this.Cj;
    localb.Ck = this.Ck;
    localb.Cl = this.Cl;
    localb.aq(1);
    return localb;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = 0;
    paramParcel.writeIntArray(this.Cs);
    paramParcel.writeInt(this.Ca);
    paramParcel.writeInt(this.Cb);
    paramParcel.writeString(this.mName);
    paramParcel.writeInt(this.mIndex);
    paramParcel.writeInt(this.Cf);
    TextUtils.writeToParcel(this.Cg, paramParcel, 0);
    paramParcel.writeInt(this.Ch);
    TextUtils.writeToParcel(this.Ci, paramParcel, 0);
    paramParcel.writeStringList(this.Cj);
    paramParcel.writeStringList(this.Ck);
    if (this.Cl)
      paramInt = 1;
    paramParcel.writeInt(paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.BackStackState
 * JD-Core Version:    0.6.2
 */