package com.tencent.sqlitelint;

import java.util.List;

public abstract interface IOnIssuePublishListener
{
  public abstract void onPublish(List<SQLiteLintIssue> paramList);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.sqlitelint.IOnIssuePublishListener
 * JD-Core Version:    0.6.2
 */