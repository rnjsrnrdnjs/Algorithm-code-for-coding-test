def solution(record):
    answer = []
    trace = []
    Map = {} 

    for i in range(len(record)):
        temp = record[i].split(' ')
 
        if temp[0] == 'Enter':
            Map[temp[1]] = temp[2]
            trace.append([temp[0], temp[1]])
        elif temp[0] == 'Leave':
            trace.append([temp[0], temp[1]])
        else:
            Map[temp[1]] = temp[2]

    for i in range(len(trace)):
          if trace[i][0] == 'Enter':
                result = Map[trace[i][1]] + "님이 들어왔습니다."
                answer.append(result)
          else:
                result = Map[trace[i][1]] + "님이 나갔습니다."
                answer.append(result)

    return answer