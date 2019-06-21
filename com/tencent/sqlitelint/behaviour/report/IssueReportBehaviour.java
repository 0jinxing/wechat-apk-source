package com.tencent.sqlitelint.behaviour.report;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.sqlitelint.SQLiteLintIssue;
import com.tencent.sqlitelint.behaviour.BaseBehaviour;
import java.util.List;

public class IssueReportBehaviour extends BaseBehaviour
{
  private final IReportDelegate mReportDelegate;

  public IssueReportBehaviour(IReportDelegate paramIReportDelegate)
  {
    this.mReportDelegate = paramIReportDelegate;
  }

  public void onPublish(List<SQLiteLintIssue> paramList)
  {
    AppMethodBeat.i(94094);
    if (this.mReportDelegate != null)
      for (int i = 0; i < paramList.size(); i++)
        this.mReportDelegate.report((SQLiteLintIssue)paramList.get(i));
    AppMethodBeat.o(94094);
  }

  public static abstract interface IReportDelegate
  {
    public abstract void report(SQLiteLintIssue paramSQLiteLintIssue);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.sqlitelint.behaviour.report.IssueReportBehaviour
 * JD-Core Version:    0.6.2
 */