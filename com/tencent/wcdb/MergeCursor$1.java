package com.tencent.wcdb;

import android.database.DataSetObserver;

class MergeCursor$1 extends DataSetObserver
{
  MergeCursor$1(MergeCursor paramMergeCursor)
  {
  }

  public void onChanged()
  {
    this.this$0.mPos = -1;
  }

  public void onInvalidated()
  {
    this.this$0.mPos = -1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.MergeCursor.1
 * JD-Core Version:    0.6.2
 */