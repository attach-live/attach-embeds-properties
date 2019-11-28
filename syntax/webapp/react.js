import { Reactions } from 'attach-embeds-react'
​
export default () => (
  <Reactions properties={{
    'reactions:services': 'participants,videos,comments',
    'reactions:augmented-reality': true
  }} />
)
