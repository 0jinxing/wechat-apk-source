package com.tencent.sqlitelint.behaviour.persistence;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.sqlitelint.SQLiteLintIssue;
import com.tencent.sqlitelint.behaviour.BaseBehaviour;
import java.util.List;

public class PersistenceBehaviour extends BaseBehaviour
{
  public void onPublish(List<SQLiteLintIssue> paramList)
  {
    AppMethodBeat.i(94078);
    IssueStorage.saveIssues(paramList);
    AppMethodBeat.o(94078);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.sqlitelint.behaviour.persistence.PersistenceBehaviour
 * JD-Core Version:    0.6.2
 */